package br.aracomp.strandSort;

import java.util.LinkedList;

public class Opcao {
	private Strand ordenar = new Strand();
	private LinkedList<Integer> listaDesordenada;
	private LinkedList<Integer> listaOrdenada;
	
	public void opcaoAleatoria(int tamanho) {
		listaDesordenada = new Entrada().gerarListaDeEntradaAleatoria(tamanho);
		listaOrdenada = ordenar.strandSort(listaDesordenada);	
		
		System.out.println("Ordenação da lista aleatória: \n");
		for(int i=0; i<tamanho; i++) {
			System.out.print(listaOrdenada.get(i)+" ");
			if((i+1)%20==0) {
				System.out.println("\n");
			}
		}
	}
	
	public void opcaoCrescente(int tamanho) {
		listaDesordenada = new Entrada().gerarListaDeEntradaCrescente(tamanho);
		listaOrdenada = ordenar.strandSort(listaDesordenada);
		
		System.out.println("Ordenação da lista crescente: \n");
		for(int i=0; i<tamanho; i++) {
			System.out.print(listaOrdenada.get(i)+" ");
			if((i+1)%20==0) {
				System.out.println("\n");
			}
		}
	}
	
	public void opcaoDescrescente(int tamanho) {
		listaDesordenada = new Entrada().gerarListaDeEntradaDecrescente(tamanho);
		listaOrdenada = ordenar.strandSort(listaDesordenada);
	
		System.out.println("Ordenação da lista decrescente: \n");
		for(int i=0; i<tamanho; i++) {
			System.out.print(listaOrdenada.get(i)+" ");
			if((i+1)%20==0) {
				System.out.println("\n");
			}
		}
	}
}
