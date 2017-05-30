package jogo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import dominio.Jogada;
import dominio.Retorno;
import exceptions.PosicaoInvalidaException;

import static org.mockito.Mockito.*;

public class VerSeAdivinhoGanhouJogoTest {
	
	@Mock
	Jogo jogo;
	@Mock
	Retorno retorno;
	@Mock
	Jogada jogada;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
 	
	@Test
	public void verSeAdivinhoGanhouJogoTest() throws PosicaoInvalidaException {
		
//		jogo.setJogada(jogada);
		//Retorno retorno = new Retorno();
		
		//when(jogada.getRetorno()).thenReturn(jogo.getRetorno());
				
//		when(jogo.getRetorno().getPino(0)).thenReturn("preto");
//		when(jogo.getRetorno().getPino(1)).thenReturn("preto");
//		when(jogo.getRetorno().getPino(2)).thenReturn("preto");
//		when(jogo.getRetorno().getPino(3)).thenReturn("preto");
		
		//assertEquals(true, jogo.verSeAdivinhoGanhouJogo());
	}

}
