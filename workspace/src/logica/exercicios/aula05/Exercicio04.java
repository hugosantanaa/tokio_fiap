package logica.exercicios.aula05;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int notaA = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a primeira nota"));
		int notaB = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a segunda nota"));
		
		
		JOptionPane.showMessageDialog(null,"a nota é de: "+(notaA+notaB/2));
	}

}
