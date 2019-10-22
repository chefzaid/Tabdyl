package ma.simpleit.tabdyl.domain;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class User {
	
	private String email;
	private String password;

}
