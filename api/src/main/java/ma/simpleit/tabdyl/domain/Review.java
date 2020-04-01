package ma.simpleit.tabdyl.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Review extends BaseEntity {
	
	private Integer stars;
	private String comment;
	private Boolean trusted;
	@ManyToOne
	private User from;
	@ManyToOne
	private User to;

}
