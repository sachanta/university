package com.ucsc.university.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	private List<String> courses = new ArrayList<String>();

	public List<String> getCourses() {
		
		if (courses == null || courses.size() == 0 ) {
			courses.add("Course1");
			courses.add("Course2");
			courses.add("Course3");
		}
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
}
