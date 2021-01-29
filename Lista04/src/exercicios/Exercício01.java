package exercicios;

import java.util.Scanner;
//Faça um programa que crie um vetor por leitura com 5 valores 
//de pontuação de uma atividade e o escreva em seguida. Encontre 
//após a maior pontuação e a apresente. 
public class Exercício01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int vet[] = new int[5];
		
		Scanner doc = new Scanner(System.in);

		for (i = 0; i < 5; i++) {
			System.out.printf("Informe o valor da  sua %dº pontuação: ", (i + 1));
			vet[i] =doc.nextInt();			
		}
		int maiorP = vet[0];
		for (i = 0; i < 5; i++) {
			if (vet[i] > maiorP) {
				maiorP = vet[i];
			}
		}
		//imitando o professor.kk
		for (i = 0; i < 5; i++) {
			if (vet[i] == maiorP) {
				System.out.printf("Vet[%d] = %2d <-- Maior valor \n", i, vet[i]);
			} else {
				System.out.printf("Vet[%d] = %2d\n", i, vet[i]);
			}
		}
      }
	}


