package dominio;

import java.util.LinkedList;
import java.util.Random;

import game.Senha;

public class FornecedorDeSenha implements Jogador{
	
	private Jogada jogada;
	private Senha senha;
	
	public FornecedorDeSenha(){
		jogada = null;
		senha = new Senha();
	}

	public Senha getCode() {
		return senha;
	}

	public void setCode(Senha senha) {
		this.senha = senha;
	}

	@Override
	public void setJogada(Jogada jogada) {
		this.jogada = jogada;
	}

	@Override
	public Jogada getJogada() {
		return jogada;
	}
	
	public boolean generateCode(){
		
		boolean retorno = true;
		
		while(senha.ehSenhaValida() == false){
			
			LinkedList<String> cores = new LinkedList<String>();
			cores.add("vermelho");
			cores.add("azul");
			cores.add("rosa");
			cores.add("amarelo");
			cores.add("roxo");
			cores.add("verde");
			cores.add("cinza");
			cores.add("laranja");
			
			for (int i = 0; i < 4; i++) {
				Random geradorNumRandomico = new Random();
				String corDaSenha = cores.remove(geradorNumRandomico.nextInt(cores.size()));
				try {
					senha.setPino(corDaSenha);
				} catch (Exception exc) {
					retorno = false;
					System.out.println("Erro ao setar pinos para senha.");
				}
			}
			
		}
		
		return retorno;
		
	}

	@Override
	public boolean jogar() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
