package ma.simpleit.tabdyl.domain;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ma.simpleit.tabdyl.domain.enumeration.PaymentMethod;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Offer extends BaseEntity {
	
	private String description;
	private Double exchangeRate;
	@Enumerated
	private PaymentMethod paymentMethod;
	private User user;

}
