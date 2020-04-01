package ma.simpleit.tabdyl.domain;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ma.simpleit.tabdyl.domain.enumeration.Gender;
import ma.simpleit.tabdyl.domain.enumeration.IdDocumentType;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class User extends BaseEntity {
	
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private LocalDate birthdate;
	@Enumerated
	private Gender gender;
	private String address;
	private String city;
	private String zipCode;
	private String country;
	private String nationality;
	private String phoneNumber;
	@Enumerated
	private IdDocumentType idDocumentType;
	private File idDocument;
	private File photo;
	@OneToMany
	List<BankAccount> bankAccounts;
	@OneToMany
	List<Review> reviews;
	private LocalDateTime lastConnectionDate;

}
