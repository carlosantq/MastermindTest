package game;

import exception.CorInvalidaException;
import exception.PosicaoInvalidaException;

public class Senha {

	private String[] senha = {"nenhum", "nenhum", "nenhum", "nenhum"};
	private int pinos = 0;
	
	public Senha(){
	}
	
	public boolean setPino(String cor) throws CorInvalidaException{
		
		boolean retorno = false;
		
		if (ehCorValida(cor) == false){
			throw new CorInvalidaException();
		}else{
			retorno = true;
			senha[pinos] = cor;
			pinos++;
		}
		
		return retorno;
	}
	
	public String getPino(int posicao) throws PosicaoInvalidaException{
		if (posicao < 0 || posicao > 3){
			throw new PosicaoInvalidaException();
		}else{
			return senha[posicao];
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
	
	public int getPinos(){
		return pinos;
	}
	
	public boolean ehSenhaValida(){
		
		boolean ehValida = true;
		String corAtual;
		int i, j;
		
		for (i=0; i<4; i++){
			corAtual = senha[i];
			if (corAtual.equals("nenhum")){
				ehValida = false;
			}
			
			for (j=i; j<4; j++){
				if (senha[j] == corAtual){
					ehValida = false;
				}
			}
		}
		
		return ehValida;
	}
	
	
}
