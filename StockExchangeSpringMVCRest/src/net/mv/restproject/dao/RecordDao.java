package net.mv.restproject.dao;

import net.mv.restproject.pojos.Record;
import net.mv.restproject.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class RecordDao {

	public void addRecord(Record record) {
		
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		session.save(record);
		
		tx.commit();
		session.close();
	}
}
