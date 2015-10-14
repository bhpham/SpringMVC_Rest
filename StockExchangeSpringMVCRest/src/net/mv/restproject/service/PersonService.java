package net.mv.restproject.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import net.mv.restproject.dao.PersonDao;
import net.mv.restproject.pojos.Person;

import org.springframework.stereotype.Component;


@Path("person")
@Component
public class PersonService {
	
	PersonDao dao = new PersonDao();
	
	@Path("create")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean createPerson(Person person){
		
		Person personFromDB = dao.retrievePerson(person);
		boolean result = false;
		
		if (personFromDB == null){
			dao.addPerson(person);
			result = true;
		}
		
		return result;
	}
	
	@Path("retrieve")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Person retrievePerson(Person person) {
		
		Person personToReturn = dao.retrievePerson(person);
		return personToReturn;
	}
	
}
