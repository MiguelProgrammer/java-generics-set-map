package br.com.estudos.generics.programa;

import java.util.ArrayList;
import java.util.List;

public class TiposCoringa {

	public static void main(String[] args) {
		/*
		 * ? É o qualquer o supertipo de qualquer lista
		 */
		List<?> obj = new ArrayList<Object>();
		List<Integer> lint = new ArrayList<Integer>();
		
		obj = lint;
		
	}
}
