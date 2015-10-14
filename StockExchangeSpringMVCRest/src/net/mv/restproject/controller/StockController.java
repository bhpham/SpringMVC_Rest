package net.mv.restproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.mv.restproject.pojos.Person;
import net.mv.restproject.pojos.Stock;
import net.mv.restproject.service.PersonService;
import net.mv.restproject.service.StockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="stock")
public class StockController {

	@Autowired
	StockService service;
	
	@Autowired
	PersonService pService;
	
	
	@RequestMapping(value="add", method=RequestMethod.GET)
	public ResponseEntity<Stock> addStock(HttpServletRequest req, Stock stock){
		
		HttpSession session = req.getSession();
		Person person = new Person();
		person.setName("binh");
		Person binh = pService.retrievePerson(person);
		Stock mangl = new Stock();
		mangl.setStockName("Mangl");
		mangl.setPerson(binh);
		mangl.setStockValue(200.0);
		service.createStock(mangl);
		
		System.out.println(service.retrieveStock("Mangl"));
		
		return new ResponseEntity<Stock>(stock, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="retrieve", method=RequestMethod.POST)
	public ResponseEntity<Stock> getStock(Stock stock){
		
		Stock stockFromDB = service.retrieveStock(stock.getStockName());
		
		
		return new ResponseEntity<Stock>(stockFromDB, HttpStatus.CREATED);
	}
}