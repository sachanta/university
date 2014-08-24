package com.ucsc.university.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ucsc.university.model.CourseService;
import com.ucsc.university.model.StudentService;

@Controller
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	private CourseService courseSrv;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		String returnview = "courses";
		
	    model.addAttribute("courseList",  (ArrayList<String>) courseSrv.getCourses());	

	    return returnview;

	}
	
}