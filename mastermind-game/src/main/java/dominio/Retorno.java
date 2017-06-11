package dominio;

import exception.CorInvalidaException;
import exception.PosicaoInvalidaException;

public class Retorno {
	
	private String[] pinosRetornados = {"nenhum", "nenhum", "nenhum", "nenhum"};
	private int pegs = 0;
	
	public Retorno(){
	}
	
	public boolean setPino(String color) throws CorInvalidaException, PosicaoInvalidaException{
		
		boolean retorno = false;
		
		if (color.equals("branco") == false || color.equals("preto") == false){
			throw new CorInvalidaException();
		}else{
			retorno = true;
			pinosRetornados[pegs] = color;
			pegs++;
		}
		
		return retorno;
	}
	
	public String getPino(int posicao) throws PosicaoInvalidaException{
		if (posicao < 0 || posicao > 3){
			throw new PosicaoInvalidaException();
		}else{
			return pinosRetornados[posicao];
		}
	}
	
	public int getPinos(){
		return pegs;
	}
	
}
