package br.com.campoMinado;

import br.com.campoMinado.modelo.Tabuleiro;
import br.com.campoMinado.visao.TabuleiroConsole;

public class Aplicacao {
	//main
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
		
		
	}
	
}
