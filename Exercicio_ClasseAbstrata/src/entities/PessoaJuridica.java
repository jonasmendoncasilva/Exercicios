package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer numeroDeFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double renda, Integer numeroDeFuncionarios) {
		super(nome, renda);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double calcImposto() {
		double sum = 0;
		if(numeroDeFuncionarios<10) {
			sum = getRenda()*0.16;
		}
		else {
			sum = getRenda()*0.14;
		}
		return sum;
	}
}
