package exercicios;

import java.util.Scanner;

public class exerc04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num= new Scanner(System.in);
			
			int numero;
			double raizP, potI;
			
			System.out.println("Digite um número inteiro: ");
			numero = num.nextInt();
			
			if(numero%2==0){
				raizP = Math.sqrt(numero);
				System.out.println("O número "+numero+" é par e sua raiz quadrada é "+ raizP);
			}
			else if(numero%2!=0) {
				potI = Math.pow(numero, 2);
				System.out.println("O número "+numero+" é ímpar e sua potência é "+potI);
			}
	}

}
