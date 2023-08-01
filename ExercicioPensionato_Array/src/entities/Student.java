package entities;

public class Student {

	private String name, email;
	private int number;
	
	
	public Student(String name, String email, int number) {
		this.name=name;
		this.email=email;
		this.number=number;
	}
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getNumber() {
		return number;
	}

	public String toString() {
		return getNumber()
				+": "
				+getName()
				+", "
				+getEmail();
	}

	
	
}
