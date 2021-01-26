package turma15;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Exerc04 {

	public static void main(String[] args) {
		int a,b,c;
		double r,s,d,t,p;
		
		Scanner calcular = new Scanner(System.in);
		System.out.println("entre com um valor inteiro positivo: ");
		a = calcular.nextInt();
		System.out.println("entre com um valor inteiro positivo: ");
		b = calcular.nextInt();
		System.out.println("entre com um valor inteiro positivo: ");
		c = calcular.nextInt();
		
		t = (a+b);
	 	r = Math.pow(t,2);
	 	System.out.println("o valor de r ao quadrado é: "+Math.pow(t,2));
	 	p = (b+c);
	 	s = Math.pow(p, 2);
	 	System.out.println("o valor de r ao quadrado é: "+Math.pow(p,2));
	 	d = (r+s)/2;
	 	JOptionPane.showMessageDialog(null, "O resultado de D é: "+d);
	}

}
