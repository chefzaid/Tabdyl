package dev.simpleit.tabdyl.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import dev.simpleit.tabdyl.domain.enumeration.NotificationEvent;
import dev.simpleit.tabdyl.domain.enumeration.NotificationStatus;
import lombok.Data;

@Entity
@Data
public class Notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Enumerated
	private NotificationEvent event;
	private String message;
	@ManyToOne
	private User user;
	@Enumerated
	private NotificationStatus status;
	@CreatedDate
	private LocalDateTime creationDate;

}
