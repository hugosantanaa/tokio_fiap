package logica.exercicios.aula05;

import javax.swing.JOptionPane;

public class Exercicio05 {
	public static void main (String args[]) {
		

		int notaA = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
		int notaB = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a segunda nota"));
		int resulA = notaA*4;
		int resulB = notaB*6;
		
		JOptionPane.showMessageDialog(null, "a nota é de: "+(resulA+resulB)/10);
	
		
		
	}

}
