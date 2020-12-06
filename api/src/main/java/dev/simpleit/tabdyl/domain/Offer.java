package dev.simpleit.tabdyl.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import dev.simpleit.tabdyl.domain.enumeration.OfferStatus;
import dev.simpleit.tabdyl.domain.enumeration.PaymentMethod;
import lombok.Data;

@Entity
@Data
public class Offer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
	private Double exchangeRate;
	private Double amountToFulfill;
	@Enumerated
	private PaymentMethod paymentMethod;
	@ManyToOne
	private User user;
	@Enumerated
	private OfferStatus status;
	@CreatedDate
	private LocalDateTime creationDate;

}
