package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
	
		
		if (num1==num2) {
			JOptionPane.showMessageDialog(null, "Os números são iguais.");
		}else if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "O número "+num1+", é maior que o número"+num2+".");
		}else {
			JOptionPane.showMessageDialog(null, "O número "+num2+", é maior que o número "+num1+".");
		}
		
		
		
	
	}
	
	

}
