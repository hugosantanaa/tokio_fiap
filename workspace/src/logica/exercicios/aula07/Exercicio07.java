package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int qtdAcima = 0;
		int qtdAbaixo = 0;
		
		double media = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a média da turma: "));
		
		for(int i=1; i <=20; i++) {
			double nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota do "+i+" Aluno: "));
			
			if(nota>media) {
				qtdAcima++;
			}else {
				qtdAbaixo++;
			}		
		}
		JOptionPane.showMessageDialog(null, "Na sala tem "+qtdAcima+" Alunos com notas superiores a média\n"
				+ "Na sala tem "+qtdAbaixo+ " Alunos com notas inferios a média");
	}

}
