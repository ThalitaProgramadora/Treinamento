package exercicios;

import java.util.Scanner;

//Crie um programa que leia um número do teclado até que
//encontre um número igual a zero. No final, mostre a 
//soma dos números digitados.(DO...WHILE)
public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cont = new Scanner(System.in);
		
			int num = 0;
			int somar = 0;
					
			   
			do {
				
				if(num!= 0) {
					System.out.println("seu número é: "+num);
					somar = somar + num;
				}
				System.out.println("Digite um número e zero para sair: \n");
				num = cont.nextInt();
				}
			while(num != 0);
				System.out.println("\nA soma dos numeros é: " + somar);
		
	}

}
