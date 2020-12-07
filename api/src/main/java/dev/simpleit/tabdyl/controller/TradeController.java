package dev.simpleit.tabdyl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.simpleit.tabdyl.domain.Trade;
import dev.simpleit.tabdyl.service.TradeService;

@RestController
@RequestMapping("trade")
@CrossOrigin(origins = "*")
public class TradeController {

	@Autowired
	private TradeService tradeService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> save(Trade trade) {
		tradeService.save(trade);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Trade>> findAll() {
		List<Trade> result = tradeService.findAll();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
}
