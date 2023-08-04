package model.services;

public interface OnlinePaymentService {

	Double paymetFee(double amount);
	Double interest(Double amount, Integer months);
}
