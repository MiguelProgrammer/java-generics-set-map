package br.com.estudos.generics.modelo;

import java.util.ArrayList;
import java.util.List;

public class MostrarServico {
	
	List<Object> listaDeServicos = new ArrayList<>();

	public void adicionarValor(Object valor) {
		this.listaDeServicos.add(valor);
	}
	
	public Object primeiroValor() {
		if(this.listaDeServicos.isEmpty()) {
			throw new IllegalStateException("A lista está vazia");
		}
		return listaDeServicos.get(0);
	}
	
	public void listaValores() {
		System.out.print("[");
		 for(Object ms : listaDeServicos) {
			 System.out.print(","+ms.toString());
		 }
		System.out.print("]");
	}
}
