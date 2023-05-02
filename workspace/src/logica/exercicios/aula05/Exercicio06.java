package logica.exercicios.aula05;

import javax.swing.JOptionPane;

public class Exercicio06 {
	public static void main(String []args) {
		

		int qtdPeca1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade da peça 1"));
		double op1, valPeca1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da peça 1"));
		
		int qtdPeca2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade da peça 2"));
		double op2, valPeca2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da peça 2"));

		op1 = qtdPeca1 + valPeca1;
		op2 = qtdPeca2 + valPeca2;
		
		JOptionPane.showMessageDialog(null, "O valor a ser pago é: "+(op1+op2));
		
	}

}
