package com.dio.maps.entities;

import java.util.Map;
import java.util.Map.Entry;

public class Livro implements Comparable<Map.Entry<String, Livro>> {
	
	private String nome;
	private Integer totalPaginas;
	
	public Livro() {}

	public Livro(String nome, Integer totalPaginas) {
		this.nome = nome;
		this.totalPaginas = totalPaginas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(Integer totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	@Override
	public String toString() {
		return "[Título: " + nome + ", totalPaginas: " + totalPaginas + "]";
	}

	@Override
	public int compareTo(Entry<String, Livro> livro) {
		return this.nome.compareTo(livro.getValue().getNome());
	}

}
