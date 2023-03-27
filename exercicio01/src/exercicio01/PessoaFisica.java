package exercicio01;

public class PessoaFisica extends Cliente {
	private String cpf;

	public PessoaFisica(String sexo, int cep, int idade, String nome, String telefone, String cpf) {
		super(cpf, cep, idade, nome, telefone);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: " + this.cpf);
	}
}
