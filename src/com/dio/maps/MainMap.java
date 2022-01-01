package com.dio.maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.dio.maps.comparators.ComparatorTitulo;
import com.dio.maps.entities.Livro;

/*
 * Autor: Franco Brasil
 * Bootcamp Cognizant Java Developer
 * Trabalhando com Collections Java
 * Interface Map
 */

public class MainMap {
	
	/*
	 * Testando os método das classes HashMap, LinkedHashMap e TreeMap
	 * 
	public static void main(String[] args) {
		
		Map<String, Double> hashMap = new HashMap<>();
		Map<String, Double> linkedHashMap = new LinkedHashMap<>();
		Map<String, Double> treeMap = new TreeMap<>();
		
		hashMap.put("Gol", 14.4);
		hashMap.put("Uno", 15.6);
		hashMap.put("Mobi", 16.1);
		hashMap.put("HB20", 14.5);
		hashMap.put("Kwid", 15.6);
		
		linkedHashMap.put("Gol", 14.4);
		linkedHashMap.put("Uno", 15.6);
		linkedHashMap.put("Mobi", 16.1);
		linkedHashMap.put("HB20", 14.5);
		linkedHashMap.put("Kwid", 15.6);
		
		treeMap.putAll(hashMap);
		
		System.out.println("---------------------------------");
		System.out.println("MAP VEÍCULOS POPULARES");
		System.out.println("---------------------------------");
		imprimir(hashMap);
		System.out.println("---------------------------------");
		System.out.println("MUDANÇA NO CONSUMO DO GOL");
		System.out.println("---------------------------------");
		substituirConsumoGol("Gol", 15.2, hashMap);
		System.out.println("---------------------------------");
		System.out.println("CONTÊM MODELO TUCSON NO MAP?");
		System.out.println("---------------------------------");
		modeloTucsonExiste(hashMap);
		System.out.println("---------------------------------");
		System.out.println("EXIBE CONSUMO DO UNO");
		System.out.println("---------------------------------");
		imprimirConsumoUno(hashMap);
		System.out.println("---------------------------------");
		System.out.println("EXIBE OS MODELOS");
		System.out.println("---------------------------------");
		imprimirModelos(hashMap);
		System.out.println("---------------------------------");
		System.out.println("EXIBE OS CONSUMOS");
		System.out.println("---------------------------------");
		imprimirConsumos(hashMap);
		System.out.println("---------------------------------");
		System.out.println("EXIBE MODELO MAIS ECONÔMICO");
		System.out.println("---------------------------------");
		imprimirModeloMaisEconomico(hashMap);
		System.out.println("---------------------------------");
		System.out.println("EXIBE MODELO MENOS ECONÔMICO");
		System.out.println("---------------------------------");
		imprimirModeloMenosEconomico(hashMap);
		System.out.println("---------------------------------");
		System.out.println("EXIBE SOMA DOS CONSUMOS");
		System.out.println("---------------------------------");
		System.out.println("Soma dos consumos -> "+somaDosConsumos(hashMap));
		System.out.println("---------------------------------");
		System.out.println("EXIBE MÉDIA DOS CONSUMOS");
		System.out.println("---------------------------------");
		System.out.printf("Média dos consumos -> %.2f\n", somaDosConsumos(hashMap) / hashMap.size());
		System.out.println("---------------------------------");
		System.out.println("REMOVER MODELOS COM CONSUMO 15,6");
		System.out.println("---------------------------------");
		removerModelosConsumo(15.6, hashMap);
		System.out.println("---------------------------------");
		System.out.println("EXIBA OS CARROS NA ORDEM QUE FORAM INFORMADOS");
		System.out.println("---------------------------------");
		imprimir(linkedHashMap);
		System.out.println("---------------------------------");
		System.out.println("ORDENADO POR MODELO");
		System.out.println("---------------------------------");
		imprimir(treeMap);
	}

	private static void removerModelosConsumo(double d, Map<String, Double> hashMap) {
		
		Iterator<Double> it = hashMap.values().iterator();
		
		while(it.hasNext()) {
			if (it.next() == d) {
				it.remove();
			}
		}
		
		imprimir(hashMap);
		
	}

	private static double somaDosConsumos(Map<String, Double> hashMap) {
		
		double soma = 0d;
		for (Double d : hashMap.values()) {
			soma += d;
		}
		return soma;
		
	}

	private static void imprimirModeloMenosEconomico(Map<String, Double> hashMap) {
		
		double maiorConsumo = Collections.max(hashMap.values());
		
		for (Map.Entry<String, Double> entrada : hashMap.entrySet()) {
			if (entrada.getValue() == maiorConsumo) {
				System.out.println("Modelo: " + entrada.getKey() + " - Consumo km/l: " + entrada.getValue());
			}
		}
		
		
	}

	private static void imprimirModeloMaisEconomico(Map<String, Double> hashMap) {
		
		double menorConsumo = Collections.min(hashMap.values());
		
		for (Map.Entry<String, Double> entrada : hashMap.entrySet()) {
			if (entrada.getValue() == menorConsumo) {
				System.out.println("Modelo: " + entrada.getKey() + " - Consumo km/l: " + entrada.getValue());
			}
		}
		
	}

	private static void imprimirConsumos(Map<String, Double> hashMap) {
		System.out.println(hashMap.values());
	}

	private static void imprimirModelos(Map<String, Double> hashMap) {
		System.out.println(hashMap.keySet());
	}

	private static void imprimirConsumoUno(Map<String, Double> hashMap) {
		
		// for (Map.Entry<String, Double> entrada : hashMap.entrySet()) {
			
		// 	if (entrada.getKey().equalsIgnoreCase("uno")) {
				// System.out.println("Consumo do Uno km/l: " + entrada.getValue()); 
		// 	}
		     
		// }
		
		System.out.println("Consumo do Uno km/l -> " + hashMap.get("Uno")); 
	}

	private static void modeloTucsonExiste(Map<String, Double> hashMap) {
		System.out.println("Modelo Tuscon? -> " + hashMap.containsKey("Tucson"));
		
	}

	private static void substituirConsumoGol(String modelo, double consumo, Map<String, Double> hashMap) {
		hashMap.put(modelo, consumo);
		imprimir(hashMap);
		
	}



	private static void imprimir(Map<String, Double> hashMap) {
		
		for (Map.Entry<String, Double> entrada : hashMap.entrySet()) {
		     System.out.println("Modelo: " + entrada.getKey() + " - Consumo km/l: " + entrada.getValue()); 
		}
		
	}
	*/
	
	@SuppressWarnings("serial")
	public static void main(String[] arg) {
		
		Map<String, Livro> meusLivros = new HashMap<>() {{
			put("Celso Furtado", new Livro("Formação Econômica do Brasil", 275));
			put("Ha-Joon Chang", new Livro("Chutando a Escada - A Estratégia do Desenvolvimento em Perspectiva Histórica", 410));
			put("Gabriel García Márquez", new Livro("O amor nos tempos do cólera", 600));
			put("José Saramago", new Livro("O Evangelho segundo Jesus Cristo", 210));
			put("José Saramago", new Livro("A Caverna", 182));
		}};
		

		Map<String, Livro> meusLivrosOrdenadoInsercao = new LinkedHashMap<>() {{
			put("Ha-Joon Chang", new Livro("Chutando a Escada - A Estratégia do Desenvolvimento em Perspectiva Histórica", 410));
			put("Gabriel García Márquez", new Livro("O amor nos tempos do cólera", 600));
			put("José Saramago", new Livro("O Evangelho segundo Jesus Cristo", 210));
			put("José Saramago", new Livro("A Caverna", 182));
			put("Celso Furtado", new Livro("Formação Econômica do Brasil", 275));
		}};
		
		Map<String, Livro> meusLivrosOrdenada = new TreeMap<>() {{
			put("Ha-Joon Chang", new Livro("Chutando a Escada - A Estratégia do Desenvolvimento em Perspectiva Histórica", 410));
			put("Gabriel García Márquez", new Livro("O amor nos tempos do cólera", 600));
			put("José Saramago", new Livro("O Evangelho segundo Jesus Cristo", 210));
			put("José Saramago", new Livro("A Caverna", 182));
			put("Celso Furtado", new Livro("Formação Econômica do Brasil", 275));
		}};
		
		Set<Map.Entry<String, Livro>> meusLivrosOrdenadoPorTitulo = new TreeSet<>(new ComparatorTitulo());
		
		System.out.println("-------------------------------------");
		System.out.println("Ordem Aleatória");
		System.out.println("-------------------------------------");
		imprimir(meusLivros);
		System.out.println("-------------------------------------");
		System.out.println("Ordem de Inserção");
		System.out.println("-------------------------------------");
		imprimir(meusLivrosOrdenadoInsercao);
		System.out.println("-------------------------------------");
		System.out.println("Ordem Alfabética (autores)");
		System.out.println("-------------------------------------");
		imprimir(meusLivrosOrdenada);
		System.out.println("-------------------------------------");
		System.out.println("Ordem Alfabética (Títulos)");
		System.out.println("-------------------------------------");
		meusLivrosOrdenadoPorTitulo.addAll(meusLivros.entrySet());
		imprimirOrdenadoPorTitulo(meusLivrosOrdenadoPorTitulo);
	}




	private static void imprimirOrdenadoPorTitulo(Set<Entry<String, Livro>> meusLivrosOrdenadoPorTitulo) {
		for (Map.Entry<String, Livro> entrada : meusLivrosOrdenadoPorTitulo) {
		     System.out.println("Autor: " + entrada.getKey() + " - Título: " + entrada.getValue().getNome()); 
		}
	}

	private static void imprimir(Map<String, Livro> meusLivros) {
		for (Map.Entry<String, Livro> entrada : meusLivros.entrySet()) {
		     System.out.println("Autor: " + entrada.getKey() + " - Título: " + entrada.getValue().getNome()); 
		}
		
	}
}
