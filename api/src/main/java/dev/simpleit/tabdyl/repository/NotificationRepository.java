package dev.simpleit.tabdyl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.simpleit.tabdyl.domain.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
