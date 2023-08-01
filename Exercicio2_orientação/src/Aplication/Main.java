package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee e;
		
		
		e = new Employee ();
		
		System.out.printf("Name");
		e.name = sc.next();
		
		System.out.printf("Gross salary");
		e.grossSalary = sc.nextDouble();
		
		System.out.print("Tax");
		e.tax = sc.nextDouble();
		
		System.out.println(e.toString());
		System.out.println("");
		System.out.println("Which percentage to increase salary?");
		double tax = sc.nextDouble();
		e.increaseSalary(tax);
		System.out.println("");
		System.out.println(e.toString());
	}

}
