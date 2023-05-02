package logica.exercicios.aula08;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		
		String nome = JOptionPane.showInputDialog(null,"Digite seu nome");
		
		if(hora>=0 && hora <6) {
			JOptionPane.showMessageDialog(null, "Boa Madrugada, "+nome+"!");
		}else if(hora>=6 && hora <12) {
			JOptionPane.showMessageDialog(null, "Bom Dia, "+nome+"!");
		}else if(hora>=12 && hora<18) {
			JOptionPane.showMessageDialog(null, "Boa Tarde, "+nome+"!");
		}else {
			JOptionPane.showMessageDialog(null, "Boa Noite, "+nome+"!");
		}
	}	

}
