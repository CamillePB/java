package exercicio01;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Testar model Cliente
		Cliente cli = new Cliente("F", 07600000, 22, "Camille", "11953236998");
		cli.visualizar();
		Cliente cli2 = new Cliente("M", 07600233, 20, "Joao", "11976587468");
		cli2.visualizar();
		
		//Testar model Pessoa Fisica
		PessoaFisica pF = new PessoaFisica("M", 07600233, 20, "Joao", "11976587468", "464.573.987/68");
		pF.visualizar();
		PessoaFisica pF2 = new PessoaFisica("F", 07600000, 22, "Camille", "11953236998", "254.836.097/08");
		pF2.visualizar();
		
		//Testar model Pessoa Juridica
				PessoaJuridica pJ = new PessoaJuridica("M", 07600233, 20, "Pedro", "11976587468", "99.876.543/4566-77");
				pJ.visualizar();
				PessoaJuridica pJ2 = new PessoaJuridica("F", 07600000, 22, "Ana", "11953236998", "08.987.123/4312-45");
				pJ2.visualizar();
	}

}
