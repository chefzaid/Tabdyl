package ma.simpleit.tabdyl.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import ma.simpleit.tabdyl.domain.enumeration.PaymentMethod;

@Entity
@Data
public class Offer {
	
	@Id
	private Long id;
	private String description;
	private Double exchangeRate;
	@Enumerated
	private PaymentMethod paymentMethod;
	@ManyToOne
	private User user;
	@CreatedDate
	private LocalDateTime creationDate;

}
