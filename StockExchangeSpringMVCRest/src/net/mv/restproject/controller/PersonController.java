package net.mv.restproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.mv.restproject.pojos.Person;
import net.mv.restproject.service.PersonService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="person")
public class PersonController {

	PersonService service = new PersonService();
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String registerPerson(Person person, HttpServletRequest req){
		
		HttpSession session = req.getSession();
		session.setAttribute("message", "");
		String returnPage = null;
		
		person.setHoldings(0.0);
		boolean result = service.createPerson(person);
		
		if (result){
			session.setAttribute("message", "Success! Person added to DB!");
			returnPage = "/pages/login.jsp";
		} else {
			session.setAttribute("message", "Person already exists in DB! Choose a different name!");
			returnPage = "/pages/register.jsp";
		}
		
		return returnPage;
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String loginPerson(Person person, HttpServletRequest req){
		
		HttpSession session = req.getSession();
		session.setAttribute("message", "");
		Person personFromDB = service.retrievePerson(person);
		//ResponseEntity<Person> returnEntity = new ResponseEntity<Person>(personFromDB, HttpStatus.CREATED);
		//return returnEntity;
		String returnPage = null;
		
		if (personFromDB != null){
			returnPage = "/pages/homepage.jsp";
		} else {
			returnPage = "/pages/login.jsp";
			session.setAttribute("message", "SORRY, PERSON DOES NOT EXIST!");
			//SOME MESSAGE SAYING USER DOES NOT EXIST.
		}
		
		return returnPage;
		
	}
}
