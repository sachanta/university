package com.ucsc.university.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private List<String> students = new ArrayList<String>();

	public List<String> getStudents() {
		
		if (students == null || students.size() == 0 ) {			
			students.add("John");
			students.add("Max");
			students.add("Martha");
		}
		return students;
	}

	public void setStudents(List<String> students) {
		this.students = students;
	}
	

}
