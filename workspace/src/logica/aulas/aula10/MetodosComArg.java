package logica.aulas.aula10;

import java.util.Scanner;

public class MetodosComArg {
	
//	METODOS SEM RETORNO COM ARGUMETNOS/PARAMETROS

	static void saudacaoComArgs(String nome, int idade) {
		
		if(idade >=18) {
			System.out.printf("Ola, %s! Você tem %d anos e eh maior de idade",nome, idade);
		}else {
			System.out.print("Menor de idade");
		}
		
	}
	
	static void somar(int numA, int numB) {
		System.out.print("Soma: "+ (numA+numB));
	}
	
	
	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite seu nome: ");
		String nomeDig = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idadeDig = sc.nextInt();
		
		
		saudacaoComArgs(nomeDig, idadeDig);
		*/
		
		somar(10,2);
		
		

	}

}
