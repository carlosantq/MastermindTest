package jogo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import exceptions.CorInvalidaException;
import exceptions.PosicaoInvalidaException;

/**
 * 
 * Esta classe testa o método getPino() da classe Senha.
 * No Happy Path, foram testadas as cores das quatro posições, sendo a última uma posicão não setada, devendo retornar nenhum.
 * No Cenário de Exceções, foram testadas as situações de cor errada e posicão inválida na fronteira dos valores de 
 * posições válidos (-1 e 4).
 *
 */

public class SenhaGetPinoTest {
	
	private Senha senha;

	@Before
	public void setUp() throws PosicaoInvalidaException, CorInvalidaException{
		senha = new Senha();
		senha.adicionarPino("verde");
		senha.adicionarPino("amarelo");
		senha.adicionarPino("cinza");
	}
	
	@Test
	public void posicaoZeroTest() throws PosicaoInvalidaException{
		assertEquals("verde", senha.getPino(0));
	}
	
	@Test
	public void posicaoUmTest() throws PosicaoInvalidaException{
		assertEquals("amarelo", senha.getPino(1));
	}
	
	@Test
	public void posicaoDoisTest() throws PosicaoInvalidaException{
		assertEquals("cinza", senha.getPino(2));
	}
	
	@Test
	public void posicaoTresTest() throws PosicaoInvalidaException{
		assertEquals("nenhum", senha.getPino(3));
	}
	
	@Test
	public void corErradaTest() throws PosicaoInvalidaException{
		assertFalse("roxo" == senha.getPino(0));
	}
	
	@Test
	public void posicaoInvalida1Test() throws PosicaoInvalidaException{
		try{
			assertEquals("laranja", senha.getPino(4));
		}catch (PosicaoInvalidaException pie){
		}
	}
	
	@Test
	public void posicaoInvalida2Test() throws PosicaoInvalidaException{
		try{
			assertEquals("laranja", senha.getPino(-1));
		}catch (PosicaoInvalidaException pie){
		}
	}

}
