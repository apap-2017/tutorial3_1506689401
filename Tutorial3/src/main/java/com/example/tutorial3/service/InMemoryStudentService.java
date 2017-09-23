package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm) {
		//Implement
		for(int a=0; a<studentList.size(); a++) {
			StudentModel student = studentList.get(a);
			if(student.getNpm().equals(npm)) {
				return student;
			}
		}
		return null;
	}

	@Override
	public List<StudentModel> selectAllStudents() {
		return studentList;
	}
	
	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}
}
