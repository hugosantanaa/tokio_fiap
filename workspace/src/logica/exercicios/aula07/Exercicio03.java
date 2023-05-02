package logica.exercicios.aula07;

import javax.swing.JOptionPane;


public class Exercicio03 {

	public static void main(String[] args) {
		
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));
		
		
		for(int i= 0; i<=25; i++) {
			
			System.out.println(num+" x "+i+" = "+(num*i));
			
		}
	
	
	
	
	}

}
