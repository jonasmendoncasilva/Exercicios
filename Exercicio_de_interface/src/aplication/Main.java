package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;



public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
	
			System.out.println("Entre os dados do contrato: ");
			System.out.print("Numero: ");
			int number = sc.nextInt();
			System.out.print("Data (dd/MM/yyyy): ");
			LocalDate date = LocalDate.parse(sc.next(),fmt); 
			System.out.print("Valor do contrato: ");
			double amount = sc.nextDouble();
			System.out.print("Entre com o numero de parcelas: ");
			int parcelas = sc.nextInt();
			
			Contract obj = new Contract(number,date,amount);
			 
			ContractService service = new ContractService(new PaypalService());
			service.processContract(obj, parcelas);
			
			System.out.println();
			System.out.println("PARCELAS:");
			
			for(Installment i:obj.getList()) {
				System.out.println(i);
		
		
			}
	}
}
