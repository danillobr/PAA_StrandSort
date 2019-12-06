package br.aracomp.strandSort;

import java.util.LinkedList;
import java.util.Random;

public class Entrada {	
	private LinkedList<Integer> lista;
	private Random elementoAleatorio;
	
	public Entrada() {
		lista = null;
		elementoAleatorio = new Random();
	}

	public LinkedList<Integer> gerarListaDeEntradaAleatoria(int tamanho) {
		lista = new LinkedList<Integer>();
		for(int i=0; i<tamanho; i++) {
			this.lista.add(this.elementoAleatorio.nextInt(tamanho));
		}
		return lista;
	}
	
	public LinkedList<Integer> gerarListaDeEntradaCrescente(int tamanho) {
		lista = new LinkedList<Integer>();
		for(int i=0; i<tamanho; i++) {
			this.lista.add(i);
		}
		return lista;
	}
	
	public LinkedList<Integer> gerarListaDeEntradaDecrescente(int tamanho) {
		lista = new LinkedList<Integer>();
		for(int i=tamanho-1; i>=0; i--) {
			this.lista.add(i);
		}
		return lista;
	}
}