package net.mv.restproject.dao;

import net.mv.restproject.pojos.Person;
import net.mv.restproject.util.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersonDao {

	public void addPerson(Person person){
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

        session.save(person);

		tx.commit();
		session.close();	
			
	}

	public Person retrievePerson(Person person) {
		
		Person personToReturn = null;
		Session session = HibernateUtil.getSession();
		
		Query query = session.createQuery("from Person where name = :name");
		query.setParameter("name", person.getName());
		
		if((Person) query.uniqueResult() != null){
			personToReturn = (Person) query.uniqueResult();
		};
		
		session.close();
		return personToReturn;
	}
	
}
