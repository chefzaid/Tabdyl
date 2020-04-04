package ma.simpleit.tabdyl.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import ma.simpleit.tabdyl.controller.UserController;

@Configuration
@ApplicationPath("/api")
public class RestConfig extends ResourceConfig {
	
	public RestConfig() {
		register(UserController.class);
	}

}
