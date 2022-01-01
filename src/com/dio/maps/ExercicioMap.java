package com.dio.maps;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExercicioMap {
	
	public static void main(String[] args) {
		
		Map<String, Integer> populacao = new LinkedHashMap<>() {{
			put("MG", 21411923);
			put("BA", 14985284);
			put("SP", 46649132);
			put("RJ", 17463349);
			put("PR", 11597484);
			put("RS", 11466630);
			put("PE", 9674793);
			put("CE", 9240580);
			put("PA", 8777124);
			put("SC", 7338473);
			put("GO", 7206589);
			put("MA", 7153262);
			put("AM", 4269995);
			put("ES", 4108508);
			put("PB", 4059905);
			put("MT", 3567234);
			put("RN", 3560903);
			put("AL", 3365351);
			put("PI", 3289290);
			put("DF", 3094325);
			put("MS", 2839188);
			put("SE", 2338474);
			put("RO", 1815278);
			put("RR", 652713);
			put("TO", 1607363);
			put("AC", 906876);
			put("AP", 877613);
		}};
		
		System.out.println("--------------------------------------------");
		System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");
		System.out.println("--------------------------------------------");
		imprimir(populacao);
		System.out.println("--------------------------------------------");
		System.out.println("Exiba todos os estados em ordem alfabética");
		System.out.println("--------------------------------------------");
		Map<String, Integer> populacaoTreeMap = new TreeMap<>() {{
			putAll(populacao);
		}};
		imprimir(populacaoTreeMap);
		System.out.println("--------------------------------------------");
		System.out.println("Exiba Estado com menor população");
		System.out.println("--------------------------------------------");
		imprimirEstadoMenorPopulacao(populacao);
		System.out.println("--------------------------------------------");
		System.out.println("Exiba Estado com maior população");
		System.out.println("--------------------------------------------");
		imprimirEstadoMaiorPopulacao(populacao);
		System.out.println("--------------------------------------------");
		System.out.println("Exiba a soma da população dos Estado");
		System.out.println("--------------------------------------------");
		System.out.println("Soma = " + somaPopulacao(populacao));
		System.out.println("--------------------------------------------");
		System.out.println("Exiba a média da população");
		System.out.println("--------------------------------------------");
		System.out.println("Média = " + somaPopulacao(populacao) / populacao.size());
		System.out.println("--------------------------------------------");
		System.out.println("Remover Estados com população menor que 4 milhões de hab");
		System.out.println("--------------------------------------------");
		imprimirEstadosComMaisDeQuatroMilhoes(populacao);
	}

	private static void imprimirEstadosComMaisDeQuatroMilhoes(Map<String, Integer> populacao) {
		
		Iterator<Integer> it = populacao.values().iterator();
		
		while(it.hasNext()) {
			int pop = it.next();
			if (pop < 4000000) {
				it.remove();
			}
		}
		
		imprimir(populacao);
		
	}

	private static Integer somaPopulacao(Map<String, Integer> populacao) {
		int soma = 0;
		
		for (Integer i : populacao.values()) {
			soma += i;
		}
		return soma;
	}

	private static void imprimirEstadoMaiorPopulacao(Map<String, Integer> populacao) {
		int maiorPopulacao = Collections.max(populacao.values());
		
		for (Map.Entry<String, Integer> entrada : populacao.entrySet()) {
			if (entrada.getValue() == maiorPopulacao) {
				System.out.println("Estado: " + entrada.getKey() + " - População: " + entrada.getValue());
			}
		}
		
	}

	private static void imprimirEstadoMenorPopulacao(Map<String, Integer> populacao) {
		int menorPopulacao = Collections.min(populacao.values());
		
		for (Map.Entry<String, Integer> entrada : populacao.entrySet()) {
			if (entrada.getValue() == menorPopulacao) {
				System.out.println("Estado: " + entrada.getKey() + " - População: " + entrada.getValue());
			}
		}
	}

	private static void imprimir(Map<String, Integer> populacao) {
		for (Map.Entry<String, Integer> entrada : populacao.entrySet()) {
			System.out.println("Estado: " + entrada.getKey() + " - População: " + entrada.getValue());
		}
		
	}
}
