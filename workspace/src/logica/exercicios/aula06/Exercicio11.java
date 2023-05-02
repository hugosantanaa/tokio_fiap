package logica.exercicios.aula06;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		
		int codOrigem = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código do estado da carga :\n"
				+ "1)SP - São Paulo\n"
				+ "2)RJ - Rio de Janeiro\n"
				+ "3)DF - Distrito Federal\n"
				+ "4)CE - Ceará\n"
				+ "5)ES - Espírito Santo"));
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o peso da carga em toneladas :"));
		int codCarga = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o código da carga (10 à 40) :"));
		peso = peso*1000;
		
		
		switch(codOrigem) {
		case 1:
			if(codCarga >=10 && codCarga <=20) {
				float precoCarga = (float) (peso*100);
				float imposto = precoCarga*0.35f;
				float total = precoCarga+imposto;
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",total));
				
			}else if (codCarga >20 && codCarga <=30){
				float precoCarga = (float) (peso*250);
				float imposto = precoCarga*0.35f;
				float total = precoCarga+imposto;
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",total));
				
				
			}else if(codCarga >30 && codCarga <=40) {
				float precoCarga = (float) (peso*340);
				float imposto = precoCarga*0.35f;
				float total = precoCarga+imposto;
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",total));
			}else {
				JOptionPane.showMessageDialog(null, "Código da carga inválido");
			}
			break;
		case 2:
			if(codCarga >=10 && codCarga <=20) {
				float precoCarga = (float) (peso*100);
				float imposto = precoCarga*0.25f;
				float total = precoCarga+imposto;
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",total));
				
			}else if (codCarga >20 && codCarga <=30){
				float precoCarga = (float) (peso*250);
				float imposto = precoCarga*0.25f;
				float total = precoCarga+imposto;
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",total));
				
			}else if(codCarga >30 && codCarga <=40) {
				float precoCarga = (float) (peso*340);
				float imposto = precoCarga*0.25f;
				float total = precoCarga+imposto;
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",total));
			}else {
				JOptionPane.showMessageDialog(null, "Código da carga inválido");
			}
			break;
		case 3:
			if(codCarga >=10 && codCarga <=20) {
				float precoCarga = (float) (peso*100);
				float imposto = precoCarga*0.15f;
				float total = precoCarga+imposto;
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",total));
				
			}else if (codCarga >20 && codCarga <=30){
				float precoCarga = (float) (peso*250);
				float imposto = precoCarga*0.15f;
				float total = precoCarga+imposto;
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",total));
			}else if(codCarga >30 && codCarga <=40) {
				float precoCarga = (float) (peso*340);
				float imposto = precoCarga*0.15f;
				float total = precoCarga+imposto;
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",total));
			}else {
				JOptionPane.showMessageDialog(null, "Código da carga inválido");
			}
			break;
		case 4:
			if(codCarga >=10 && codCarga <=20) {
				float precoCarga = (float) (peso*100);
				float imposto = precoCarga*0.05f;
				float total = precoCarga+imposto;
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",total));
				
			}else if (codCarga >20 && codCarga <=30){
				float precoCarga = (float) (peso*250);
				float imposto = precoCarga*0.5f;
				float total = precoCarga+imposto;
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",total));
			}else if(codCarga >30 && codCarga <=40) {
				float precoCarga = (float) (peso*340);
				float imposto = precoCarga*0.05f;
				float total = precoCarga+imposto;
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",total));
			}else {
				JOptionPane.showMessageDialog(null, "Código da carga inválido");
			}
			break;
		case 5:
			if(codCarga >=10 && codCarga <=20) {
				float precoCarga = (float) (peso*100);
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",precoCarga));
				
			}else if (codCarga >20 && codCarga <=30){
				float precoCarga = (float) (peso*250);
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",precoCarga));
			}else if(codCarga >30 && codCarga <=40) {
				float precoCarga = (float) (peso*340);
				JOptionPane.showMessageDialog(null, String.format("O valor total transportado pela carga é: R$%.2f",precoCarga));
			}else {
				JOptionPane.showMessageDialog(null, "Código da carga inválido");
			}
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opção de estado inválida");
		}
		
	
	
	}

}
