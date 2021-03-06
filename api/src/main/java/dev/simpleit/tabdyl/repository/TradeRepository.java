package dev.simpleit.tabdyl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.simpleit.tabdyl.domain.Trade;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long>{

}
