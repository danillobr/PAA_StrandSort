package br.aracomp.strandSort;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		long inicio = System.currentTimeMillis();
		Strand ordenar = new Strand();
		Scanner ler = new Scanner(System.in);
		Opcao opc = new Opcao();
		int tamanho;
		int opcao;
		
		System.out.println("Digite o tamanho da Lista: ");
		tamanho = ler.nextInt();
		System.out.println("Escolha a opção:\n"
				+ "1 - Ordenar a Lista Desordenada\n"
				+ "2 - Ordenar a Lista Crescente\n"
				+ "3 - Ordenar a Lista Decrescente");		
		opcao = ler.nextInt();
		
		switch (opcao) {
	        case 1:
	        	opc.opcaoAleatoria(tamanho);
	            break;
	        case 2:
	            opc.opcaoCrescente(tamanho);
	            break;
	        case 3:
	            opc.opcaoDescrescente(tamanho);
	            break;
	        default:
	             System.out.println("Este não é um valor válido!");
		}
		
		long fim  = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		long segundos = tempo / 1000;
		long minutos = segundos / 60;
		segundos = segundos % 60;
		long horas = minutos / 60;
		minutos = minutos % 60;
		String tempo2 = String.format ("%02d:%02d:%02d", horas, minutos, segundos);
		System.out.println("\nTempo de execução: "+tempo2);
	}
}
