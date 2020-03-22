package model.exceptions;

public class DomainException extends Exception {
	private static final long serialVersionUID = 1L;
	
	/* 
	 * Esse construtor recebe uma String de mensagem e repassa
	 * para o construtor da superclasse. Isso serve para permitir
	 * que possa se instanciar uma Exce��o personalizada, passando 
	 * uma mensagem pra ela.
	 * 
	*/
	public DomainException(String msg) {
		super(msg);
	}
	
	
	
}

// RunTimeException - Tipo de exce��o que o compilador n�o obriga a tratar
// Exception - Tipo de exe��o que o compilador obriga a tratar/propagar