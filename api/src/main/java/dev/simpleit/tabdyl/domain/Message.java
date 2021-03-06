package dev.simpleit.tabdyl.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import dev.simpleit.tabdyl.domain.enumeration.MessageStatus;
import lombok.Data;

@Entity
@Data
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
