package ma.simpleit.tabdyl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.simpleit.tabdyl.domain.Ad;

@Repository
public interface AdRepository extends JpaRepository<Ad, Long>{

}
