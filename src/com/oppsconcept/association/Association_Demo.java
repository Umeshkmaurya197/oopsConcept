package com.oppsconcept.association;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
	String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}

class Teacher {
	String teacherName;
	List<Student> studentName;
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public List<Student> getStudentName() {
		return studentName;
	}
	public void setStudentName(List<Student> studentName) {
		this.studentName = studentName;
	}

	
}
public class Association_Demo{
	public static void main(String[] args) {

		Teacher teacher = new Teacher();
		teacher.setTeacherName("Shyam Lal");

		Student student1 = new Student();
		student1.setStudentName(" Ashok ");

		Student student2 = new Student();
		student2.setStudentName(" Kabir ");

		List<Student> studentNames = new ArrayList<>();

		studentNames.add(student1);
		studentNames.add(student2);

		System.out.println(teacher.getStudentName() + " is student of  " + teacher.getTeacherName());

	}
}