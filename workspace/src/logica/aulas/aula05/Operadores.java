package logica.aulas.aula05;

public class Operadores {

	public static void main(String[] args) {

		float num1 = 5f, num2 = 2f;

		float soma = num1 + num2;
		System.out.println(soma);

		float sub = num1 - num2;
		System.out.println(sub);

		float multi = num1 * num2;
		System.out.println(multi);

		float div = num1 / num2;
		System.out.println(div);

		float resto = num1 % num2;
		System.out.println(resto);

		// OPERADORES UNÁRIOS

		int numero = 15;
		System.out.println("\n" + numero);

		// numero++ = numero = numero +1;
		System.out.println(++numero);

		// OPERADORES DE ATRIBUIÇÃO

		int number = 5;
		number += 5;
		System.out.println("\n" + number);

		number -= 5;
		System.out.println("\n" + number);

		number *= 5;
		System.out.println("\n" + number);

		number /= 5;
		System.out.println("\n" + number);

		number %= 5;
		System.out.println("\n" + number);

		
	}
}
