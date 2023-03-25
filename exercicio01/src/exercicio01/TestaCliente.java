package exercicio01;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli = new Cliente("45359546867", 07600000, 22, "Camille", "11953236998");
		cli.visualizar();

		Cliente cli2 = new Cliente("165934043", 07600233, 20, "Joao", "11976587468");
		cli2.visualizar();
	}

}
