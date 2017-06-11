package dominio;

import game.Tentativa;

public class Jogada {

	private Tentativa tentativa;
	private Retorno retorno;
	
	public Jogada(){
		tentativa = null;
		retorno = null;
	}

	public Tentativa getTentativa() {
		return tentativa;
	}

	public void setTentativa(Tentativa tentativa) {
		this.tentativa = tentativa;
	}

	public Retorno getRetorno() {
		return retorno;
	}

	public void setRetorno(Retorno retorno) {
		this.retorno = retorno;
	}
	
	
	
}
