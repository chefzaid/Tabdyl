package ma.simpleit.tabdyl.domain;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ma.simpleit.tabdyl.domain.enumeration.MessageStatus;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Message extends BaseEntity {
	
	private String message;
	@ManyToOne
	private Ad ad;
	@ManyToOne
	private Offer offer;
	@Enumerated
	private MessageStatus status;

}
