package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int num=0, soma=0;

		for (int i=1; i<=10; i++) {
			
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o "+i+" Número"));
			
			soma = soma+num;
			
		}
		JOptionPane.showMessageDialog(null, "A soma é: "+soma);
	}

}
