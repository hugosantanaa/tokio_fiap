package logica.exercicios.aula05;

import javax.swing.JOptionPane;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Float valReais = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor em reais para ser convertido"));
		Float dolar=5.08f*valReais, euro=5.56f*valReais, pesoArgentino= 0.023f*valReais, libra= 6.31f*valReais, iene=0.038f*valReais;
		
		JOptionPane.showMessageDialog(null, String.format("valor em reais: %.2f \n valor em Dólar: %.2f \n valor em Euro: %.2f \n valor em peso Argentino: %.2f \n valor em Libra: %.2f \n valor em Iene: %.2f",valReais,dolar,euro,pesoArgentino,libra,iene));
				

	}

}
