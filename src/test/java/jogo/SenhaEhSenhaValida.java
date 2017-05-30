package jogo;

import static org.junit.Assert.*;

import org.junit.*;

import exceptions.CorInvalidaException;

/*
 * Classe de teste do m�todo ehSenhaValida() da classe Senha.
 * 
 * Por ser imposs�vel testar todas as possibilidades de senhas v�lidas e 
 * inv�lidas optamos por testar todos os cen�rios nos quais a senhas seriam
 * inv�lidas e depois testar todas as cores produzindo senhas v�lidas.
 */

public class SenhaEhSenhaValida {

	private Senha senha;
	
	@Before
	public void setup() {
		senha = new Senha();
	}
	
	@Test
	public void senhaInvalidaUmPino() {
		try {
			senha.adicionarPino("vermelho");
		} catch (CorInvalidaException e) {
			e.printStackTrace();
		}
		
		assertEquals(false, senha.ehSenhaValida());
	}
	
	@Test
	public void senhaInvalidaDoisPinos() {
		try {
			senha.adicionarPino("vermelho");
			senha.adicionarPino("azul");
		} catch (CorInvalidaException e) {
			e.printStackTrace();
		}
		
		assertEquals(false, senha.ehSenhaValida());
	}
	
	@Test
	public void senhaInvalidaTresPinos() {
		try {
			senha.adicionarPino("vermelho");
			senha.adicionarPino("azul");
			senha.adicionarPino("rosa");
		} catch (CorInvalidaException e) {
			e.printStackTrace();
		}
		
		assertEquals(false, senha.ehSenhaValida());
	}
	
	@Test
	public void senhaInvalidaPinosRepetidos1() {
		try {
			senha.adicionarPino("amarelo");
			senha.adicionarPino("amarelo");
		} catch (CorInvalidaException e) {
			e.printStackTrace();
		}
		
		assertEquals(false, senha.ehSenhaValida());
	}
	
	@Test
	public void senhaInvalidaPinosRepetidos2() {
		try {
			senha.adicionarPino("roxo");
			senha.adicionarPino("roxo");
			senha.adicionarPino("roxo");
		} catch (CorInvalidaException e) {
			e.printStackTrace();
		}
		
		assertEquals(false, senha.ehSenhaValida());
	}
	
	@Test
	public void senhaInvalidaPinosRepetidos3() {
		try {
			senha.adicionarPino("verde");
			senha.adicionarPino("verde");
			senha.adicionarPino("verde");
			senha.adicionarPino("verde");
		} catch (CorInvalidaException e) {
			e.printStackTrace();
		}
		
		assertEquals(false, senha.ehSenhaValida());
	}
	
	@Test
	public void senhaValida1() {
		try {
			senha.adicionarPino("vermelho");
			senha.adicionarPino("azul");
			senha.adicionarPino("rosa");
			senha.adicionarPino("amarelo");
		} catch (CorInvalidaException e) {
			e.printStackTrace();
		}
		
		assertEquals(true, senha.ehSenhaValida());
	}
	
	@Test
	public void senhaValida2() {
		try {
			senha.adicionarPino("roxo");
			senha.adicionarPino("verde");
			senha.adicionarPino("cinza");
			senha.adicionarPino("laranja");
		} catch (CorInvalidaException e) {
			e.printStackTrace();
		}
		
		assertEquals(true, senha.ehSenhaValida());
	}
}
