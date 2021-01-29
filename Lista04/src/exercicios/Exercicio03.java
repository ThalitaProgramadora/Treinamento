package exercicios;

import java.util.Scanner;
//3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos
//de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos 
//elementos de mesma posição das matrizes N1 e N2.
public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j; 
		int num1[][] = new int[4][6], num2[][] = new int[4][6], matrz1[][] = new int[4][6], matrz2[][] = new int[4][6];

		Scanner ler = new Scanner(System.in);
        
		System.out.println("\n****************************************");
		System.out.println("\nInforme os valores da primeira matriz : ");
		System.out.println("\n****************************************\n");

		for (i = 0; i < 4; i++) {
			System.out.printf("Digite os elementos da  sua %dª linha: \n", (i + 1));

			for (j = 0; j < 6; j++) {
				System.out.printf("Mat[%d][%d] = ", i, j);
				num1[i][j] = ler.nextInt();
			}
		}

		System.out.println("\n****************************************");
		System.out.println("\nInforme os valores da segunda matriz : ");
		System.out.println("\n****************************************\n");

		for (i = 0; i < 4; i++) {
			System.out.printf("Digite os elementos da sua %dª linha: \n", (i + 1));

			for (j = 0; j < 6; j++) {
				System.out.printf("Mat[%d][%d] = ", i, j);
				num2[i][j] = ler.nextInt();
			}
		}

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 6; j++) {
				matrz1[i][j] = num1[i][j] + num2[i][j];
				matrz2[i][j] = num1[i][j] - num2[i][j];
			}
		}
		System.out.println("\n****************************************");
		System.out.println("\nO resultado da matriz : ");
		System.out.println("\n****************************************\n");

		for (i = 0; i < 4; i++) {
			System.out.printf("%dª linha: ", (i + 1));

			for (j = 0; j < 6; j++) {
				System.out.printf("%d ", matrz1[i][j]);
			}
		}
		System.out.println("\n****************************************");
		System.out.println("\nO resultado da matriz : ");
		System.out.println("\n****************************************\n");

		for (i = 0; i < 4; i++) {
			System.out.printf("%dª linha: ", (i + 1));

			for (j = 0; j < 6; j++) {
				System.out.printf("%d ", matrz2[i][j]);
			}
		}
	}

}
