package triatleta;

public class Triatletas extends Pessoa implements Ciclista, Nadador, Corredor{

	public Triatletas(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aquecer() {
		// TODO Auto-generated method stub
		System.out.println("Aquecendo...");
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("Correndo...");
	}

	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		System.out.println("Nadando...");
	}

	@Override
	public void pedalar() {
		// TODO Auto-generated method stub
		System.out.println("Pedalando...");
	}

	@Override
	public void cansar() {
		// TODO Auto-generated method stub
		System.out.println("Cansou.");
	}

}
