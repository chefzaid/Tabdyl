package ma.simpleit.tabdyl.domain;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ma.simpleit.tabdyl.domain.enumeration.TransactionStatus;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Transaction extends BaseEntity {

	@ManyToOne
	private Ad ad;
	@OneToOne
	private Offer offer;
	@Enumerated
	private TransactionStatus status;
}
