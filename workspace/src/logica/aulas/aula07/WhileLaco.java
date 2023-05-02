package logica.aulas.aula07;

import java.util.Scanner;

public class WhileLaco {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/*System.out.println("Digite um número da tabuada");
		int n = entrada.nextInt();
		
		int i =0;

		while(i<= 10) {
			System.out.println(n+ " x " +i+ " = "+(n*i));
		
		i++;
		}
		
		
		
		String jogar="sim";
		
		while (jogar.equals("sim")) {
			System.out.println("repete ou iniciar o jogo");
		
			System.out.println("deseja jogar novamente ?");
			jogar = entrada.nextLine();
		}
	*/
		
//		MODIFICAÇÕES DE LAÇO
		
		int i =0;
		
		while (i<10){
		
			i++;
		
		if(i==3) {
			continue;
		}if(i==7) {
			break;
		}
		System.out.println("cambalhota "+i);
		
		}
		
		System.out.println("fim do programa");
		
		
		
		
		
	}

}
