package com.dio.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.dio.lists.comparators.ComparatorCor;
import com.dio.lists.comparators.ComparatorIdade;
import com.dio.lists.comparators.ComparatorNomeCorIdade;
import com.dio.lists.entities.Gato;

/*
 * Autor: Franco Brasil
 * Bootcamp Cognizant Java Developer
 * Trabalhando com Collections Java
 * Interface List
 */

public class MainList {
	
	public static void main(String[] args) {
		
		/*
		 * Testando os método da classe ArrayList
		 * 
		List<Double> notas = new ArrayList<>();
		double soma = 0d;
		//double media = 0d;
		int cont = 0;
		
		List<Double> notas2 = new ArrayList<>(Arrays.asList(2.0, 8.5, 9.0, 1.0, 5.0, 6.5, 7.0));
		
		notas.add(10.0);
		notas.add(8.5);
		notas.add(9.0);
		notas.add(1.0);
		notas.add(5.0);
		notas.add(6.5);
		notas.add(7.0);
		
		// atualizando um elemento da lista pelo índice
		notas.set(6, 1d);
		
		System.out.println("ARRAY 01");
		System.out.println(notas);
		System.out.println("***************************************************");
		System.out.println("ARRAY 01 com Laço For Each");
		for (Double n : notas) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("***************************************************");
		System.out.println("******************EXERCÍCIOS***********************");
		System.out.println("***************************************************");
		System.out.println("No Array 01 contém a nota 10? -> " + notas.contains(10.0));
		System.out.println("No Array 01 exiba a 3º nota adicionada -> " + notas.get(2));
		System.out.println("No Array 01 exiba a MENOR nota -> " + Collections.min(notas));
		System.out.println("No Array 01 exiba a MAIOR nota -> " + Collections.max(notas));
		Iterator<Double> it = notas.iterator();
		while(it.hasNext()) {
			soma += it.next();	
		}
		System.out.println("Soma dos elementos do Array 01 -> " + soma);
		System.out.println("Média dos elementos do Array 01 -> " + (soma / notas.size()));
		System.out.printf("Média dos elementos do Array 01 -> %.2f\n", (soma / notas.size()));
		notas.remove(0);
		notas.remove(6.5);
		System.out.println("ARRAY 01 Após exclusão do primeiro elemento e do elemento 6.5");
		System.out.println(notas);
		
		System.out.println("***************************************************");
		*/
		
		Gato siames = new Gato("Sião", 9, "Prateado");
		Gato persa = new Gato("Ciro II", 7, "Dourado");
		Gato sphynx = new Gato("Carvalho", 5, "Rosa Pele");
		Gato munchkin = new Gato("Malcom-X", 10, "Caramelo");
		Gato siberiano = new Gato("Vasily", 3, "Cinza Malhado");
		Gato sphynx2 = new Gato("Toronto", 3, "Branco");
		Gato himalaio = new Gato("Aiatolá", 8, "Preto");
		Gato azulRusso = new Gato("Lenin", 11, "Cinza");
		Gato scottishFold = new Gato("Uísque", 12, "Tigrado");
		
		List<Gato> gatos = new ArrayList<>
		(Arrays.asList(
				siames, persa, sphynx, munchkin, siberiano, sphynx2, himalaio, azulRusso, scottishFold));
		System.out.println("*********************************************************");
		System.out.println("******************POR ORDEM DE INSERÇÃO******************");
		System.out.println("*********************************************************");
		imprimir(gatos);
		System.out.println("*********************************************************");
		System.out.println("****************ORDEM ALEATÓRIA - SHUFFLE****************");
		System.out.println("*********************************************************");
		imprimirOrdemAleatoria(gatos);
		System.out.println("*********************************************************");
		System.out.println("********************ORDENADO POR NOME********************");
		System.out.println("*********************************************************");
		imprimirOrdeadoPorNome(gatos);
		System.out.println("*********************************************************");
		System.out.println("*******************ORDENADO POR IDADE********************");
		System.out.println("*********************************************************");
		imprimirOrdeadoPoridade(gatos, new ComparatorIdade());
		System.out.println("*********************************************************");
		System.out.println("*******************ORDENADO POR COR********************");
		System.out.println("*********************************************************");
		imprimirOrdeadoPorCor(gatos, new ComparatorCor());
		System.out.println("*********************************************************");
		System.out.println("**************ORDENADO POR NOME/COR/IDADE****************");
		System.out.println("*********************************************************");
		imprimirOrdeadoPorNomeCorIdade(gatos, new ComparatorNomeCorIdade());
		
	}
	
	private static void imprimirOrdeadoPorNomeCorIdade(List<Gato> gatos, ComparatorNomeCorIdade cNCI) {
		Collections.sort(gatos, cNCI);
		imprimir(gatos);
	}
	
	private static void imprimirOrdeadoPoridade(List<Gato> gatos, ComparatorIdade cIdade) {
		Collections.sort(gatos, cIdade);
		imprimir(gatos);
	}
	
	private static void imprimirOrdeadoPorCor(List<Gato> gatos, ComparatorCor ccor) {
		Collections.sort(gatos, ccor);
		imprimir(gatos);
	}
	
	private static void imprimirOrdeadoPorNome(List<Gato> gatos) {
		Collections.sort(gatos);
		imprimir(gatos);
	}

	private static void imprimirOrdemAleatoria(List<Gato> gatos) {
		Collections.shuffle(gatos);
		imprimir(gatos);
	}

	private static void imprimir(List<Gato> gatos) {
		for (Gato g : gatos) {
			System.out.println(g);
		}
	}

}
