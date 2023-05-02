package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio10 {

	public static void main(String[] args) {
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do seu salário"));
		double calc = 0;
		if (salario <=280 ) {
			calc = (salario*20)/100;
			JOptionPane.showMessageDialog(null, "O seu salario "+salario+"\n"
					+ "Recebeu um aumento de 20%\n"
					+"No valor de "+calc+"\n"
					+"E ficou "+(calc+salario));
		}else if(salario>280 && salario <= 700) {
			calc = (salario*15)/100;
			JOptionPane.showMessageDialog(null,  "O seu salario "+salario+"\n"
					+ "Recebeu um aumento de 15%\n"
					+"No valor de "+calc+"\n"
					+"E ficou "+(calc+salario));
		}else if(salario >700 && salario <=1500) {
			calc = (salario*10)/100;
			JOptionPane.showMessageDialog(null, "O seu salario "+salario+"\n"
					+ "Recebeu um aumento de 10%\n"
					+"No valor de "+calc+"\n"
					+"E ficou "+(calc+salario));
		}else {
			calc = (salario*5)/100;
			JOptionPane.showMessageDialog(null,  "O seu salario "+salario+"\n"
					+ "Recebeu um aumento de 5%\n"
					+"No valor de "+calc+"\n"
					+"E ficou "+(calc+salario));

		}
	}

}
