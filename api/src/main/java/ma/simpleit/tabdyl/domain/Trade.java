package ma.simpleit.tabdyl.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import ma.simpleit.tabdyl.domain.enumeration.Currency;
import ma.simpleit.tabdyl.domain.enumeration.EscrowMode;
import ma.simpleit.tabdyl.domain.enumeration.PaymentMethod;

@Entity
@Data
public class Trade {

	@Id
	private Long id;
	private String title;
	private String description;
	private Double amount;
	@Enumerated
	private Currency baseCurrency;
	@Enumerated
	private Currency targetCurrency;
	private Double exchangeRate;
	@ElementCollection(targetClass = PaymentMethod.class)
	private List<PaymentMethod> acceptedPaymentMethods;
	@Enumerated
	private EscrowMode escrowMode;
	private Boolean active;
	@ManyToOne
	private User user;
	@CreatedDate
	private LocalDateTime creationDate;

}
