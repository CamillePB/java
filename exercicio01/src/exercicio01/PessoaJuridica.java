package exercicio01;

public class PessoaJuridica extends Cliente {

	private String cnpj;

	public PessoaJuridica(String cpf, int cep, int idade, String nome, String telefone, String cnpj) {
		super(cpf, cep, idade, nome, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: " + this.cnpj);
	}
}
