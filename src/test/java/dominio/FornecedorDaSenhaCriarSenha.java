package dominio;

import static org.junit.Assert.*;

import org.junit.*;

import exceptions.PosicaoInvalidaException;
import jogo.Senha;

/*
 * Classe de teste do método criarSenha() da classe FornecedorDaSenha.
 * 
 * O método gera uma senha aleatória e quatro cores diferentes. A inserção de cores repetidas
 * não é problema para o método pois ela já é tratada no método ehSenhaValida(), logo aqui foi
 * testado o fato da geração de senha ser aleatória.
 * 
 * Isto foi feito gerando-se 1.000.000 de senhas através do método criarSenha() e depois
 * comparando se o número de ocorrências de cada cor era ou não discrepante à média esperada.
 */

public class FornecedorDaSenhaCriarSenha {
	
	@Test
	public void testeDeAleatoriedadeDaSenha() {

		int[] contadores = new int[8];
		String string0 = "";
		String string1 = "";
		String string2 = "";
		String string3 = "";

		for (int i = 0; i < 1000000; i++) {
			FornecedorDaSenha fornecedor = new FornecedorDaSenha();
			fornecedor.criarSenha();
			Senha senha = fornecedor.getSenha();

			try {
				string0 = senha.getPino(0);
				string1 = senha.getPino(1);
				string2 = senha.getPino(2);
				string3 = senha.getPino(3);
			} catch (PosicaoInvalidaException e) {
				e.printStackTrace();
			}

			if (string0.equals("vermelho") || string1.equals("vermelho") || string2.equals("vermelho") || string3.equals("vermelho")) {
				contadores[0]++;
			}
			if (string0.equals("azul") || string1.equals("azul") || string2.equals("azul") || string3.equals("azul")) {
				contadores[1]++;
			}
			if (string0.equals("rosa") || string1.equals("rosa") || string2.equals("rosa") || string3.equals("rosa")) {
				contadores[2]++;
			}
			if (string0.equals("amarelo") || string1.equals("amarelo") || string2.equals("amarelo") || string3.equals("amarelo")) {
				contadores[3]++;
			}
			if (string0.equals("roxo") || string1.equals("roxo") || string2.equals("roxo") || string3.equals("roxo")) {
				contadores[4]++;
			}
			if (string0.equals("verde") || string1.equals("verde") || string2.equals("verde") || string3.equals("verde")) {
				contadores[5]++;
			}
			if (string0.equals("cinza") || string1.equals("cinza") || string2.equals("cinza") || string3.equals("cinza")) {
				contadores[6]++;
			}
			if (string0.equals("laranja") || string1.equals("laranja") || string2.equals("laranja") || string3.equals("laranja")) {
				contadores[7]++;
			}
		}

		assertEquals(false, existemDiferencasDiscrepantes(contadores));

	}
	
	private boolean existemDiferencasDiscrepantes(int[] array) {
		int soma = 0;
		for (int elemento : array){
			soma += elemento;
		}
		double media = (double)soma / (double)array.length;
		
		for (int elemento : array){
			if (elemento - media > 10000 || elemento - media < -10000) {
				return true;
			}
		}
		
		return false;
	}
}
