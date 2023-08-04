package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\Users\\jonas.silva\\Desktop\\teste\\in.txt";
		List<Employee> list = new ArrayList<>(); 
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employee = br.readLine();
			while(employee!=null) {
				String[] vect = employee.split(","); 
				String name = vect[0];
				Double salary = Double.parseDouble(vect[1]);
				
				list.add(new Employee(name,salary));
			}

			for(Employee s:list) {
				System.out.println(s);
			}
		}catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}

}
