package br.com.estudos.generics.servico;

import java.util.Scanner;

import br.com.estudos.generics.modelo.MostrarServico;

public class ProgramaDeServico {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		MostrarServico ms = new MostrarServico();
		
		System.out.printf("Insira a quantidade de números a listar: ");
		Integer qtdNumero = input.nextInt();
		
		ms.adicionarValor("Miguel Silva");
		ms.adicionarValor(2.60);
		
		System.out.println();
		for (int contador = 1; contador <= qtdNumero; contador++) {
			System.out.printf("Digite o " + contador + "* número. ");
			Integer digito = input.nextInt();
			ms.adicionarValor(digito);
		}
		
		System.out.print("\nO primero valor dessa lista é: " + ms.primeiroValor() +
				"\n\nListando os valores: \n");
		
		ms.listaValores();

	}

}
