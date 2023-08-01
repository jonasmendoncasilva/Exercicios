package Entities;

public class Employee {

	public String name;
	public double grossSalary, tax;
	
	
	public double netSalary() {
		return (grossSalary-tax);
	}

	public void increaseSalary(double tax) {
		this.grossSalary = this.grossSalary*tax/100.00 + this.grossSalary;
		netSalary();
	}

	public String toString() {
		return "Employee:"
				+name
				+", $"
				+netSalary();			
	}
}
