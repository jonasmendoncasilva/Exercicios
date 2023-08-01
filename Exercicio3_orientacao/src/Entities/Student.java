package Entities;

public class Student {

	public String name,status;
	public double n1,n2,n3;
	
	public double note() {
		double n = n1+n2+n3;			// Atribuidor de nota
		return n;
	}
	
	public void verificationNote() {
		if(note()<60.00) {
			status = "FAILED";
		}									//Verificador do estado do aluno
		else {
			status = "PASS";
		}
	}

	public double verificationNote1() {
		return (60.00 - note());				//Nota para a aprovação
	}

	public String toString() {
		return  "MISSING "
				+verificationNote1()				
				+" POINTS";
	}
}
