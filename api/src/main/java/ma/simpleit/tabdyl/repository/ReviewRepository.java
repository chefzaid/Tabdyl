package ma.simpleit.tabdyl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.simpleit.tabdyl.domain.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}
