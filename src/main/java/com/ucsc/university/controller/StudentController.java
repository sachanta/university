package com.ucsc.university.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ucsc.university.model.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentSrv;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		String returnview = "students";
		
	    model.addAttribute("studentList",  (ArrayList<String>) studentSrv.getStudents());	
	    
	    return returnview;
	}
	
}