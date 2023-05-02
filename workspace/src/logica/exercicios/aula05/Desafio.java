package logica.exercicios.aula05;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		
		int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos dias de vida você ja viveu"));
		
		int a = dias/365;
		dias %=365;
		
		int m = dias/30;
		dias %= 30;
		
		int d = dias;
		
		JOptionPane.showMessageDialog(null, "voce viveu:\n"+a+ " anos \n"
											+m+" meses \n"
											+d+" dias \n");
		
	
	
	}

}
