package logica.exercicios.aula05;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null,"Digite seu nome");
		char genero = JOptionPane.showInputDialog(null,"Digite o seu genero :\n"
				+ "[ M ] para masculino\n"
				+ "[ F ] para feminino\n"
				+ "[ O ] outro\n"
				+ "[ N ] não responder").charAt(0);
		
		JOptionPane.showMessageDialog(null, "Olá, "+nome+"! Você escolheu a segunte opção de gênero: "+genero);
	}

}
