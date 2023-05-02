package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
		int calc = num1 % num2;
		
		if(calc ==0){
			JOptionPane.showMessageDialog(null, "São Múltiplos");
		}else {
			JOptionPane.showMessageDialog(null, "Não são Múltiplos");
		}
	}

}
