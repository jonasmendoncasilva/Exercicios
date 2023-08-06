package model.entities;

import java.util.HashSet;
import java.util.Set;

public class Instructor {

	private Set<Student> list = new HashSet<>();
	
	
	
	public Set<Student> getList() {
		return list;
	}



	public void setList(Set<Student> list) {
		this.list = list;
	}



	public void addStudent(int id) {
		list.add(new Student(id));
	}
	
}
