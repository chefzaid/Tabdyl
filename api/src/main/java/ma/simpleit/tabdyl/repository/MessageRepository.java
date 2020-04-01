package ma.simpleit.tabdyl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.simpleit.tabdyl.domain.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
