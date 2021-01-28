package exercicios;
//1-Informar todos os números de 1000 a 1999 que 
//quando divididos por 11 obtemos resto = 5. (FOR)

public class Exercício01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros;
		for( numeros = 1000; numeros < 1999; numeros++) {
			if(numeros % 11 == 5) {
				System.out.println("\n Total de resultados"+numeros);
			}
		}	
		System.out.println("Todos os numeros maiores que 1000/11 e o resto é 5: \n" +numeros);	
	}

}
