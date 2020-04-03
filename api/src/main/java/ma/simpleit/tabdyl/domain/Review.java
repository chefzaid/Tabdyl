package ma.simpleit.tabdyl.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Entity
@Data
public class Review {
	
	@Id
	private Long id;
	private Integer stars;
	private String comment;
	private Boolean trusted;
	@ManyToOne
	private User from;
	@ManyToOne
	private User to;
	@CreatedDate
	private LocalDateTime creationDate;

}
