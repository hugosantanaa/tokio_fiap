package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a opção que deseja consultar: \n"
				 									+ "1) Residência \n"
				 									+ "2) Comércio \n"
				 									+ "3) industria"));
		
		double kWh,calc;
	
		switch(op) {
		case 1 :
			kWh = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de KW/h"));
			calc = kWh*0.60;			
			JOptionPane.showMessageDialog(null, "O valor da conta de energia é "+calc);			
			break;
		
		case 2 :
			kWh = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de KW/h"));
			calc = kWh*0.48;
			JOptionPane.showMessageDialog(null, "O valor da conta de energia é "+calc);
			break;
		
		case 3 :
			kWh = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de KW/h"));
			calc = kWh*1.29;
			JOptionPane.showMessageDialog(null, "O valor da conta de energia é "+calc);
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida ");
		}
		
		
		
//		double residencia = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da conta de sua residência"));
//		double comercio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da conta de sua comécio"));
//		double industria = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da conta de sua indústria"));
	
		
		
	}	

}
