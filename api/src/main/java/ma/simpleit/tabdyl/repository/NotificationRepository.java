package ma.simpleit.tabdyl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.simpleit.tabdyl.domain.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
