package exercicios;

import java.util.Scanner;

//Crie um programa que receba valores do usuário para preencher
//uma matriz 3X3, e em seguida, exiba a soma dos valores dela
//e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j; 
		int mat[][] = new int[3][3], soma=0, sDiagonal;

		Scanner doc = new Scanner(System.in);

		for (i = 0; i < 3; i++) {
			System.out.printf("Informe o valor da %dª linha:  ", (i + 1));

			for (j = 0; j < 3; j++) {
				System.out.printf("Mat[%d][%d] = ", i, j);
				mat[i][j] = doc.nextInt();
				soma += mat[i][j];
			}
		}
		
		sDiagonal = mat[0][0]+mat[1][1]+mat[2][2];
		
		System.out.printf("****************************");
		
		for (i = 0; i < 3; i++) {
			System.out.printf("valor da %dª linha: ", (i + 1));
			
			for(j = 0; j < 3; j++) {
				System.out.printf("%d ",mat[i][j]);
			}
		}		
		System.out.printf("\nA soma das matriz é %d e a soma da diagonal é o total de %d.", soma, sDiagonal);
	}

}
