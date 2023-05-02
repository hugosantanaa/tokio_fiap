package logica.exercicios.aula08;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import java.time.DayOfWeek;


public class Exercicio02 {

	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		DayOfWeek diaDaSemana = dataAtual.getDayOfWeek();
		
		if(diaDaSemana == DayOfWeek.TUESDAY) {
			JOptionPane.showMessageDialog(null,"Hoje é terça-feira, haverá feira de rua");
		}else {
			JOptionPane.showMessageDialog(null,"Hoje é "+diaDaSemana+", não haverá feira de rua");
		}
		
		
	}

}
