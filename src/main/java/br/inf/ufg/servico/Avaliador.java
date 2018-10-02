package br.inf.ufg.servico;

import br.inf.ufg.dominio.Lance;
import br.inf.ufg.dominio.Leilao;

public class Avaliador {
	
	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	
	public void avalia(Leilao leilao) {
		for(Lance lance : leilao.getLances()) {
			if(lance.getValor() > this.maiorDeTodos){
				this.maiorDeTodos = lance.getValor();
			}
			if(lance.getValor() < this.menorDeTodos) {
				this.menorDeTodos = lance.getValor();
			}
		}
	}
	
	public double getMaiorLance() {
		return this.maiorDeTodos;
	}
	
	public double getMenorLance() {
		return this.menorDeTodos;
	}
}
