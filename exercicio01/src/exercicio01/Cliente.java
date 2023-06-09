package exercicio01;

public class Cliente {
	private String sexo;
	private int cep;
	private int idade;
	private String nome;
	private String telefone;

	public Cliente(String sexo, int cep, int idade, String nome, String telefone) {
		super();
		this.sexo = sexo;
		this.cep = cep;
		this.idade = idade;
		this.nome = nome;
		this.telefone = telefone;
	}

	

	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public int getCep() {
		return cep;
	}



	public void setCep(int cep) {
		this.cep = cep;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public void visualizar() {

		System.out.println("**************************************");
		System.out.println("           DADOS DA CLIENTE           ");
		System.out.println("**************************************");
		System.out.println("Sexo: " + this.sexo);
		System.out.println("CEP: " + this.cep);
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
	}


}
