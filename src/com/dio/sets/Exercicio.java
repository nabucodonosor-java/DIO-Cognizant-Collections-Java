package com.dio.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio {
	
	public static void main(String[] args) {
		Set<String> arcoIrisHashSet = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
		Set<String> arcoIrisLinkedHashSet = new LinkedHashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
		Set<String> arcoIrisTreeSet = new TreeSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
		
		System.out.println("A - Exiba todas as cores uma abaixo da outra");
		imprimir(arcoIrisLinkedHashSet);
		System.out.println("B - A qtde de cores que o arco-íris tem");
		qtdeDeCores(arcoIrisHashSet);
		System.out.println("C. Cores em Ordem Alfabética");
		imprimir(arcoIrisTreeSet);
		System.out.println("D. Cores na ordem inversa da que foi informada");
		imprimirOrdemInversa(arcoIrisLinkedHashSet);
		System.out.println("E. Cores que começam com a letra v");
		imprimirCoresComecamComV(arcoIrisHashSet);
		System.out.println("F. Remover Cores que não começam com a letra v");
		imprimirCoresQueNaoComecamComV(arcoIrisHashSet);
		System.out.println("F. Limpar Set e Certificar que Está Vazio");
		limparSet(arcoIrisLinkedHashSet);
	}

	private static void limparSet(Set<String> arcoIrisLinkedHashSet) {
		arcoIrisLinkedHashSet.clear();
		System.out.println("Set vazio? -> " + arcoIrisLinkedHashSet.isEmpty());
		
	}

	private static void imprimirCoresQueNaoComecamComV(Set<String> arcoIrisHashSet) {
		
		Iterator<String> it = arcoIrisHashSet.iterator();
		
		while(it.hasNext()) {
			char primeiraLetra = it.next().charAt(0);
			if (primeiraLetra != 'V') {
				it.remove();
			}
		}
		
		imprimir(arcoIrisHashSet);
		
	}

	private static void imprimirCoresComecamComV(Set<String> arcoIrisHashSet) {
		
		for (String s : arcoIrisHashSet) {
			if (s.charAt(0) == 'V') {
				System.out.println(s);
			}
		}
		
	}

	private static void imprimirOrdemInversa(Set<String> arcoIrisLinkedHashSet) {
		List<String> list = new ArrayList<>();
		list.addAll(arcoIrisLinkedHashSet);
		Collections.reverse(list);
		for (String s : list) {
			System.out.println(s);
		}
		
	}

	private static void qtdeDeCores(Set<String> arcoIrisHashSet) {
		System.out.println("Qtde de Cores no Arco-Íris -> " + arcoIrisHashSet.size());
		
	}

	private static void imprimir(Set<String> set) {
		for (String s : set) {
			System.out.println(s);
		}
	}
}
