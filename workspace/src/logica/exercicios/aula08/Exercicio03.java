package logica.exercicios.aula08;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		String text = JOptionPane.showInputDialog(null,"Digite uma frase");
		
		int caracMaiusculo=0, caracMinusculo=0, caracNumericos=0, espacoBranco=0;
		
		for(int i=0; i<text.length();i++) {
			char c = text.charAt(i);
			if(Character.isUpperCase(c)) {
				caracMaiusculo++;
			}else if(Character.isLowerCase(c)) {
				caracMinusculo++;
			}else if(Character.isDigit(c)) {
				caracNumericos++;
			}else if(Character.isWhitespace(c)) {
				espacoBranco++;
			}
		} 
		JOptionPane.showMessageDialog(null, "Quantidade caracteres alfabéticos Maiúsculos:"+caracMaiusculo
											+"\nQuantidade caracteres alfabéticos Minúsculos: "+caracMinusculo
											+"\nQuantidade caracteres Númericos: "+caracNumericos
											+"\nQuantidade de espaço em branco: "+espacoBranco);
	}

}
