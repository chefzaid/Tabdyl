package dev.simpleit.tabdyl.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import dev.simpleit.tabdyl.domain.User;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSession {

	private User user;
	private String token;
	private Long expiry;
	
}
