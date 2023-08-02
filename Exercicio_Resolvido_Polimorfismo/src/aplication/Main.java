package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int employees = sc.nextInt();
		
		List<Employee> employee = new ArrayList<Employee>();
		
		for (int i=1;i<=employees;i++) {
			System.out.println("Employee #"+i+" data:");
			
			System.out.print("Outsourced (y/n)?");
			String answer = sc.next();
		
			if (answer.equals("y")) {
				
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hour = sc.nextInt();
				
				System.out.print("Value per hour: ");
				double value = sc.nextDouble();
				
				System.out.print("Additional charge: ");
				double charge = sc.nextDouble();
				
				Employee e = new OutsourcedEmployee(name, hour, value,charge);
				
				employee.add(e);
			}
			else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				
				System.out.print("Hours: ");
				int hour = sc.nextInt();
				System.out.print("Value per hour: ");
				double value = sc.nextDouble();
			
				Employee e = new Employee(name, hour, value);
				
				employee.add(e);
			}
			
		}
		System.out.println("PAYMENTS:");
		for(Employee em:employee) {
			System.out.println(em);
		}
		sc.close();
	}
}
