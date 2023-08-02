package entities;

public abstract class Contribuinte {

	private String nome;
	private Double renda;
	
	public Contribuinte() {	
	}

	public Contribuinte(String nome, Double renda) {
		this.nome = nome;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public double calcImposto() {
		double sum=0;
		return sum;
	}

	@Override
	public String toString() {
		return nome
			   +": $ "
			   +String.format("%.2f",calcImposto());
	}


}
