package ma.simpleit.tabdyl.domain;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ma.simpleit.tabdyl.domain.enumeration.Currency;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class BankAccount extends BaseEntity {
	
	private String label;
	private String bankName;
	private String address;
	private String country;
	@Enumerated
	private Currency currency;
	private String iban;
	private String swift;

}
