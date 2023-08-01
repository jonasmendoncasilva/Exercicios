package Entities;

public class Client {
	
	public String name;
	public double price;
	public int stock;

	public double total() {
		double pricet = price * stock; 
		return pricet;
	}
	
	public void addProducts ( product) {
		name = product;
	}

	public void 
}
