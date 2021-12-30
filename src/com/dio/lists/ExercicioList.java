package com.dio.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.dio.lists.entities.Mes;

public class ExercicioList {
	
	public static void main(String[] args) {
		
		double somaTemperatura = 0d;
		
		Mes jan = new Mes("Janeiro", 18.9);
		Mes fev = new Mes("Fevereiro", 30.5);
		Mes mar = new Mes("Março", 22.1);
		Mes abr = new Mes("Abril", 22.2);
		Mes mai = new Mes("Maio", 8.4);
		Mes jun = new Mes("Junho", 38.0);
		
		List<Mes> listaMeses = new ArrayList<>(Arrays.asList(jan, fev, mar, abr, mai, jun));
		List<Mes> mesesAcimaDaMedia = new ArrayList<>();
		
		for (Mes m : listaMeses) {
			somaTemperatura += m.getMediaTemperatura();
			
		}
		
		double mediaSemestralTemperatura = somaTemperatura / listaMeses.size();
		
		for (Mes m : listaMeses) {
			if (m.getMediaTemperatura() > mediaSemestralTemperatura) {
				mesesAcimaDaMedia.add(m);
			}
			
		}
		
		System.out.println(mesesAcimaDaMedia);
		
	}

}
