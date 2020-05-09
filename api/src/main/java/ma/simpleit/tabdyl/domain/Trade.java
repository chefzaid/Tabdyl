package ma.simpleit.tabdyl.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import ma.simpleit.tabdyl.domain.enumeration.Currency;
import ma.simpleit.tabdyl.domain.enumeration.EscrowMode;
import ma.simpleit.tabdyl.domain.enumeration.FulfillmentMode;
import ma.simpleit.tabdyl.domain.enumeration.PaymentMethod;
import ma.simpleit.tabdyl.domain.enumeration.TradeStatus;

@Entity
@Data
public class Trade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	@Enumerated
	private FulfillmentMode fulfilmentMode;
	@Enumerated
	private TradeStatus status;
	@ManyToOne
	private User user;
	@CreatedDate
	private LocalDateTime creationDate;

}
