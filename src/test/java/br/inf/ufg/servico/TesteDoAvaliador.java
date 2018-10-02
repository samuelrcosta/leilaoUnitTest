package br.inf.ufg.servico;

import org.junit.Test;

import br.inf.ufg.dominio.Lance;
import br.inf.ufg.dominio.Leilao;
import br.inf.ufg.dominio.Usuario;
import junit.framework.Assert;

public class TesteDoAvaliador {

	@SuppressWarnings("deprecation")
	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		// Parte 1 -> Cenário
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("TV 60 polegadas");
		
		leilao.propoe(new Lance(joao, 3000));
		leilao.propoe(new Lance(jose, 3400));
		leilao.propoe(new Lance(maria, 3300));
		
		// Parte 2 -> Ação
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		// Parte 3 -> Validação
		double maiorEsperado = 3400;
		double menorEsperado = 3000;
		
		Assert.assertEquals(maiorEsperado, avaliador.getMaiorLance(), 0.00001);
		Assert.assertEquals(menorEsperado, avaliador.getMenorLance(), 0.00001);
	}
}
