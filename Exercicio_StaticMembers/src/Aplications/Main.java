package Aplications;

import java.util.Locale;
import java.util.Scanner;

import Calcs.currencyConverter;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("What's the dollar price?");
		double price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double dolar = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais R$ "
		+currencyConverter.convert(price, dolar));
		
		sc.close();
	}

}
