package Aplication;

public class bank_account {

	private int number;
	private double account;
	private String name;
	
	
	public bank_account (String name, int number, double deposit) {		
		this.name = name;
		depositAccount(deposit);
		this.number = number;
	}

	public bank_account (String name, int number) {		
		this.name = name;
		this.number = number;
	}

	public int getNumber () {
		return number;
	}
	
	public double getAccount() {
		return account;
	}
	
	public String getName() {
		return name;
	}

	public void depositAccount(double value) {
		this.account += value;
	}
	
	public void withdrawAccount(double value) {
		this.account = this.account - value - 5.00;
	}
	
	public String toString() {
		return "Account "
				+number
				+", Holder: "
				+name
				+", Balance: $"
				+account;
	}
}
