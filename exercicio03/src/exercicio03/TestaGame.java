package exercicio03;

import java.time.LocalDate;

public class TestaGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate data = LocalDate.of(2020, 9, 20);
		Produto g1 = new Produto(1, "Valorant", 1, "Riot Games", data, 200.0f);
		g1.visualizar();

		LocalDate data2 = LocalDate.of(2021, 9, 20);
		Produto g2 = new Produto(2, "GTA", 3, "R+", data2, 100.0f);
		g2.visualizar();
		
		//Testa Console
		Console cs = new Console(2, "GTA", 3, "R+", data, 100.0f, 1);
		cs.visualizar();
		Console cs2 = new Console(1, "Valorant", 1, "Riot Games", data2, 200.0f, 3);
		cs2.visualizar();
		
		//Testa Games
		Console game = new Console(2, "GTA", 3, "R+", data, 100.0f, 2);
		game.visualizar();
		Console game2 = new Console(1, "Valorant", 1, "Riot Games", data2, 200.0f, 8);
		game2.visualizar();
	}

}
