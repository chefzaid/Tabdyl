package ma.simpleit.tabdyl.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import ma.simpleit.tabdyl.domain.enumeration.NotificationEvent;
import ma.simpleit.tabdyl.domain.enumeration.NotificationStatus;

@Entity
@Data
public class Notification {
	
	@Id
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
