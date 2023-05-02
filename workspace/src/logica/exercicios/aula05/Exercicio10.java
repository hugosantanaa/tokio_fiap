package logica.exercicios.aula05;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int anos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos anos você tem: "));
		int meses = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos meses de idade você tem: "));
		int calc, dias = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite quantos dias de idade viveu: "));

		calc = (anos*365)+ meses*30 +dias ;
		JOptionPane.showMessageDialog(null, "Você ja viveu " +calc+ " Dias");
	}

}
