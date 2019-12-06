package br.aracomp.strandSort;

import java.util.Iterator;
import java.util.LinkedList;

public class Strand{
	
	private int qtdInteracoes;
	
	public Strand() {
		this.qtdInteracoes = 0;
	}
	
	public int getQtdInteracoes() {
		return qtdInteracoes;
	}
	
	//a lista de entrada é destruída
	public LinkedList<Integer> strandSort(LinkedList<Integer> listaDesordenada){
		if(listaDesordenada.size() <= 1) return listaDesordenada;
		LinkedList<Integer> resultado = new LinkedList<Integer>();
		while(listaDesordenada.size() > 0){	
			this.qtdInteracoes+=1;
			LinkedList<Integer> listaOrdenada = new LinkedList<Integer>();
			listaOrdenada.add(listaDesordenada.removeFirst()); //igual a remove () ou remove (0)
			for(Iterator<Integer> it = listaDesordenada.iterator(); it.hasNext(); ){
				Integer elemento = it.next();
				if(listaOrdenada.peekLast().compareTo(elemento) <= 0){
					this.qtdInteracoes+=1;
					listaOrdenada.addLast(elemento); //igual a add (elemento) ou add (0, elemento)
					it.remove();
				}
			}
			resultado = merge(listaOrdenada, resultado);//mesclar
		}
		return resultado;
	}

	private LinkedList<Integer> merge(LinkedList<Integer> esquerda, LinkedList<Integer> direita){
		LinkedList<Integer> resultado = new LinkedList<Integer>();
		while(!esquerda.isEmpty() && !direita.isEmpty()){
			//altera a direção dessa comparação para alterar a direção da classificação
			this.qtdInteracoes+=1;
			if(esquerda.peek().compareTo(direita.peek()) <= 0)
				resultado.add(esquerda.remove());
			else
				resultado.add(direita.remove());
		}
		resultado.addAll(esquerda);
		resultado.addAll(direita);
		return resultado;
	}
}