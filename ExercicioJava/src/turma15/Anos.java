package turma15;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Anos {

	public static void main(String[] args) {
		int idade,anos,meses,dias;
		Scanner cal = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade(em dias): ");
		idade = cal.nextInt();
		
		anos = idade/365;
		meses = (idade%365)/12;
		
		JOptionPane.showMessageDialog(null,"Você tem "+anos+" anos");
	}

}
