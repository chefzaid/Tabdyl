package ma.simpleit.tabdyl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.simpleit.tabdyl.domain.User;
import ma.simpleit.tabdyl.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void createAccount(User user) {
		// TODO fill data from frontend
		userRepository.save(user);
	}
	
	public User getUser(String email) {
		// TODO preprocessing
		return userRepository.findByEmail(email);
	}
}
