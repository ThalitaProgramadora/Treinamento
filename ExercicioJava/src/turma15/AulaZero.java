package turma15;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AulaZero {

	public static void main(String[] args) {
	 float n1,n2,n3,media;
	 
	  Scanner ler = new Scanner(System.in);
      System.out.println("Entre com a primeira nota:");
      n1 = ler.nextFloat();
      
      System.out.println("Entre com a primeira nota:");
      n2 = ler.nextFloat();
      
      System.out.println("Entre com a primeira nota:");
      n3 = ler.nextFloat();
      
      media = (n1+n2+n3)/3;
      JOptionPane.showMessageDialog(null,"A sua média é: "+media);
	}

}
