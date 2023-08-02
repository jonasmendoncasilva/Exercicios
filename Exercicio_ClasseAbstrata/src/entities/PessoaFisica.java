package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastosComSaude;

	
	public PessoaFisica() {
		super();
	}


	public PessoaFisica(String nome, Double renda, Double gastosComSaude) {
		super(nome, renda);
		this.gastosComSaude = gastosComSaude;
	}


	public Double getGastosComSaude() {
		return gastosComSaude;
	}


	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}
	
	@Override
	public double calcImposto() {
		double sum = 0;
		if(getRenda()<20000.00) {
			sum = getRenda()*0.15-0.5*gastosComSaude;
		}
		else {
			sum = getRenda()*0.25-0.5*gastosComSaude;
		}
		return sum;
	}
}
