package exercicio01;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli = new Cliente("45359546867", 07600000, 22, "Camille", "11953236998");
		cli.visualizar();
		
		cli.setCpf("165934043");
		cli.setCep(07600233);
		cli.setIdade(20);
		cli.setNome("Joao");
		cli.setTelefone("11976587468");
		cli.visualizar();
	}

}
