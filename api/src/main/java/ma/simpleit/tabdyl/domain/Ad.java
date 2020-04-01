package ma.simpleit.tabdyl.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ma.simpleit.tabdyl.domain.enumeration.Currency;
import ma.simpleit.tabdyl.domain.enumeration.PaymentMethod;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Ad extends BaseEntity {
	
	private String title;
	private String description;
	private Double amount;
	@Enumerated
	private Currency baseCurrency;
	@Enumerated
	private Currency targetCurrency;
	private Double exchangeRate;
	@ManyToMany
	private List<PaymentMethod> acceptedPaymentMethods;
	private Boolean active;
	@ManyToOne
	private User user;

}
