package com.dio.lists.entities;

public class Mes {
	
	private String nome;
	private Double mediaTemperatura;
	
	public Mes() {}

	public Mes(String nome, Double mediaTemperatura) {
		this.nome = nome;
		this.mediaTemperatura = mediaTemperatura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getMediaTemperatura() {
		return mediaTemperatura;
	}

	public void setMediaTemperatura(Double mediaTemperatura) {
		this.mediaTemperatura = mediaTemperatura;
	}

	@Override
	public String toString() {
		return "Mes [nome=" + nome + ", mediaTemperatura=" + mediaTemperatura + "]";
	}
	
}
