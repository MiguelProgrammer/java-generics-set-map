package br.com.estudos.generics.programa;

import java.util.Arrays;
import java.util.List;

public class TiposCoringaRecebeQualquerTipo {

	public static void main(String[] args) {

		List<Integer> lint = Arrays.asList(5,2,4);	
		printList(lint);

		List<String> nomes = Arrays.asList("Miguel", "Jéssica", "Sarah", "Déborah");	
		printList(nomes);

		List<Double> doubles = Arrays.asList(2.89, 2.009, 2.1, 3.14);	
		printList(doubles);
	}
	
	public static void printList(List<?> lista) {
		for(Object obj : lista) {
			System.out.println(obj);
		}
	}
}
