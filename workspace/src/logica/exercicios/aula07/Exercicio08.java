package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		
		int n,soma=0;
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro e que seja positivo: "));
		}while(n<=0);
		
		for(int i=1; i<=n; i++) {
			soma +=i;
		}
		
		JOptionPane.showMessageDialog(null, "A soma de 1 até "+n+" é: "+soma);
		
	}

}
