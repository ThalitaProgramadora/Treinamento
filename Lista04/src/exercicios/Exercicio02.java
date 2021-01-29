package exercicios;

import java.util.Scanner;
//Um dado é lançado 10 vezes e o valor correspondente é anotado.
//Faça um programa que gere um vetor com os lançamentos, escreva
//esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.
public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, MaiorA=0;
		int vet[] = new int[10];
		float media = 0, soma = 0;
		
		Scanner ler = new Scanner(System.in);

		for (i = 0; i < 10; i++) {
			System.out.printf("Informe o valor da sua %dº jogada agora: ", (i + 1), 10);
			vet[i] = ler.nextInt();			
		}
		System.out.println("As suas jogadas no total foram de: ");
		
		for (i = 0; i < 10; i++) {
			System.out.printf("Vet[%d] = %2d\n", i, vet[i]);
		}
		
		int maior = vet[0];
		
		for (i = 0; i < 10; i++) {
			soma += vet[i];
						
			if (vet[i] > maior) {
				maior = vet[i];
			}
		}
		
		media = soma / i;
		
		for (i = 0; i < 10; i++) {
			if (vet[i] == maior) {
				MaiorA++;
			}
		}
			System.out.printf("A média foi: %5.2f \no maior valor %d e foi lançado %d vezes.", media, maior, MaiorA);
	}

}
