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

public class AdicionarNovoPinoTentativaTest {
	
	@Mock
	private Adivinho adivinho;
	@Mock
	private Tentativa tentativa;

	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	
	/**
	 * Aqui foram tentados testar os método adicionarNovoPinoATentativa(Tentativa tentativa). 
	 * No primeiro método, foi mockada a cor dos pinos vinda do usuário e o processamento da tentativa.
	 */
	
	/**
	 * Teste Happy Path para adicionarNovoPinoATentativa(Tentativa tentativa)
	 * @throws PosicaoInvalidaException
	 * @throws CorInvalidaException
	 */
	@Test
	public void todasCoresOkTest() throws PosicaoInvalidaException, CorInvalidaException {
		
		String corPino = "vermelho";
		String corPino2 = "verde";
		String corPino3 = "rosa";
		String corPino4 = "azul";
		
		when(tentativa.quantosPinosJaForamAdicionados()).thenReturn(0);
		when(tentativa.adicionarPino(0, corPino)).thenReturn(true);
		
		when(tentativa.quantosPinosJaForamAdicionados()).thenReturn(1);
		when(tentativa.adicionarPino(1, corPino2)).thenReturn(true);
		
		when(tentativa.quantosPinosJaForamAdicionados()).thenReturn(2);
		when(tentativa.adicionarPino(2, corPino3)).thenReturn(true);
		
		when(tentativa.quantosPinosJaForamAdicionados()).thenReturn(3);
		when(tentativa.adicionarPino(3, corPino4)).thenReturn(true);
		
		assertEquals(0, adivinho.adicionarNovoPinoATentativa(tentativa));
	}
	
	/**
	 * Teste Cenário de Exceção para adicionarNovoPinoATentativa(Tentativa tentativa)
	 * @throws PosicaoInvalidaException
	 * @throws CorInvalidaException
	 */
	@Test
	public void corInvalidaTest() throws PosicaoInvalidaException, CorInvalidaException{
		
		try{
			String corPino = "magenta";
			
			when(tentativa.quantosPinosJaForamAdicionados()).thenReturn(0);
			when(tentativa.adicionarPino(0, corPino)).thenThrow(new CorInvalidaException());
			
			adivinho.adicionarNovoPinoATentativa(tentativa);
		}catch (CorInvalidaException cie){
			
		}	
		
	}
	
	/**
	 * Teste Cenário de Exceção para adicionarNovoPinoATentativa(Tentativa tentativa)
	 * @throws PosicaoInvalidaException
	 * @throws CorInvalidaException
	 */
	@Test
	public void posicaoInvalidaTest() throws PosicaoInvalidaException, CorInvalidaException{
			
		try{
			String corPino = "vermelho";
			
			when(tentativa.quantosPinosJaForamAdicionados()).thenReturn(0);
			when(tentativa.adicionarPino(-1, corPino)).thenReturn(true);
			
			adivinho.adicionarNovoPinoATentativa(tentativa);
		}catch(PosicaoInvalidaException pie){
			
		}
		
	}

}
