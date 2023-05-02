package logica.exercicios.aula05;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número até 999"));
		
		int centena = num / 100;
		int dezena = (num % 100) /10;
		int unidade = num%10;
		
		JOptionPane.showInputDialog(null, "Centena "+centena*100+
										   "\n Dezena "+dezena*10+
										   "\n Unidade "+unidade);

	}

}
