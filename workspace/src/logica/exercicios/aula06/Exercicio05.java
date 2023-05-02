package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
		String op = JOptionPane.showInputDialog(null,"Digite o caractere desejado :\n"
																	+" + Adição\n"
																	+ "- Subtração\n"
																	+ "* Multiplicação\n"
																	+ "/ Divisão");
	
		
		switch(op) {
		case "+":
			 	JOptionPane.showMessageDialog(null, "A soma de "+num1+" + "+num2+ " é : "+(num1+num2));break;
		
		case "-" :
			JOptionPane.showMessageDialog(null, "A Subtração de "+num1+" - "+num2+ " é : "+(num1-num2));break;
		
		case "*":	
			JOptionPane.showMessageDialog(null, "A Multiplicação de "+num1+" * "+num2+ " é : "+(num1*num2));break;	
		
		case "/":	
			JOptionPane.showMessageDialog(null, "A Divisão de "+num1+" / "+num2+ " é : "+(num1/num2));break;	
		
		default:		
			JOptionPane.showMessageDialog(null, "Erro");	
		}
	
	
	}
	

}
