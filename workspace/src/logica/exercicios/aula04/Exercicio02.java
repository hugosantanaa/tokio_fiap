package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();

		System.out.println("Olá, " + nome + "! você tem " + idade + " anos de idade!");

	}

}
