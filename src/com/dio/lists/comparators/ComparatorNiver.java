package com.dio.lists.comparators;

import com.dio.lists.entities.Gato;

import java.util.Comparator;

public class ComparatorNiver implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		
		return g2.getNiver().compareTo(g1.getNiver());
	}

}
