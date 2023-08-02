package aplication;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.Execeptions.DomainExecptions;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			System.out.println("");
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			Account c = new Account (number,holder,balance,withdrawLimit);
			c.withdraw(amount);
			
			System.out.println("");
			System.out.print(c);
		}
		catch(InputMismatchException e) {
			System.out.print("Error of type enter");
		}
		catch(DomainExecptions e) {
			System.out.print(e.getMessage());
		}
		sc.close();
	}
}
