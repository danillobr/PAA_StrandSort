package br.aracomp.strandSort;

import java.util.Iterator;
import java.util.LinkedList;

public class Strand{
	
	//a lista de entrada é destruída
	public static <E extends Comparable<? super E>>
	LinkedList<E> strandSort(LinkedList<E> listaDesordenada){
		if(listaDesordenada.size() <= 1) return listaDesordenada;

		LinkedList<E> resultado = new LinkedList<E>();
		while(listaDesordenada.size() > 0){
			LinkedList<E> listaOrdenada = new LinkedList<E>();
			listaOrdenada.add(listaDesordenada.removeFirst()); //igual a remove () ou remove (0)
			for(Iterator<E> it = listaDesordenada.iterator(); it.hasNext(); ){
				E elemento = it.next();
				if(listaOrdenada.peekLast().compareTo(elemento) <= 0){
					listaOrdenada.addLast(elemento); //igual a add (elemento) ou add (0, elemento)
					it.remove();
				}
			}
			resultado = merge(listaOrdenada, resultado);//mesclar
		}
		return resultado;
	}

	private static <E extends Comparable<? super E>>
	LinkedList<E> merge(LinkedList<E> esquerda, LinkedList<E> direita){
		LinkedList<E> resultado = new LinkedList<E>();
		while(!esquerda.isEmpty() && !direita.isEmpty()){
			//altera a direção dessa comparação para alterar a direção da classificação
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