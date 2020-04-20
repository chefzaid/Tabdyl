package ma.simpleit.tabdyl.controller;

import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

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
	public Response createUser(User user) {
		userService.saveUser(user);
		return Response.ok().build();
	}
	
	@GET
	@Path("/{email}")
	public User getUser(@PathParam("email") String email) {
		return userService.getUser(email);
	}
	
	@PATCH
	@Path("/{email}")
	public Response deactivateUser(@PathParam("email") String email) {
		userService.deactivateUser(email);
		return Response.ok().build();
	}
	
	@POST
	@Path("/login/{email}/{password}")
	public Response login(@PathParam("email") String email, @PathParam("password") String password) {
		return Response.ok().build();
	}
	
	@POST
	@Path("/logout/{email}")
	public Response logout(@PathParam("email") String email) {
		return Response.ok().build();
	}
	
}
