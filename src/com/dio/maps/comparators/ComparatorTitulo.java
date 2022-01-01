package com.dio.maps.comparators;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import com.dio.maps.entities.Livro;

public class ComparatorTitulo implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
		return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
	}

}
