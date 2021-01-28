package exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exerc03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner num = new Scanner(System.in);
			
			int idade;
			
			System.out.println("Digite a idade da criança ou adulto: ");
			idade = num.nextInt();
			
			if (idade >=10 && idade<=14) {
				JOptionPane.showMessageDialog(null, "categoria INFANTIL");
			}
			else if(idade>=15 && idade<=17) {
				JOptionPane.showMessageDialog(null, "categoria JUVENIL");
			}
			else if(idade>=18 && idade <=25) {
				JOptionPane.showMessageDialog(null, "categoria ADULTO");
			}
			else {
				JOptionPane.showMessageDialog(null, "Por favor, digite uma idade válida!!!");
			}
	}

}
