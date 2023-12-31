package model.services;

public class PaypalService implements OnlinePaymentService {

	
	@Override
	public Double paymetFee(double amount) {
		return (amount*0.02)+amount;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return (amount*months*0.01)+amount;
	}

	
}
