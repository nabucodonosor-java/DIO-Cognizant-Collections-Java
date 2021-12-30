package com.dio.lists.entities;

import java.util.Objects;

public class Gato implements Comparable<Gato> {

	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato() {
	}

	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public int compareTo(Gato o) {
		return this.nome.compareToIgnoreCase(o.getNome());
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}
	
}
