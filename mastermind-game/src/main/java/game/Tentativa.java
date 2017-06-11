package game;

import exception.CorInvalidaException;
import exception.PosicaoInvalidaException;

public class Tentativa {

	private String[] tentativa = {"nenhum", "nenhum", "nenhum", "nenhum"};
	private int pinos = 0;
	
	public Tentativa(){
	}
	
	public boolean setPino(int posicao, String cor) throws CorInvalidaException, PosicaoInvalidaException{
		
		boolean retorno = false;
		
		if (posicao < 0 || posicao > 3){
			throw new PosicaoInvalidaException();
		}else if (ehCorValida(cor) == false){
			throw new CorInvalidaException();
		}else{
			retorno = true;
			tentativa[posicao] = cor;
			pinos++;
		}
		
		return retorno;
	}
	
	public String getPino(int posicao) throws PosicaoInvalidaException{
		if (posicao < 0 || posicao > 3){
			throw new PosicaoInvalidaException();
		}else{
			return tentativa[posicao];
		}
	}
	
	public boolean ehCorValida(String cor){
		if (cor.equals("vermelho") || cor.equals("azul") || cor.equals("rosa") || cor.equals("amarelo") 
				|| cor.equals("roxo") || cor.equals("verde") || cor.equals("cinza") || cor.equals("laranja")){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean ehTentativaIncompleta(){
		for (int i=0; i<4; i++){
			if (tentativa[i].equals("nenhum")){
				return true;
			}
		}
		
		return false;
	}
	
	public int getPinos(){
		return pinos;
	}
}
