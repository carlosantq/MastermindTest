package jogo;

import static org.junit.Assert.*;

import org.junit.*;

/*
 * Classe de teste do m�todo ehCorValida() da classe Tentativa.
 * 
 * Pelo m�todo ser simples foi poss�vel testar todas as entradas v�lidas.
 * Testamos tamb�m algumas entradas inv�lidas coerentes (cores n�o v�lidas)
 * e strings aleat�rias.
 */

public class EhCorValidaTest {
	
	private Tentativa tentativa;
	
	@Before
	public void setup() {
		tentativa = new Tentativa();
	}
	
	@Test
	public void corVermelhoTest() {
		assertTrue(tentativa.CorEhValida("vermelho"));
	}
	
	@Test
	public void corAzulTest() {
		assertTrue(tentativa.CorEhValida("azul"));
	}
	
	@Test
	public void corRosaTest() {
		assertTrue(tentativa.CorEhValida("rosa"));
	}
	
	@Test
	public void corAmareloTest() {
		assertTrue(tentativa.CorEhValida("amarelo"));
	}
	
	@Test
	public void corRoxoTest() {
		assertTrue(tentativa.CorEhValida("roxo"));
	}
	
	@Test
	public void corVerdeTest() {
		assertTrue(tentativa.CorEhValida("verde"));
	}
	
	@Test
	public void corCinzaTest() {
		assertTrue(tentativa.CorEhValida("cinza"));
	}
	
	@Test
	public void corLaranjaTest() {
		assertTrue(tentativa.CorEhValida("laranja"));
	}
	
	@Test
	public void corNaoExistenteTest1() {
		assertFalse(tentativa.CorEhValida("preto"));
	}
	
	@Test
	public void corNaoExistenteTest2() {
		assertFalse(tentativa.CorEhValida("branco"));
	}
	
	@Test
	public void stringAleatoriaTest1() {
		assertFalse(tentativa.CorEhValida("qwertyuiop"));
	}
	
	@Test
	public void stringAleatoriaTest2() {
		assertFalse(tentativa.CorEhValida("asdfghjkl"));
	}
	
	@Test
	public void stringAleatoriaTest3() {
		assertFalse(tentativa.CorEhValida("zxcvbnm"));
	}
}
