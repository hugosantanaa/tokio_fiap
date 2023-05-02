package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	
//	METODOS SEM RETORNO E SEM PARÂMETRO
	static void saudacao() {
	
		System.out.println("Bem-Vindo ao programa");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		
		System.out.printf("Ola, %s! você tem %d anos \n", nome, idade);
		
	
	if (idade >=18) {
		System.out.println("Maior de idade");
	}else {
		System.out.println("Menor de idade");
		}				
	}
	
	
	public static void main(String[] args) {
		
		saudacao();
						
	}

}
