package jogo;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import dominio.Jogada;
import exceptions.PosicaoInvalidaException;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class MostrarPinosTentativaJogadaTest {

	@Mock
	Jogada jogada;
	@Mock
	Jogo jogo;
	@Mock
	Tentativa tentativa;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
 	
	@Test
	public void mostrarPinosTentativaJogadaTest() throws PosicaoInvalidaException {
		
		//jogada.setTentativa(tentativa);
		//jogo.setJogada(jogada);
		String [] pinos = {"vermelho", "azul", "verde", "amarelo"};
		
		when(jogada.getTentativa()).thenReturn(tentativa);
		when(tentativa.quantosPinosJaForamAdicionados()).thenReturn(4);
		when(tentativa.getPino(0)).thenReturn("vermelho");
		when(tentativa.getPino(1)).thenReturn("azul");
		when(tentativa.getPino(2)).thenReturn("verde");
		when(tentativa.getPino(3)).thenReturn("amarelo");
		
		//assertArrayEquals(pinos, jogo.mostrarPinosTentativaDaJogada());
	}

}
