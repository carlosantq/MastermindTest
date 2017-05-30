package jogo;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.CorInvalidaException;
import exceptions.PosicaoInvalidaException;

/**
 * 
 * Esta classe testa o método ehTentativaCompleta da classe Tentativa.
 * Para o Happy Path, foi testado quando nenhum dos pinos foi setado; quando foi setado completamente com exceção da primeira, segunda, 
 * terceira, ou quarta posições; quando duas posições não foram setadas; quando três posições não foram setadas; e quando todas foram setadas.
 * No cenário de exceção foi testado quando não há posições para setar e o programa diz que está incompleto e quando há posições para 
 * setar e ele diz que não está incompleto.
 * 
 */

public class EhTentativaIncompletaTest {
	
	@Test
	public void todasPosicaoComNenhumTest(){
		Tentativa tentativa = new Tentativa();
		
		assertEquals(true, tentativa.ehTentativaIncompleta());
	}
	
	@Test
	public void primeiraPosicaoNenhumTest() throws PosicaoInvalidaException, CorInvalidaException{
		Tentativa tentativa = new Tentativa();
		tentativa.adicionarPino(1, "vermelho");
		tentativa.adicionarPino(2, "roxo");
		tentativa.adicionarPino(3, "laranja");
		
		assertEquals(true, tentativa.ehTentativaIncompleta());
	}
	
	@Test
	public void segundaPosicaoNenhumTest() throws PosicaoInvalidaException, CorInvalidaException{
		Tentativa tentativa = new Tentativa();
		tentativa.adicionarPino(0, "vermelho");
		tentativa.adicionarPino(2, "roxo");
		tentativa.adicionarPino(3, "laranja");
		
		assertEquals(true, tentativa.ehTentativaIncompleta());
	}
	
	@Test
	public void terceiraPosicaoNenhumTest() throws PosicaoInvalidaException, CorInvalidaException{
		Tentativa tentativa = new Tentativa();
		tentativa.adicionarPino(0, "vermelho");
		tentativa.adicionarPino(1, "roxo");
		tentativa.adicionarPino(3, "laranja");
		
		assertEquals(true, tentativa.ehTentativaIncompleta());
	}
	
	@Test
	public void quartaPosicaoNenhumTest() throws PosicaoInvalidaException, CorInvalidaException{
		Tentativa tentativa = new Tentativa();
		tentativa.adicionarPino(0, "vermelho");
		tentativa.adicionarPino(1, "roxo");
		tentativa.adicionarPino(2, "laranja");
		
		assertEquals(true, tentativa.ehTentativaIncompleta());
	}
	
	@Test
	public void duasPosicoesNenhumTest() throws PosicaoInvalidaException, CorInvalidaException{
		Tentativa tentativa = new Tentativa();
		tentativa.adicionarPino(0, "vermelho");
		tentativa.adicionarPino(1, "roxo");
		
		assertEquals(true, tentativa.ehTentativaIncompleta());
	}
	
	@Test
	public void tresPosicoesNenhumTest() throws PosicaoInvalidaException, CorInvalidaException{
		Tentativa tentativa = new Tentativa();
		tentativa.adicionarPino(0, "vermelho");
		
		assertEquals(true, tentativa.ehTentativaIncompleta());
		
	}
	
	@Test
	public void todasPosicoesSetadasTest() throws PosicaoInvalidaException, CorInvalidaException{
		Tentativa tentativa = new Tentativa();
		tentativa.adicionarPino(0, "vermelho");
		tentativa.adicionarPino(1, "roxo");
		tentativa.adicionarPino(2, "azul");
		tentativa.adicionarPino(3, "laranja");
		
		assertEquals(false, tentativa.ehTentativaIncompleta());
	}
	
	@Test
	public void haPosicoesFailTest() throws PosicaoInvalidaException, CorInvalidaException{
		Tentativa tentativa = new Tentativa();
		tentativa.adicionarPino(0, "vermelho");
		tentativa.adicionarPino(1, "roxo");
		tentativa.adicionarPino(2, "azul");
		
		assertTrue(tentativa.ehTentativaIncompleta());
	}
	
	@Test
	public void naoHaPosicoesFailTest() throws PosicaoInvalidaException, CorInvalidaException{
		Tentativa tentativa = new Tentativa();
		tentativa.adicionarPino(0, "vermelho");
		tentativa.adicionarPino(1, "roxo");
		tentativa.adicionarPino(2, "azul");
		tentativa.adicionarPino(3, "laranja");
		
		assertFalse(tentativa.ehTentativaIncompleta());
	}
	
}
