package br.com.estudos.generics.programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.estudos.generics.modelo.CalculaServico;
import br.com.estudos.generics.modelo.Produto;

public class ProgramaGenericsDelimitado {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<Produto>();

		try (BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\migue\\Documents\\arquivo_txt_inteiro.txt"))) {

			String infoProduto = br.readLine();

			while (infoProduto != null) {
				
				String[] infoProdutoEspecifico = infoProduto.split(",");
				
				lista.add(new Produto(infoProdutoEspecifico[0],infoProdutoEspecifico[1]));
				infoProduto = br.readLine();
			}

			System.out.println(CalculaServico.maiorValor(lista));

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
