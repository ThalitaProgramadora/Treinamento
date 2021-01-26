package turma15;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exerc06 {

	public static void main(String[] args) {
		int x1,x2,y1,y2;
        double d;
          Scanner pontos = new Scanner(System.in);
          
          System.out.println("Digite o valor de X1: ");
          x1 = pontos.nextInt();
          System.out.println("Digite o valor de X2: ");
          x2 = pontos.nextInt();
          System.out.println("Digite o valor de Y1: ");
          y1 = pontos.nextInt();
          System.out.println("Digite o valor de Y2: ");
          y2 = pontos.nextInt();
          System.out.println("fazendo testes");
          
         d =Math.sqrt((Math.pow((x2-x1), 2)+Math.pow((y2-y1),2)));
         JOptionPane.showMessageDialog(null,"O resultado da equação é: "+d);
	}

}
