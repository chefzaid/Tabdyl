package dev.simpleit.tabdyl.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.simpleit.tabdyl.domain.Trade;
import dev.simpleit.tabdyl.domain.enumeration.Currency;
import dev.simpleit.tabdyl.domain.enumeration.PaymentMethod;
import dev.simpleit.tabdyl.repository.TradeRepository;
import lombok.extern.apachecommons.CommonsLog;

@Service
@CommonsLog
public class TradeService {

	@Autowired
	private TradeRepository tradeRepository;

	@Transactional
	public void save(Trade trade) {
		log.debug("Saving...");
		tradeRepository.save(trade);
	}
	
	@Transactional
	public List<Trade> findAll() {
		return tradeRepository.findAll();
	}
	
	@Transactional
	public List<Trade> findByUser(String email) {
		return null;
	}
	
	@Transactional
	public List<Trade> findByCountry(String country) {
		return null;
	}
	
	@Transactional
	public List<Trade> findByPaymentMethod(PaymentMethod patmentMethod) {
		return null;
	}
	
	@Transactional
	public List<Trade> findByTargetCurrency(Currency currency) {
		return null;
	}
}
