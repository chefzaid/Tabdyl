package dev.simpleit.tabdyl.domain;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import dev.simpleit.tabdyl.domain.enumeration.Gender;
import dev.simpleit.tabdyl.domain.enumeration.IdDocumentType;
import dev.simpleit.tabdyl.domain.enumeration.Tier;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, unique = true)
	private String username;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String firstname;
	@Column(nullable = false)
	private String lastname;
	@Column(nullable = false)
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
	@Column(unique = true)
	private File idDocument;
	@Column(unique = true)
	private File photo;
	@OneToMany
	List<BankAccount> bankAccounts;
	@OneToMany
	List<Review> reviews;
	@Enumerated
	private Tier tier;
	private LocalDateTime lastConnectionDate;
	@CreatedDate
	private LocalDateTime creationDate;
	@LastModifiedDate
	private LocalDateTime lastUpdateDate;
	private Boolean deactivated;

}
