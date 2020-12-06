package dev.simpleit.tabdyl.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserSession {

	private User user;
	private String token;
	private Long expiry;
	
}
