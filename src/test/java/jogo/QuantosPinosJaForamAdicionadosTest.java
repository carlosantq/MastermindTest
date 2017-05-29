package jogo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/*
 * Classe de teste do método quantosPinoJaForamAdicionados() da classe Tentativa.
 * 
 * Acreditamos que seja uma falha de robustez não poder inserir um pino diretamente na segunda posição, 
 * mas consideramos que isso pode fazer parte da especificação do sistema, visto que de fatos os pinos
 * sempre serão adicionados em ordem, da primeira até a última posição.
 * 
 * Seria impossível testar todas as cores, logo cada cor foi testada apenas sendo inserida na primeira posição.
 * Em seguida foi testado a inserção dos quatro pinos numa tentativa usando somente a cor "vermelho".
 */

public class QuantosPinosJaForamAdicionadosTest {
	
	private Tentativa tentativa;
	
	@Before
	public void setup() {
		tentativa = new Tentativa();
	}
	
	@Test
	public void adicionandoUmPinoVermelho() {
		try {
			tentativa.adicionarPino(0, "vermelho");
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(1, tentativa.quantosPinosJaForamAdicionados());
	}
	
	@Test
	public void adicionandoUmPinoRosa() {
		try {
			tentativa.adicionarPino(0, "rosa");
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(1, tentativa.quantosPinosJaForamAdicionados());
	}
	
	@Test
	public void adicionandoUmPinoAzul() {
		try {
			tentativa.adicionarPino(0, "azul");
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(1, tentativa.quantosPinosJaForamAdicionados());
	}
	
	@Test
	public void adicionandoUmPinoAmarelo() {
		try {
			tentativa.adicionarPino(0, "amarelo");
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(1, tentativa.quantosPinosJaForamAdicionados());
	}
	
	@Test
	public void adicionandoUmPinoRoxo() {
		try {
			tentativa.adicionarPino(0, "roxo");
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(1, tentativa.quantosPinosJaForamAdicionados());
	}
	
	@Test
	public void adicionandoUmPinoVerde() {
		try {
			tentativa.adicionarPino(0, "verde");
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(1, tentativa.quantosPinosJaForamAdicionados());
	}

	@Test
	public void adicionandoUmPinoCinza() {
		try {
			tentativa.adicionarPino(0, "cinza");
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(1, tentativa.quantosPinosJaForamAdicionados());
	}
	
	@Test
	public void adicionandoUmPinoLaranja() {
		try {
			tentativa.adicionarPino(0, "laranja");
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(1, tentativa.quantosPinosJaForamAdicionados());
	}
	
	@Test
	public void adicionandoDoisPinos() {
		try {
			tentativa.adicionarPino(0, "vermelho");
			tentativa.adicionarPino(1, "vermelho");
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(2, tentativa.quantosPinosJaForamAdicionados());
	}
	
	@Test
	public void adicionandoTresPinos() {
		try {
			tentativa.adicionarPino(0, "vermelho");
			tentativa.adicionarPino(1, "vermelho");
			tentativa.adicionarPino(2, "vermelho");
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(3, tentativa.quantosPinosJaForamAdicionados());
	}
	
	@Test
	public void adicionandoQuatroPinos() {
		try {
			tentativa.adicionarPino(0, "vermelho");
			tentativa.adicionarPino(1, "vermelho");
			tentativa.adicionarPino(2, "vermelho");
			tentativa.adicionarPino(3, "vermelho");
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(4, tentativa.quantosPinosJaForamAdicionados());
	}
}
