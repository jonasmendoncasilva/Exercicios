package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		System.out.print("Enter the number of tax payers: ");
		int payers = sc.nextInt();
		
		List<Contribuinte> list = new ArrayList<Contribuinte>();
		
		for(int i=1;i<=payers;i++) {
			System.out.println("Tax payer #"+i+" data");
			System.out.print("Individual or Company? (i/c)? ");
			String respond = sc.next();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double renda = sc.nextDouble();
			
			if(respond.equals("i")) {
				System.out.print("Health expenditures: ");
				double gastos = sc.nextDouble();
			
				list.add(new PessoaFisica(name,renda,gastos));
			}
			else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
			
				list.add(new PessoaJuridica(name,renda,employees));
			}
		}
		System.out.println("");
		System.out.println("TAXES PAID:");
		double sum=0;
		for (Contribuinte c: list) {
			System.out.println(c);
			sum+=c.calcImposto();
		}
		System.out.println("");
		System.out.print("TOTAL TAXES: $ "+sum);
		
		sc.close();
	}
}
