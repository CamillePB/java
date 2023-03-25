package exercicio02;

import java.time.LocalDate;

public class TestaFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dataL = LocalDate.of(2020, 9, 20);
		LocalDate data = LocalDate.of(2021, 9, 20);
		Farmacia far = new Farmacia(1, "Dipirona", dataL, data, 4.0f);
		far.visualizar();
		
		LocalDate dataL2 = LocalDate.of(2020, 1, 10);
		LocalDate data2 = LocalDate.of(2022, 8, 20);
		Farmacia far2 = new Farmacia(2, "Paracetamol", dataL2, data2, 5.0f);
		far2.visualizar();
	}

}
