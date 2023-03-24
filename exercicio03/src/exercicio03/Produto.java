package exercicio03;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto {
	private int id;
	private String nome;
	private int versao;
	private String produtora;
	private LocalDate dataLancamento;// formato de data
	private float preco;

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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Produto(int id, String nome, int versao, String produtora, LocalDate dataLancamento, float preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.versao = versao;
		this.produtora = produtora;
		this.dataLancamento = dataLancamento;
		this.preco = preco;
	}

	public void visualizar() {

		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance(); // utiliza o formato de moeda do Wind do PC
		
		System.out.println("**************************************");
		System.out.println("           DADOS DO PRODUTO           ");
		System.out.println("**************************************");
		System.out.println("Id: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Versao: " + versao);
		System.out.println("Produtora: " + this.produtora);
		System.out.println("Data de lançamento: " + this.dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Preço: " + nfMoeda.format(this.preco));
	}

}
