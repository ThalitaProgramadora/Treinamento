package exerc02;

public class MostrarAviao {

	public static void main(String[] args) {
		;
    Aviao dono1 = new Aviao(1,"lord",2);
    System.out.println("O modelo atual de dono 1 eh: "+dono1.getmodelo());
    System.out.println("Digite o novo modelo para o dono1: ouro\n");
    dono1.setModelo("\nouro");
    System.out.println("\nO modelo novo ficou agora: "+dono1.getmodelo());
	}

}
