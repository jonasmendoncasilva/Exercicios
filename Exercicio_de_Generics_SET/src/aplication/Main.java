package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Instructor;
import model.entities.Student;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Instructor instructor = new Instructor();
		
		System.out.print("How many students in A course?");
		int students = sc.nextInt(); 
		
		for(int i =0;i<students;i++) {
			int id = sc.nextInt();
			instructor.addStudent(id);
		}
		System.out.print("How many students in B course?");
		students = sc.nextInt(); 
		
		for(int i =0;i<students;i++) {
			int id = sc.nextInt();
			instructor.addStudent(id);
		}
		System.out.print("How many students in C course?");
		students = sc.nextInt(); 
		
		for(int i =0;i<students;i++) {
			int id = sc.nextInt();
			instructor.addStudent(id);
		}
		System.out.println("");
		System.out.print("Total of students: "+instructor.getList().size());
		
		sc.close();
	}
}
