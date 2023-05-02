package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
		int calc = num %2;
		
		
		if(calc ==0){
			JOptionPane.showMessageDialog(null, "o numero é par");
		}else {
			JOptionPane.showMessageDialog(null, "o numero é impar");
		}

	}

}
