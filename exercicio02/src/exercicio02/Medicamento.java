package exercicio02;

import java.time.LocalDate;

public class Medicamento extends Farmacia {
	private String PrincipioA;

	public Medicamento(int id, String nome, LocalDate dataLote, LocalDate dataVencimento, float preco,
			String PrincipioA) {
		super(id, nome, dataLote, dataVencimento, preco);
		this.PrincipioA = PrincipioA;
	}

	public String getPrincipioA() {
		return PrincipioA;
	}

	public void setPrincipioA(String PrincipioA) {
		this.PrincipioA = PrincipioA;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Principio Ativo: " + this.PrincipioA);
	}
}
