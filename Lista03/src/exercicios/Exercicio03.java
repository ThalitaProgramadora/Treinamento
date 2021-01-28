package exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       String num;
	        int idade,jovens=0,idosos=0;
	        num = JOptionPane.showInputDialog("Insira uma idade");
	        idade = Integer.parseInt(num);
			while (idade != -99) {	
				if (idade >= 5 && idade <=20 ) {
					jovens++;
				}
				if(idade >=50 && idade <= 100){
					idosos++;
				}
			num = JOptionPane.showInputDialog("Insira uma idade");
	        idade = Integer.parseInt(num);
			}
			JOptionPane.showMessageDialog(null,"A quantidade de jovens foi de: "+jovens+" \ne de idosos foi de: "+idosos);
		}
}

