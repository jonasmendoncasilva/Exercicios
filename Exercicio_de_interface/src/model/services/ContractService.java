package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService{

	private OnlinePaymentService onlinePaymentService; 	

	public ContractService(OnlinePaymentService onlinePaymentService) {		
		this.onlinePaymentService = onlinePaymentService;
	}


	public void processContract(Contract contract, Integer months) {
		
		double parcela = contract.getTotalValue()/months;
		for(int i=1;i<=months;i++) {
			
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double quota = onlinePaymentService.interest(parcela, i);
			double result = onlinePaymentService.paymetFee(quota);
			
			contract.getList().add(new Installment(dueDate,result));
		}	
	}
	
}
