package ma.simpleit.tabdyl.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class BaseEntity {
	
	private Long id;
	private LocalDateTime creationDate;
	private LocalDateTime lastUpdateDate;

}
