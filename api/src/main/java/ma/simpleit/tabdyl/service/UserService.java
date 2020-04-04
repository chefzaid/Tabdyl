package ma.simpleit.tabdyl.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.apachecommons.CommonsLog;
import ma.simpleit.tabdyl.domain.User;
import ma.simpleit.tabdyl.repository.UserRepository;

@Service
@CommonsLog
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void createAccount(User user) {
		log.debug("Creating user with email: " + user.getEmail());
		userRepository.save(user);
	}
	
	@Transactional
	public User getUser(String email) {
		log.debug("Retrieving email: " + email);
		return userRepository.findByEmail(email);
	}
	
	@Transactional
	public void deactivateUser(String email) {
		userRepository.deactivate(email);
	}
}
