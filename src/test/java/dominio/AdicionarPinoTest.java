package dominio;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import exceptions.CorInvalidaException;
import jogo.Senha;

/**
 * 
 * Esta classe objetiva o teste dos métodos adicionarPino(String corPino) das classes Retorno e Senha.
 * Os testes são organizados de acordo com a classe a qual eles se referem, utilizado o atributo type 
 * com o valor 0 para testes da classe Retorno e o valor 1 para os testes da classe Senha.
 */

@RunWith(Parameterized.class)
public class AdicionarPinoTest {
	
	private String input;
	private boolean expected;
	private Retorno retorno;
	//0 para teste do método da classe retorno e 1 para teste da classe senha
	private int type;
	private Senha senha;
	
	
	public AdicionarPinoTest(String input, boolean expected, int type){
		this.input = input;
		this.expected = expected;
		this.type = type;
	}
	
	@Before
	public void setUp(){
		retorno = new Retorno();
		senha = new Senha();
	}
	
	@Parameters
	public static Collection<Object[]> values(){
		return Arrays.asList(new Object[][] {
			//Classe Retorno
			{"preto", true, 0},
			{"branco", true, 0},
			{"PRETO", false, 0},
			{"BRANCO", false, 0},
			{null, false, 0},
			{"azul", false, 0},
			//Classe Senha
			{"vermelho", true, 1},
			{"rosa", true, 1},
			{"amarelo", true, 1},
			{"roxo", true, 1},
			{"verde", true, 1},
			{"cinza", true, 1},
			{null, false, 1},
			{"magenta", false, 1},
			{"ROXO", false, 1},
		});
	}
	
	@Test
	public void adicionarPinoTest() throws CorInvalidaException{
		if (this.expected == true){
			if (this.type == 0){
				assertEquals(this.expected, retorno.adicionarPino(this.input));
			}else{
				assertEquals(this.expected, senha.adicionarPino(this.input));
			}
		}else{
			try{
				if (this.type == 0){
					retorno.adicionarPino(this.input);
				}else{
					senha.adicionarPino(this.input);
				}
				fail("Cor para o pino inválida");
			}catch(CorInvalidaException c){
			}
		}
	}
	
}
