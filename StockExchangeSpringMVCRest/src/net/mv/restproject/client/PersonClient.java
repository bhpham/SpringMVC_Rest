package net.mv.restproject.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import net.mv.restproject.pojos.Person;

import org.glassfish.jersey.client.ClientConfig;

public class PersonClient {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient(new ClientConfig());

//		String stockName = "MV";
//		
//		Stock deeStock = client
//				.target("http://localhost:9090/StockExchangeREST/rest/stock/retrieve/" + stockName)
//					.request()
//						.get(Stock.class);

//		System.out.println("STOCK FROM DB HERE::::: " + deeStock);
		
		Person person = new Person();
		person.setName("ASHISH");
		person.setHoldings(0.0);
		
		client.target("http://localhost:9090/StockExchangeSpringMVCRest/restproject/person/create")
				.request()
					.post(Entity.entity(person, MediaType.APPLICATION_JSON));
	

	}

}
