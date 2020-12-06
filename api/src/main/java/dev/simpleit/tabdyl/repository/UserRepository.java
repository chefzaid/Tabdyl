package dev.simpleit.tabdyl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dev.simpleit.tabdyl.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	User findByUsername(String username);
	
	@Query("update User u set u.deactivated = 1 where u.email = ?1")
	void deactivate(String email);

}
