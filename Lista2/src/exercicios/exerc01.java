package exercicios;

import java.util.Scanner;

public class exerc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner (System.in);
			int n1, n2, n3;
			
			System.out.println("Entre com o 1º numero inteiro: ");
			n1 = num.nextInt();
			System.out.println("Entre com o 2° numero inteiro: ");
			n2 = num.nextInt();
			System.out.println("Entre com o 3° numero inteiro: ");
			n3 = num.nextInt();
			
			if (n1 > n2){
			    if(n1 > n3){
			        System.out.printf("O maior número é: %d\n", n1);
			    }else
			    {
			        System.out.printf("O maior número é: %d\n", n3);
			    }
			}else{
			    if(n2 > n3){
			        System.out.printf("O maior número é: %d\n", n2);
			    }else
			    {
			        
			    	System.out.printf("O maior número é: %d\n", n3);
			        
			   
			    }
			    				
			}
		
	}

}
