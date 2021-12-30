package com.dio.lists.comparators;

import java.util.Comparator;

import com.dio.lists.entities.Gato;

public class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}

}
