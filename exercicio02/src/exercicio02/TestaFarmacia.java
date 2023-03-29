package exercicio02;

import java.time.LocalDate;

public class TestaFarmacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Testa Farmacia
		LocalDate dataL = LocalDate.of(2020, 9, 20);
		LocalDate data = LocalDate.of(2021, 9, 20);
		Farmacia far = new Farmacia(1, "Dipirona", dataL, data, 4.0f);
		far.visualizar();

		LocalDate dataL2 = LocalDate.of(2020, 1, 10);
		LocalDate data2 = LocalDate.of(2022, 8, 20);
		Farmacia far2 = new Farmacia(2, "Paracetamol", dataL2, data2, 5.0f);
		far2.visualizar();

		// Testa Perfumaria
		Perfumaria per = new Perfumaria(3, "Versace", dataL, data, 100.0f, "Rosas");
		per.visualizar();
		Perfumaria per2 = new Perfumaria(4, "Allure", dataL2, data2, 150.0f, "Canela");
		per2.visualizar();

		// Testa Medicamento
		Medicamento med = new Medicamento(5, "Novalgina", dataL, data, 5.0f, "Dipirona");
		med.visualizar();
		Medicamento med2 = new Medicamento(6, "Tylenol", dataL2, data2, 5.0f, "Paracetamol");
		med2.visualizar();
	}

}
