package com.dio.sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.dio.lists.comparators.ComparatorNomeCorIdade;
import com.dio.lists.entities.Gato;
import com.dio.sets.comparators.ComparatorGenero;
import com.dio.sets.entities.Serie;

/*
 * Autor: Franco Brasil
 * Bootcamp Cognizant Java Developer
 * Trabalhando com Collections Java
 * Interface Set
 */

public class MainSet {
	
	/*
	 * 
	 * Testando os método das classes HashSet, LinkedHashSet e TreeSet
	 * 
	
	public static void main(String[] args) {
		
		Set<Double> notasHashSet = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		Set<Double> notasLinkHashSet = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		Set<Double> notasTreeSet = new TreeSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		
		// clonarHashSetParaLinkedHashSet(notasHashSet, notasLinkHashSet);
		
		System.out.println("************************************************");
		System.out.println("************Implementação HashSet***************");
		System.out.println("************************************************");
		imprimir(notasHashSet);
		contemElemento(5d, notasHashSet);
		exibirMenorNota(notasHashSet);
		exibirMaiorNota(notasHashSet);
		exibirSomaNotas(notasHashSet);
		exibirMediaNotas(notasHashSet);
		removerNotaZero(0d, notasHashSet);
		removerNotasMenoresSete(7d, notasHashSet);
		System.out.println("************************************************");
		System.out.println("***********Implementação LinkedHashSet**********");
		System.out.println("************************************************");
		imprimir(notasLinkHashSet);
		System.out.println("************************************************");
		System.out.println("**************Implementação TreeSet*************");
		System.out.println("************************************************");
		imprimir(notasTreeSet);
		
	}

	private static Set<Double> clonarHashSetParaLinkedHashSet(Set<Double> notasHashSet, Set<Double> notasLinkHashSet) {
		
		notasLinkHashSet.addAll(notasHashSet);
		
		return notasLinkHashSet;
		
	}

	private static void removerNotasMenoresSete(double d, Set<Double> notasHashSet) {
		
		Iterator<Double> it2 = notasHashSet.iterator();
		
		while(it2.hasNext()) {
			Double num = it2.next();
			if (num < 7) {
				it2.remove();
			}
		}
		
		System.out.println("Exclusão das Notas Menores que Sete");
		imprimir(notasHashSet);
		
	}

	private static void removerNotaZero(double d, Set<Double> notasHashSet) {
		System.out.println("Array Original");
		imprimir(notasHashSet);
		notasHashSet.remove(d);
		System.out.println("Array Após Exclusão do zero");
		imprimir(notasHashSet);
		
	}

	private static void exibirSomaNotas(Set<Double> notasHashSet) {
		
		System.out.printf("Soma das notasHashSet -> %.2f\n", somaNotas(notasHashSet));
		
	}
	
	private static Double somaNotas(Set<Double> notasHashSet) {
		Iterator<Double> it = notasHashSet.iterator();
		Double soma = 0d;
		
		while(it.hasNext()) {
			soma += it.next();
		}
		
		return soma;
		
	}

	private static void exibirMediaNotas(Set<Double> notasHashSet) {
		
		double media = somaNotas(notasHashSet) / notasHashSet.size();
		
		System.out.printf("A média das notasHashSet é -> %.2f\n", media);
		
	}

	private static void exibirMaiorNota(Set<Double> notasHashSet) {
		System.out.println("A maior nota do Set é -> " + Collections.max(notasHashSet));
		
	}

	private static void exibirMenorNota(Set<Double> notasHashSet) {
		System.out.println("A menor nota do Set é -> " + Collections.min(notasHashSet));
		
	}

	private static void contemElemento(double d, Set<Double> notasHashSet) {
		System.out.println("Contém o elemento " + d + " no Set? -> " + notasHashSet.contains(d));
		
	}

	private static void imprimir(Set<Double> notasHashSet) {
		System.out.println(notasHashSet);
		
	}
	*/
	
	public static void main(String[] args) {
		
		Serie spartacus = new Serie("Spartacus", "Ação", 40);
		Serie spartacus2 = new Serie("Spartacus", "Drama", 30);
		Serie ruaDoMedo = new Serie("Rua do Medo", "Terror", 50);
		Serie mandalorian = new Serie("Mandalorian", "Sci-fi", 50);
		Serie lucifer = new Serie("Lucifer", "Comédia", 30);
		Serie got = new Serie("GOT", "Drama", 40);
		Serie got2 = new Serie("GOT", "Drama", 10);
		
		Set<Serie> seriesHashSet = new HashSet<>(Arrays.asList(
				spartacus, ruaDoMedo, mandalorian, lucifer, got, got2, spartacus2));
		
		Set<Serie> seriesLinkHashSet = new LinkedHashSet<>(Arrays.asList(
				spartacus, ruaDoMedo, mandalorian, lucifer, got, got2, spartacus2));
		
		Set<Serie> seriesTreeSet = new TreeSet<>(Arrays.asList(
				spartacus, ruaDoMedo, mandalorian, lucifer, got, got2, spartacus2));
		
		System.out.println("Ordem Aleatória HashSet");
		imprimir(seriesHashSet);
		System.out.println("Ordem de Inserção");
		imprimir(seriesLinkHashSet);
		System.out.println("Ordenado Por Nome");
		imprimir(seriesTreeSet);
		
	}
	
/*
	private static void imprimirOrdeadoPorGenero(Set<Serie> series, ComparatorGenero cGenero) {
		Collections.sort(series, cGenero);
		imprimir(series);
	}

*/
	private static void imprimir(Set<Serie> series) {
		for (Serie s : series) {
			System.out.println(s);
		}
		
	}
	
}
