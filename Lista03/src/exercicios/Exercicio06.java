package exercicios;
//Escrever um programa que receba vários números inteiros no teclado.
//E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner conta = new Scanner(System.in);
        Double mult=0.0,media=0.0,valor=0.0;
        int num;
        do {
        	num = conta.nextInt();
        	if(num%3 ==0 && num >0 || num< 0) {
        		mult++;
        		valor = valor + num;
        		media = valor/3;
        		
        	}
        }while(num !=0);
        JOptionPane.showMessageDialog(null,"os valor multiplos tem um total de: "+mult+"\ne o valor da média é: "+media);
	}

}
