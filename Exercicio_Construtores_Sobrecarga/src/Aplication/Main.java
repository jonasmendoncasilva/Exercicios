package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		bank_account b;
		 System.out.print("Enter account number");
		int number = sc.nextInt();
		sc.nextLine();	
		System.out.print("Enter account holder");
		String name = sc.nextLine();
		
		System.out.print("");
		System.out.print("Is there an initial deposit? [y/n]");
		String answer = sc.next();
		System.out.print("");
		
		if(answer.equals("y")) {
			System.out.print("Enter initial deposit:");
			double deposit = sc.nextDouble();		
			
			b = new bank_account (name, number,deposit);
		}
		
		else {
			b = new bank_account (name, number);
			
		}
		
		System.out.print(b.toString());
		System.out.println("");
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		
		System.out.print("Updated account data: ");
		b.depositAccount(deposit);
		System.out.print(b.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		deposit = sc.nextDouble();
		
		
		System.out.println("Updated account data");
		b.withdrawAccount(deposit);
		System.out.println(b.toString());
		
		
		sc.close();
	}

}