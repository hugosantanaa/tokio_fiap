package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		
		int km = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos km você percorreu: "));
		int calc, litros = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos litros de combustível foi gasto: "));
		calc = km/litros;
		
		if(calc<8) {
			JOptionPane.showMessageDialog(null, "Esse carro bebe hein!");	
		}else {
			JOptionPane.showMessageDialog(null, "Autonomia legal!");	
		}
	}

}
