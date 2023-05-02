package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quarta nota"));
		double media = (nota1+nota2+nota3+nota4)/4;
		
		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "Sua nota é : "+media+
												"\nVocê esta APROVADO");
		}else if (media >=5 && media <7) {
			JOptionPane.showMessageDialog(null, "Sua nota é : "+media+
												"\nVocê esta de RECUPERAÇÃO");
		}else {
			JOptionPane.showMessageDialog(null, "Sua nota é :  "+media+
												"\nVocê esta REPROVADO");
		}
		
	}

}
