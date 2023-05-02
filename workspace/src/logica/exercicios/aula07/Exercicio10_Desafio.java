package logica.exercicios.aula07;

public class Exercicio10_Desafio {

	public static void main(String[] args) {
		
		int max=2000;
		
		for(int num=2; num<=max;num++) {
			boolean primo =true;
		for(int div=2; div<num;div++) {
			if(num % div ==0) {
				primo=false;
				break;
			}
		}		
		if (primo){
			System.out.println(num);
		}
		}
		
		
		
	}

}
