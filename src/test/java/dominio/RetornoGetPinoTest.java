package dominio;

import static org.junit.Assert.*;
import org.junit.Test;
import exceptions.CorInvalidaException;
import exceptions.PosicaoInvalidaException;

/**
 * 
 * Esta classe testa se o pino retornado do método getPino da classe Retorno está correto.
 * Foi utilizado o critério PairWise para gerar os casos de testes happy path. Ainda no happy path, foi testado quando não há 
 * nenhum pino inserido.
 * Para os testes dos cenários de exceção, foram levados em conta os casos de cor não condizente com a posição escolhido e os de 
 * posição inválida analisando os valores de fronteira (-1 e 4).
 *
 */

public class RetornoGetPinoTest {

	@Test
	public void bbbbTest() throws CorInvalidaException, PosicaoInvalidaException {
		Retorno retorno = new Retorno();
		retorno.adicionarPino("branco");
		retorno.adicionarPino("branco");
		retorno.adicionarPino("branco");
		retorno.adicionarPino("branco");
		
		assertEquals("branco", retorno.getPino(1));
	}
	
	@Test
	public void bbpb() throws CorInvalidaException, PosicaoInvalidaException {
		Retorno retorno = new Retorno();
		retorno.adicionarPino("branco");
		retorno.adicionarPino("branco");
		retorno.adicionarPino("preto");
		retorno.adicionarPino("branco");
		
		assertEquals("preto", retorno.getPino(2));
	}
	
	@Test
	public void bpbp() throws CorInvalidaException, PosicaoInvalidaException {
		Retorno retorno = new Retorno();
		retorno.adicionarPino("branco");
		retorno.adicionarPino("preto");
		retorno.adicionarPino("branco");
		retorno.adicionarPino("preto");
		
		assertEquals("preto", retorno.getPino(1));
	}
	
	@Test
	public void bppp() throws CorInvalidaException, PosicaoInvalidaException {
		Retorno retorno = new Retorno();
		retorno.adicionarPino("branco");
		retorno.adicionarPino("preto");
		retorno.adicionarPino("preto");
		retorno.adicionarPino("preto");
		
		assertEquals("branco", retorno.getPino(0));
	}
	
	@Test
	public void pbbp() throws CorInvalidaException, PosicaoInvalidaException {
		Retorno retorno = new Retorno();
		retorno.adicionarPino("preto");
		retorno.adicionarPino("branco");
		retorno.adicionarPino("branco");
		retorno.adicionarPino("preto");
		
		assertEquals("preto", retorno.getPino(0));
	}
	
	@Test
	public void pppb() throws CorInvalidaException, PosicaoInvalidaException {
		Retorno retorno = new Retorno();
		retorno.adicionarPino("preto");
		retorno.adicionarPino("preto");
		retorno.adicionarPino("preto");
		retorno.adicionarPino("branco");
		
		assertEquals("branco", retorno.getPino(3));
	}
	
	@Test
	public void nenhumTest() throws PosicaoInvalidaException{
		Retorno retorno = new Retorno();
		
		assertEquals("nenhum", retorno.getPino(0));
	}
	
	@Test
	public void corErradaTest() throws CorInvalidaException, PosicaoInvalidaException{
		Retorno retorno = new Retorno();
		retorno.adicionarPino("preto");
		retorno.adicionarPino("preto");
		retorno.adicionarPino("preto");
		retorno.adicionarPino("branco");
		
		assertFalse("branco" == retorno.getPino(0));
	}
	
	@Test
	public void posicaoInvalida1Test() throws CorInvalidaException, PosicaoInvalidaException{
		Retorno retorno = new Retorno();
		retorno.adicionarPino("preto");
		retorno.adicionarPino("preto");
		retorno.adicionarPino("preto");
		retorno.adicionarPino("branco");
		
		try{
			retorno.getPino(4);
			fail("Posição inválida, maior do que 3!");
		}catch(PosicaoInvalidaException pie){
		}
	}
	
	@Test
	public void posicaoInvalida2Test() throws PosicaoInvalidaException, CorInvalidaException{
		Retorno retorno = new Retorno();
		retorno.adicionarPino("preto");
		retorno.adicionarPino("preto");
		retorno.adicionarPino("preto");
		retorno.adicionarPino("branco");
		
		try{
			retorno.getPino(-2);
			fail("Posição inválida, menor do que 0!");
		}catch(PosicaoInvalidaException pie){
		}
	}

}
