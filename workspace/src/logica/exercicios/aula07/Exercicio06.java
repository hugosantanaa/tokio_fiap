package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int v = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
		
		for(int i=2; i<=v; i+=2) {
			System.out.println("Os números pares entre 2 e "+v+" são: "+i);
		}

	}

}
