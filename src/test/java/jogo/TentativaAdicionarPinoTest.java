package jogo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exceptions.CorInvalidaException;
import exceptions.PosicaoInvalidaException;

public class TentativaAdicionarPinoTest {
	
	private Tentativa tentativa;
	String pinoInserido0;
	String pinoInserido1;
	String pinoInserido2;
	String pinoInserido3;
	
	@Before
	public void setup() {
		tentativa = new Tentativa();
	}
	
	@Test
	public void AdicionandoVermelho() {
		try {
			tentativa.adicionarPino(0, "vermelho");
			pinoInserido0 = tentativa.getPino(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals("vermelho", pinoInserido0);
	}
	
	@Test
	public void AdicionandoAzul() {
		try {
			tentativa.adicionarPino(0, "azul");
			pinoInserido0 = tentativa.getPino(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals("azul", pinoInserido0);
	}
	
	@Test
	public void AdicionandoRosa() {
		try {
			tentativa.adicionarPino(0, "rosa");
			pinoInserido0 = tentativa.getPino(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals("rosa", pinoInserido0);
	}
	
	@Test
	public void AdicionandoAmarelo() {
		try {
			tentativa.adicionarPino(0, "amarelo");
			pinoInserido0 = tentativa.getPino(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals("amarelo", pinoInserido0);
	}
	
	@Test
	public void AdicionandoRoxo() {
		try {
			tentativa.adicionarPino(0, "roxo");
			pinoInserido0 = tentativa.getPino(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals("roxo", pinoInserido0);
	}
	
	@Test
	public void AdicionandoVerde() {
		try {
			tentativa.adicionarPino(0, "verde");
			pinoInserido0 = tentativa.getPino(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals("verde", pinoInserido0);
	}
	
	@Test
	public void AdicionandoCinza() {
		try {
			tentativa.adicionarPino(0, "cinza");
			pinoInserido0 = tentativa.getPino(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals("cinza", pinoInserido0);
	}
	
	@Test
	public void AdicionandoLaranja() {
		try {
			tentativa.adicionarPino(0, "laranja");
			pinoInserido0 = tentativa.getPino(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals("laranja", pinoInserido0);
	}
	
	@Test
	public void PreenchendoTodaTentativa() {
		try {
			tentativa.adicionarPino(0, "vermelho");
			tentativa.adicionarPino(1, "azul");
			tentativa.adicionarPino(2, "rosa");
			tentativa.adicionarPino(3, "amarelo");
			pinoInserido0 = tentativa.getPino(0);
			pinoInserido1 = tentativa.getPino(1);
			pinoInserido2 = tentativa.getPino(2);
			pinoInserido3 = tentativa.getPino(3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals("vermelho", pinoInserido0);
		assertEquals("azul", pinoInserido1);
		assertEquals("rosa", pinoInserido2);
		assertEquals("amarelo", pinoInserido3);
	}
	
	@Test
	public void PreenchendoTodaTentativa2() {
		try {
			tentativa.adicionarPino(0, "roxo");
			tentativa.adicionarPino(1, "verde");
			tentativa.adicionarPino(2, "cinza");
			tentativa.adicionarPino(3, "laranja");
			pinoInserido0 = tentativa.getPino(0);
			pinoInserido1 = tentativa.getPino(1);
			pinoInserido2 = tentativa.getPino(2);
			pinoInserido3 = tentativa.getPino(3);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals("roxo", pinoInserido0);
		assertEquals("verde", pinoInserido1);
		assertEquals("cinza", pinoInserido2);
		assertEquals("laranja", pinoInserido3);
	}
	
	@Test(expected = CorInvalidaException.class )
	public void AdicionandoCorInexistente1() throws PosicaoInvalidaException, CorInvalidaException {

		tentativa.adicionarPino(0, "preto");

	}
	
	@Test(expected = CorInvalidaException.class )
	public void AdicionandoCorInexistente2() throws PosicaoInvalidaException, CorInvalidaException {

		tentativa.adicionarPino(0, "branco");

	}
	
	@Test(expected = PosicaoInvalidaException.class )
	public void AdicionandoEmPosicaoInvalida1() throws PosicaoInvalidaException, CorInvalidaException {

		tentativa.adicionarPino(-1, "vermelho");

	}
	
	@Test(expected = PosicaoInvalidaException.class )
	public void AdicionandoEmPosicaoInvalida2() throws PosicaoInvalidaException, CorInvalidaException {

		tentativa.adicionarPino(4, "vermelho");

	}
}
