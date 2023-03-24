package exercicio03;

import java.time.LocalDate;

public class TestaGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate data = LocalDate.of(2020, 9, 20);
		Produto g1 = new Produto(1, "Valorant", 1, "Riot Games", data, 1200.0f);
		g1.visualizar();
		
		LocalDate data2 = LocalDate.of(2021, 9, 20);
		
		g1.setId(2);
		g1.setNome("GTA");
		g1.setVersao(3);
		g1.setProdutora("R+");
		g1.setDataLancamento(data2);
		g1.setPreco(1000.0f);
		g1.visualizar();
	}

}
