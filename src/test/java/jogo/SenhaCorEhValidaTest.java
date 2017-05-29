package jogo;

import static org.junit.Assert.*;

import org.junit.*;

/*
 * Classe de teste do m�todo ehCorValida() da classe Senha.
 * 
 * Pelo m�todo ser simples foi poss�vel testar todas as entradas v�lidas.
 * Testamos tamb�m algumas entradas inv�lidas coerentes (cores n�o v�lidas)
 * e strings aleat�rias.
 */

public class SenhaCorEhValidaTest {

	private Senha senha;

	@Before
	public void setup() {
		senha = new Senha();
	}

	@Test
	public void corVermelhoTest() {
		assertTrue(senha.CorEhValida("vermelho"));
	}

	@Test
	public void corAzulTest() {
		assertTrue(senha.CorEhValida("azul"));
	}

	@Test
	public void corRosaTest() {
		assertTrue(senha.CorEhValida("rosa"));
	}

	@Test
	public void corAmareloTest() {
		assertTrue(senha.CorEhValida("amarelo"));
	}

	@Test
	public void corRoxoTest() {
		assertTrue(senha.CorEhValida("roxo"));
	}

	@Test
	public void corVerdeTest() {
		assertTrue(senha.CorEhValida("verde"));
	}

	@Test
	public void corCinzaTest() {
		assertTrue(senha.CorEhValida("cinza"));
	}

	@Test
	public void corLaranjaTest() {
		assertTrue(senha.CorEhValida("laranja"));
	}

	@Test
	public void corNaoExistenteTest1() {
		assertFalse(senha.CorEhValida("preto"));
	}

	@Test
	public void corNaoExistenteTest2() {
		assertFalse(senha.CorEhValida("branco"));
	}

	@Test
	public void stringAleatoriaTest1() {
		assertFalse(senha.CorEhValida("qwertyuiop"));
	}

	@Test
	public void stringAleatoriaTest2() {
		assertFalse(senha.CorEhValida("asdfghjkl"));
	}

	@Test
	public void stringAleatoriaTest3() {
		assertFalse(senha.CorEhValida("zxcvbnm"));
	}
}
