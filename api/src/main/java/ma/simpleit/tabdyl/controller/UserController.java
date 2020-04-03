package ma.simpleit.tabdyl.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ma.simpleit.tabdyl.domain.User;
import ma.simpleit.tabdyl.service.UserService;

@RestController
@Path("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@POST
	public void createAccount(User user) {
		// TODO preprocessing
		userService.createAccount(user);
	}
	
	@GET
	@Path("/{email}")
	public User getUser(@PathParam("email") String email) {
		// TODO preprocessing
		return userService.getUser(email);
	}
	
}
