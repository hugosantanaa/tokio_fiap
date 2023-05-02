package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {

		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));
		
		if(idade >= 18 && idade <=70) {
			JOptionPane.showMessageDialog(null, "Seu voto é obrigatório.");	
		}else if(idade<18 && idade >=16 || idade > 70) {
			JOptionPane.showMessageDialog(null, "Seu voto é opcional.");	
		}else {
			JOptionPane.showMessageDialog(null, "Seu voto é proibido.");	
		}
	}

}
