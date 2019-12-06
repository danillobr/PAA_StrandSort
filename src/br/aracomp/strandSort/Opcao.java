package br.aracomp.strandSort;
import java.util.LinkedList;

public class Opcao {
	private Strand ordenar = new Strand();
	private LinkedList<Integer> listaDesordenada;
	private LinkedList<Integer> listaOrdenada;
	
	public void opcaoAleatoria(int tamanho) {
		double inicio = System.currentTimeMillis();

		listaDesordenada = new Entrada().gerarListaDeEntradaAleatoria(tamanho);	
		listaOrdenada = ordenar.strandSort(listaDesordenada);
		
		double fim = System.currentTimeMillis();
		double tempo = fim - inicio;	
		double segundos = (tempo / 1000) % 60;
		int minutos = (int)(tempo / 60000) % 60;
		int horas = (int)tempo / 3600000; 
		
		String tempo2 = String.format ("%d:%d:%02f", horas, minutos, segundos);
		System.out.println("\nTempo de execução: "+tempo2);
		System.out.println("Numero de interações: "+ordenar.getQtdInteracoes());
//		System.out.println("Ordenação da lista aleatória: \n");
//		for(int i=0; i<tamanho; i++) {
//			System.out.print(listaOrdenada.get(i)+" ");
//			if((i+1)%20==0) {
//				System.out.println("\n");
//			}
//		}
	}
	
	public void opcaoCrescente(int tamanho) {
		double inicio = System.currentTimeMillis();
		
		listaDesordenada = new Entrada().gerarListaDeEntradaCrescente(tamanho);
		listaOrdenada = ordenar.strandSort(listaDesordenada);
		
		double fim = System.currentTimeMillis();
		double tempo = fim - inicio;	
		double segundos = (tempo / 1000) % 60;
		int minutos = (int)(tempo / 60000) % 60;
		int horas = (int)tempo / 3600000; 
		
		String tempo2 = String.format ("%d:%d:%02f", horas, minutos, segundos);
		System.out.println("\nTempo de execução: "+tempo2);
		System.out.println("Numero de interações: "+ordenar.getQtdInteracoes());
//		System.out.println("Ordenação da lista crescente: \n");
//		for(int i=0; i<tamanho; i++) {
//			System.out.print(listaOrdenada.get(i)+" ");
//			if((i+1)%20==0) {
//				System.out.println("\n");
//			}
//		}
	}
	
	public void opcaoDescrescente(int tamanho) {
		double inicio = System.currentTimeMillis();
		
		listaDesordenada = new Entrada().gerarListaDeEntradaDecrescente(tamanho);
		listaOrdenada = ordenar.strandSort(listaDesordenada);
		
		double fim = System.currentTimeMillis();
		double tempo = fim - inicio;	
		double segundos = (tempo / 1000) % 60;
		int minutos = (int)(tempo / 60000) % 60;
		int horas = (int)tempo / 3600000; 
		
		String tempo2 = String.format ("%d:%d:%02f", horas, minutos, segundos);
		System.out.println("\nTempo de execução: "+tempo2);
		System.out.println("Numero de interações: "+ordenar.getQtdInteracoes());
//		System.out.println("Ordenação da lista decrescente: \n");
//		for(int i=0; i<tamanho; i++) {
//			System.out.print(listaOrdenada.get(i)+" ");
//			if((i+1)%20==0) {
//				System.out.println("\n");
//			}
//		}
	}
}