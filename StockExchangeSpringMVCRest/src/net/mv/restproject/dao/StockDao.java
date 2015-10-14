package net.mv.restproject.dao;

import net.mv.restproject.pojos.Stock;
import net.mv.restproject.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StockDao {

	public Stock retrieveStock(String stockName){
	
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Stock stockToReturn = new Stock();
		
		Query query = session.createQuery("from Stock where stockinfo = :stockName");
		query.setParameter("stockName", stockName);

		if((Stock) query.uniqueResult() != null){
			stockToReturn = (Stock) query.uniqueResult();
		};

		tx.commit();
		session.close();
		
		return stockToReturn;
		
	}
	
	
	public void addStock(String stockInfo, double d){
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Stock stock = new Stock();
		stock.setStockValue(d);
		stock.setStockName(stockInfo);
		
        session.save(stock);

		tx.commit();
		session.close();
		
	}
	
	
}
