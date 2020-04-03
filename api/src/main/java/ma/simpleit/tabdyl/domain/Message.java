package ma.simpleit.tabdyl.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import ma.simpleit.tabdyl.domain.enumeration.MessageStatus;

@Entity
@Data
public class Message {
	
	@Id
	private Long id;
	private String message;
	@ManyToOne
	private Trade trade;
	@ManyToOne
	private User sender;
	@Enumerated
	private MessageStatus status;
	@CreatedDate
	private LocalDateTime creationDate;

}
