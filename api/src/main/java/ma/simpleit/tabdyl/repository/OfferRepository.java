package ma.simpleit.tabdyl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.simpleit.tabdyl.domain.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {

}
