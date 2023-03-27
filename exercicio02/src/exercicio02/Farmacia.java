package exercicio02;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Farmacia {
	private int id;
	private String nome;
	private LocalDate dataLote;
	private LocalDate dataVencimento;// formato de data
	private float preco;

	public Farmacia(int id, String nome, LocalDate dataLote, LocalDate dataVencimento, float preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataLote = dataLote;
		this.dataVencimento = dataVencimento;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataLote() {
		return dataLote;
	}

	public void setDataLote(LocalDate dataLote) {
		this.dataLote = dataLote;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance(); // utiliza o formato de moeda do Wind do PC

		System.out.println("**************************************");
		System.out.println("               FARMÁCIA               ");
		System.out.println("**************************************");
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de lançamento: " + this.dataLote.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Data de lançamento: " + this.dataVencimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Preço: " + nfMoeda.format(this.preco));
	}
}
