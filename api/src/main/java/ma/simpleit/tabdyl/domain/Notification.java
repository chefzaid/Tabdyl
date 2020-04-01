package ma.simpleit.tabdyl.domain;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ma.simpleit.tabdyl.domain.enumeration.NotificationEvent;
import ma.simpleit.tabdyl.domain.enumeration.NotificationStatus;

@Entity
@Data
@EqualsAndHashCode(callSuper=true)
public class Notification extends BaseEntity {
	
	@Enumerated
	private NotificationEvent event;
	private String message;
	@ManyToOne
	private User user;
	@Enumerated
	private NotificationStatus status;

}
