package com.dio.sets.comparators;

import java.util.Comparator;

import com.dio.lists.entities.Gato;

public class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		
		return Integer.compare(g2.getIdade(), g1.getIdade());
	}

}
