package net.mv.restproject.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import net.mv.restproject.dao.StockDao;
import net.mv.restproject.pojos.Stock;

@Path("stock")
@Component
public class StockService {

	StockDao dao = new StockDao();
	
	@Path("retrieve/{stockId}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Stock retrieveStock(@PathParam(value="stockId") String stockName){
		Stock stock = new Stock();
		stock.setStockName(stockName);
		Stock stockReturned = dao.retrieveStock(stock.getStockName());
		
		System.out.println("STOCK RETURNED FROM DB:::: " + stockReturned);
		
		return stockReturned;
	}
	
//	@Path("retrieveById/{id}")
//	@Produces(MediaType.APPLICATION_JSON)
//	@GET
//	public Stock retrieveStockById(@PathParam(value="id") long id){
//		Stock stock = new Stock();
//		
//		stock.setsId(id);
//		stock.setStockName("Your stock");
//		stock.setStockValue(0);
//		
//		return stock;
//	}
	
	@Path("create")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createStock(Stock stock){
		dao.addStock(stock.getStockName(), stock.getStockValue());
		System.out.println(stock);
		
	}
	
}
