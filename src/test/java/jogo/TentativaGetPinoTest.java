package jogo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import exceptions.CorInvalidaException;
import exceptions.PosicaoInvalidaException;

/**
 * 
 * Esta classe testa o método getPino() da classe Tentativa.
 * No Happy Path, foram testdas as cores das quatro posições, sendo a última uma posicão não setada, devendo retornar nenhum.
 * No Cenário de Exceções, foram testadas as situações de cor errada e posicão inválida na fronteira dos valores de 
 * posições válidos (-1 e 4).
 *
 */

public class TentativaGetPinoTest {
	
	private Tentativa tentativa;

	@Before
	public void setUp() throws PosicaoInvalidaException, CorInvalidaException{
		tentativa = new Tentativa();
		tentativa.adicionarPino(0, "vermelho");
		tentativa.adicionarPino(1, "rosa");
		tentativa.adicionarPino(2, "azul");
	}
	
	@Test
	public void posicaoZeroTest() throws PosicaoInvalidaException{
		assertEquals("vermelho", tentativa.getPino(0));
	}
	
	@Test
	public void posicaoUmTest() throws PosicaoInvalidaException{
		assertEquals("rosa", tentativa.getPino(1));
	}
	
	@Test
	public void posicaoDoisTest() throws PosicaoInvalidaException{
		assertEquals("azul", tentativa.getPino(2));
	}
	
	@Test
	public void posicaoTresTest() throws PosicaoInvalidaException{
		assertEquals("nenhum", tentativa.getPino(3));
	}
	
	@Test
	public void corErradaTest() throws PosicaoInvalidaException{
		assertFalse("roxo" == tentativa.getPino(0));
	}
	
	@Test
	public void posicaoInvalida1Test() throws PosicaoInvalidaException{
		try{
			assertEquals("laranja", tentativa.getPino(4));
		}catch (PosicaoInvalidaException pie){
		}
	}
	
	@Test
	public void posicaoInvalida2Test() throws PosicaoInvalidaException{
		try{
			assertEquals("laranja", tentativa.getPino(-1));
		}catch (PosicaoInvalidaException pie){
		}
	}

}
