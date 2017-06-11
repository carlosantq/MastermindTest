package exception;

public class PosicaoInvalidaException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public PosicaoInvalidaException(){
		super("Posição Inválida para Pino.");
	}
	
}
