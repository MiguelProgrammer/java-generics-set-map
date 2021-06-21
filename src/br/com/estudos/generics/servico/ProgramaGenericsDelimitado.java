package br.com.estudos.generics.servico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProgramaGenericsDelimitado {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\migue\\Documents\\arquivo_txt_inteiro.txt"))) {


			String linha = br.readLine();
			while(linha != null) {
				System.out.println(lista.add(Integer.parseInt(linha)));
				linha = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
