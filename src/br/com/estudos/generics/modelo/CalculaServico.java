package br.com.estudos.generics.modelo;

import java.util.List;

public class CalculaServico {

	public static <T extends Comparable<T>> T maiorValor(List<T> lista) {
		
		if(lista.isEmpty()) {
			throw new IllegalStateException("A lista está vazia");
		}
		
		T maior = lista.get(0);
		for(T numero : lista) {
			if(maior.compareTo(numero) > 0) {
				maior = numero;
			}
		}
		
		return maior;
	}

}
