package exercicios;

import javax.swing.JOptionPane;

//4 Uma empresa desenvolveu uma pesquisa para saber as características 
//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das
//pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
//e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, 
//se a pessoa era agressiva). Pede-se para elaborar um sistema que 
//permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
//• o número de pessoas calmas; 
//• o número de mulheres nervosas; 
//• o número de homens agressivos; 
//• o número de outros calmos;
//• o número de pessoas nervosas com mais de 40 anos; 
//• o número de pessoas calmas com menos de 18 anos.
public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num;
		int inum=1,idade=0,genero=0,opcao=0,calmosP=0,nervosasMulheres=0,agressivosHomens=0;
		int calmosOutros=0,nervososQuarenta=0,calmosAdolescentes=0;
		
        while(inum <=  1) {
        	num = JOptionPane.showInputDialog("Insira uma idade:");
            idade = Integer.parseInt(num);
            num = JOptionPane.showInputDialog("Por favor, qual seu genero?\n1 - Feminino \n 2 - Masculino\n 3 - Outros:\n");
            genero = Integer.parseInt(num);
            num = JOptionPane.showInputDialog("Como você se considera?\n1 - Calmo (a)\n 2 - Nervoso (a)\n 3 - Agressivos:\n");
            opcao = Integer.parseInt(num);
       
            
            if(opcao ==  3) {
            	calmosP ++ ;
            }
            if (genero ==  1  && opcao ==  2 ) {
				nervosasMulheres ++ ;
			}
			if (genero ==  2  && opcao == 3 ) {
				agressivosHomens ++ ;
			}
			if (genero ==  3  && opcao ==  1 ) {
				calmosOutros ++ ;
			}
			if (idade >  40  && opcao ==  2 ) {
				nervososQuarenta ++ ;
			}
			if (idade <  18  && opcao ==  1 ) {
				calmosAdolescentes ++ ;
			}
			System.out.println("Você é a pessoa número:" +inum);
			inum ++ ;
        }
        JOptionPane.showMessageDialog(null," O numero de pessoas calmas é: "  + calmosP+"\nO numero de mulheres nervosas é: "  + nervosasMulheres
        		+"\nO numero de homens agressivos é: "  + agressivosHomens+"\nO numeros de outros calmos é: "  + calmosOutros 
        		+" O numero de pessoas maiores de 40 anos calmos é: "  + nervososQuarenta+"\nO numero de menores de 18 anos calmos é: "+calmosAdolescentes);
	}
}
