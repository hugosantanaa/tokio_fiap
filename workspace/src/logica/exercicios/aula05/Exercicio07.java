package logica.exercicios.aula05;

import javax.swing.JOptionPane;

public class Exercicio07 {
	public static void main(String[]args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor do produto"));
		double troco, valorPago = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor pago"));
		
		troco = valorPago - valor;
		
		JOptionPane.showMessageDialog(null, "o troco é de: "+troco);
		
	}
	
	
	
	

}
