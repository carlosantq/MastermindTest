package dominio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import exceptions.CorInvalidaException;
import exceptions.PosicaoInvalidaException;

import static org.mockito.Mockito.*;

import jogo.Tentativa;

public class AdivinhoTest {
	
	@Mock
	private Adivinho adivinho;
	@Mock
	private Tentativa tentativa;

	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	
	/**
	 * Aqui foram tentados testar os m�todo adicionarNovoPinoATentativa(Tentativa tentativa) e jogar(). 
	 * No primeiro m�todo, a ideia era que desse para mockar a cor dos pinos vinda do usu�rio e o processamento da tentativa, no entanto, 
	 * quando chegava na parte de retornar true ou false (j� que refatoramos o m�todo para retornar um boolean ap�s exidir na tela 
	 * se a cor foi adicionada) n�o havia um "gatilho" para esse retorno.
	 */
	
	@Test
	public void todasCoresOkTest() throws PosicaoInvalidaException, CorInvalidaException {
//		adivinho = new Adivinho();
//		tentativa = new Tentativa();
//		String corPino = "vermelho";
//		when(tentativa.quantosPinosJaForamAdicionados()).thenReturn(0);
//		when(tentativa.adicionarPino(0, corPino)).thenReturn(true);
	}
	

}
