package logica.exercicios.aula07;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int m =0;
		
		for (int i=1; i <= 12; i++) {
			
			int p = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o "+i+" Valor: "));
			
			if( p > m){
				m = p;
			}
			
									
		}
		JOptionPane.showMessageDialog(null, "O maior valor é: "+m);

	}

}
