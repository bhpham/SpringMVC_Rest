package net.mv.restproject.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import net.mv.restproject.pojos.Stock;

import org.glassfish.jersey.client.ClientConfig;

public class StockClient {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient(new ClientConfig());

		String stockName = "MV";
		
		Stock deeStock = client
				.target("http://localhost:9090/StockExchangeREST/rest/stock/retrieve/" + stockName)
					.request()
						.get(Stock.class);
		
//		client.target("http://localhost:9090/JerseyExample/rest/stock/create")
//				.request()
//					.post(Entity.entity(stock, MediaType.APPLICATION_JSON));
	
		System.out.println("STOCK FROM DB HERE::::: " + deeStock);
	}

}
