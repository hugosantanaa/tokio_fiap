package logica.aulas.aula05;

import java.util.Scanner;

public class Manipulacao {

	public static void main(String[] args) {

		double salario = 1350.50;
		String salarioStr = Double.toString(salario);

		System.out.println(salarioStr.getClass().getSimpleName());

		System.out.println(" "); //apenas pulando linhas
		
		String idade = "25";
		int idadeInt = Integer.parseInt(idade);
		System.out.println(idadeInt);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		String salario2 = entrada.nextLine();
		
		float precoFloat = Float.parseFloat(salario2);
		
		System.out.println("O produto custa R$"+precoFloat);
		
		
	}

}
