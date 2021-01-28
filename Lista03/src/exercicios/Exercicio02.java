package exercicios;

import javax.swing.JOptionPane;

//2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Double num = 2.0;
      int x=1,par=0,impar=0;
     for (x=1; x<=10;x++) {	
    	
			if (num%2 == 0 ) {
				par++;
			}else {
				impar++;
			}
			 num = Math.random()*(10-5);
	         System.out.println(num);
		}JOptionPane.showMessageDialog(null,"A quantidade de números pares são de: "+par+"\ne de impar: "+impar);
		
	}

}
