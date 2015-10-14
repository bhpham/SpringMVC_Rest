package net.mv.restproject.controller;

import net.mv.restproject.domain.Student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="student")
public class StudentController {

	@RequestMapping(value="register", method=RequestMethod.POST)
	public ResponseEntity<Student> registerStudent(Student student) {
		System.out.println(student);
		return new ResponseEntity<Student>(student, HttpStatus.CREATED);
	}
}
