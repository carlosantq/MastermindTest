package dominio;

import exception.CorInvalidaException;
import exception.PosicaoInvalidaException;
import game.Tentativa;

public class Adivinho implements Jogador{
	
	Jogada jogada;
	
	public Adivinho(){
	}

	@Override
	public void setJogada(Jogada jogada) {
		this.jogada = jogada;
	}

	@Override
	public Jogada getJogada() {
		return jogada;
	}
	
	//só chama um set
	public void realizarTentativa(Tentativa tentativaJogador){
		jogada.setTentativa(tentativaJogador);
	}
	
	public boolean adicionarNovoPinoATentativa(Tentativa tentativa, String cor){
	
		boolean retorno = false;
		
		int posicaoDoNovoPino = tentativa.getPinos();
		
		try {
			retorno = (tentativa.setPino(posicaoDoNovoPino, cor));
			System.out.println("pino colocado com sucesso:" + cor);
		} catch (PosicaoInvalidaException e) {
			System.out.println("posicao para inserir pino na jogada do jogador é inválida");
		} catch (CorInvalidaException e) {
			System.out.println("cor inválida para novo pino a ser inserido na tentativa do jogador." + "Tente novamente.");
		}
		
		return retorno;
	}

	@Override
	public boolean jogar() {
		Tentativa tentativaJogador = new Tentativa();
		String cor = "verde";
		
		while (tentativaJogador.ehTentativaIncompleta() == true) {
			this.adicionarNovoPinoATentativa(tentativaJogador, cor);
		}
		
		this.realizarTentativa(tentativaJogador);
		return true;
	}

}
