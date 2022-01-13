package com.dio.lists.entities;

import java.time.LocalDate;
import java.util.Objects;

public class Gato implements Comparable<Gato> {

	private LocalDate niver;
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato() {
	}

	public Gato(LocalDate niver, String nome, Integer idade, String cor) {
		super();
		this.niver = niver;
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

	public LocalDate getNiver() {
		return niver;
	}

	public void setNiver(LocalDate niver) {
		this.niver = niver;
	}

//	@Override
//	public int compareTo(Gato o) {
//		return this.nome.compareToIgnoreCase(o.getNome());
//	}

	@Override
	public int compareTo(Gato o) {
		return this.niver.compareTo(o.getNiver());
	}

	@Override
	public String toString() {
		return "Gato{" +
				"niver=" + niver +
				", nome='" + nome + '\'' +
				'}';
	}
}
