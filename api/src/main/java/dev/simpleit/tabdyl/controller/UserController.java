package dev.simpleit.tabdyl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.simpleit.tabdyl.domain.User;
import dev.simpleit.tabdyl.domain.UserSession;
import dev.simpleit.tabdyl.service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(User user) {
		userService.saveUser(user);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<User> getUser(@RequestParam("email") String email) {
		User result = userService.getUser(email);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<UserSession> login(User user) {
		UserSession result = userService.login(user);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PATCH, value="/logout")
	public ResponseEntity<Void> logout(@RequestParam("userToken") String userToken) {
		userService.logout(userToken);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.DELETE, value="/deactivate")
	public ResponseEntity<Void> deactivateUser(@RequestParam("email") String email) {
		userService.deactivateUser(email);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
