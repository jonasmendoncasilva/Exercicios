package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Person;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many persons will enter?");
		int n = sc.nextInt();
		
		
		Person[] v = new Person[n];
		double sum=0, sum1=0;
		
		for(int i=0; i<v.length;i++) {	
			String name = sc.next();
			int age = sc.nextInt();
			double height = sc.nextDouble();
			v[i] = new Person(name, age, height);
		}	
			
		for(int i=0; i<v.length;i++) {
			sum += v[i].getHeight();
			if(v[i].getAge()<16) {
			sum1 += 1;
			}
		}
		System.out.print("Altura média: "+sum/v.length);
		System.out.println();
		System.out.print("Pessoas com menos de 16 anos:"+sum1/v.length*100+"%");
		for(int i=0; i<v.length;i++) {
			if(v[i].getAge()<16) {
				System.out.println(v[i].getName());
				System.out.println();
			}
		}
	
		sc.close();
		
	}
}
