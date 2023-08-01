package Apliccation;

import java.util.Scanner;

import Entities.Triangle;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Triangle x,y;
		
		x= new Triangle ();
		y= new Triangle ();
		
		System.out.println("Enter the measures of triangle:");
		x.a= sc.nextDouble();
		x.b= sc.nextDouble();
		x.c= sc.nextDouble();
		
		System.out.println("Enter the measures of triangle:");
		y.a= sc.nextDouble();
		y.b= sc.nextDouble();
		y.c= sc.nextDouble();
	
		double resultX = x.area();
		double resultY = y.area();
		
		System.out.println("Area do triângulo X:"+resultX);
		System.out.println("Area do triângulo Y:"+resultY);
	}
}
