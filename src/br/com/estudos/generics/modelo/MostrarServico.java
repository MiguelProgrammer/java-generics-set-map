package br.com.estudos.generics.modelo;

import java.util.ArrayList;
import java.util.List;

public class MostrarServico<T> {
	
	List<T> listaDeServicos = new ArrayList<>();

	public void adicionarValor(T valor) {
		this.listaDeServicos.add(valor);
	}
	
	public T primeiroValor() {
		if(this.listaDeServicos.isEmpty()) {
			throw new IllegalStateException("A lista está vazia");
		}
		return listaDeServicos.get(0);
	}
	
	public void listaValores() {
		System.out.print("["+listaDeServicos.get(0));
		 for(int i = 1; i < listaDeServicos.size(); i++) {
			 System.out.print(","+listaDeServicos.get(i));
		 }
		System.out.print("]");
	}
}
