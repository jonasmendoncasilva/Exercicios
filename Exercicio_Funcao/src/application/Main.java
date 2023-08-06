package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Employee;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter with path: ");
		String path = sc.next();
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			
			List<Employee> list = new ArrayList<>();
			String line = bf.readLine();
			while(line!=null) {
				String[] vect = line.split(",");
				list.add(new Employee(vect[0],vect[1],Double.parseDouble(vect[2])));
				line = bf.readLine();
			}

			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			System.out.println("Email of people whose salary is more than: " + salary);
			List<String> emails = list.stream()
					.filter(p -> p.getSalary() > salary)
					.map(p -> p.getEmail())
					.sorted().collect(Collectors.toList());
			
			for(String e:emails) {
				System.out.println(e);
			}
			
			double salarys = list.stream()
					.filter(p -> p.getName().startsWith("M"))
					.map(p -> p.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			System.out.print("Sum of salary of people whose name starts with 'A': " + salarys);	
			sc.close();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}