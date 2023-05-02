package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int num;
		
		do {
			 num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro positivo"));
		}while(num<0);
		System.out.println("Os números divisores de "+num+" são \n");
		for(int i=1; i<=num; i++) {
			if(num % i ==0) {
			System.out.println(i);
			}
		}
	}

}
