package dev.simpleit.tabdyl.service;

import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import lombok.extern.apachecommons.CommonsLog;
import dev.simpleit.tabdyl.beans.UserSession;
import dev.simpleit.tabdyl.config.AppConfig;
import dev.simpleit.tabdyl.domain.User;
import dev.simpleit.tabdyl.repository.UserRepository;
import dev.simpleit.tabdyl.util.SessionManager;

@Service
@CommonsLog
public class UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AppConfig appConfig;

	private static SessionManager<String, UserSession> sessionManager;

	@PostConstruct
	public void init() {
		sessionManager = new SessionManager<>(
				appConfig.getSessionTtl(), 
				appConfig.getSessionTimer(),
				appConfig.getSessionMaxItems());
	}

	@Transactional
	public void save(User user) {
		log.debug("Creating user with email: " + user.getEmail());
		userRepository.save(user);
	}

	@Transactional
	public User findByEmail(String email) {
		log.debug("Retrieving email: " + email);
		return userRepository.findByEmail(email);
	}

	@Transactional
	public void deactivateUser(String email) {
		userRepository.deactivate(email);
	}

	public UserSession login(User user) {
		UserSession userSession = new UserSession();
		if (isValidUser(user)) {
			String userToken = UUID.randomUUID().toString();
			userSession.setUser(user);
			userSession.setToken(userToken);
			userSession.setExpiry(System.currentTimeMillis() + appConfig.getSessionTtl());
			sessionManager.put(userToken, userSession);
		}
		return userSession;
	}

	public void logout(String userToken) {
		sessionManager.remove(userToken);
	}

	@Transactional
	public boolean isValidUser(User user) {
		boolean result = false;
		User userOnDb = userRepository.findByEmail(user.getEmail());
		if (userOnDb != null) {
			String passwordHash = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
			if (passwordHash.equals(userOnDb.getPassword())) {
				result = true;
			}
		}
		return result;
	}

	public boolean isValidUserToken(String userToken) {
		return sessionManager.get(userToken) != null
				&& sessionManager.get(userToken).getExpiry() > System.currentTimeMillis();
	}
}
