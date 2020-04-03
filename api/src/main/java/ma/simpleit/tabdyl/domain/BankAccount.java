package ma.simpleit.tabdyl.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;
import ma.simpleit.tabdyl.domain.enumeration.Currency;

@Entity
@Data
public class BankAccount {
	
	@Id
	private Long id;
	private String label;
	private String bankName;
	private String address;
	private String country;
	@Enumerated
	private Currency currency;
	private String iban;
	private String swift;
	@CreatedDate
	private LocalDateTime creationDate;
	@LastModifiedDate
	private LocalDateTime lastUpdateDate;

}
