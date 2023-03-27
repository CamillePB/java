package exercicio02;

import java.time.LocalDate;

public class Perfumaria extends Farmacia {
	private String fragancia;

	public Perfumaria(int id, String nome, LocalDate dataLote, LocalDate dataVencimento, float preco,
			String fragancia) {
		super(id, nome, dataLote, dataVencimento, preco);
		this.fragancia = fragancia;
	}

	public String getFragancia() {
		return fragancia;
	}

	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Fragancia: " + this.fragancia);
	}
}
