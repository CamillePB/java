package aula_exceptions;

public class ExcecaoSimples extends Exception{//herança

	
	private static final long serialVersionUID = 1L;
	
	public ExcecaoSimples() {}
	
	public ExcecaoSimples(String mensagem) {
	super(mensagem);
	}
	
}
