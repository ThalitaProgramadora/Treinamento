package exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exerc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner num = new Scanner(System.in);
			int a1, a2, a3, menor=0, maior=0, medio=0;
			
			System.out.println("Digite o primeiro número: ");
			a1 = num.nextInt();
			
			System.out.println("Digite o segundo número: ");
			a2 = num.nextInt();
			
			System.out.println("Digite o terceiro número: ");
			a3 = num.nextInt();
			
			if(a1 > a2 && a1 > a3) {
				maior = a1;
				if(a2>a3) {
					menor=a3;
					medio=a2;
				}else if (a3>a2) {
						medio = a3;	
					}
				
			}if(a2>a1 && a2>a3) {
				maior=a2;
				if(a1>a3) {
					menor = a3;
					medio = a1;
					
				}else if(a3>a1) {
					medio = a3;
				}
			}if(a3>a2 && a3>a1) {
				maior = a3;
				if(a2>a1) {
					medio = a2;
					menor = a1;
				}
				else if(a1>a2) {
					medio = a1;
				}
			}
			
			JOptionPane.showMessageDialog(null, "O número maior é: "+maior);
			JOptionPane.showMessageDialog(null, "\nO número medio é: "+medio);
			JOptionPane.showMessageDialog(null, "\nO número menor é: "+menor);
		
	}

}
