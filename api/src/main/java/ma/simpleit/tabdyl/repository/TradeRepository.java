package ma.simpleit.tabdyl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.simpleit.tabdyl.domain.Trade;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long>{

}
