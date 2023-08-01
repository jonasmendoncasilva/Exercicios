package Aplications;

import java.util.Locale;
import java.util.Scanner;

import Entities.Student;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Student s;
		s = new Student ();
		
		s.name = sc.next();
		s.n1 = sc.nextDouble();
		s.n2 = sc.nextDouble();
		s.n3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = "+s.note());
		s.verificationNote();
		
		if (s.status.equals("PASS")) {
			System.out.println(s.status);
		}
		else {
			System.out.println(s.status);
			System.out.println(s.toString());
		}
		sc.close();
	}
}
