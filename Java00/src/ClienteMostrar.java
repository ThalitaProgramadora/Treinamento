
public class ClienteMostrar {

	public static void main(String[] args) {
	//instancias deste objeto
     Cliente pessoa1 = new Cliente(1,"Tania"); 
     Cliente pessoa2 = new Cliente(2,"celso");
     //Mostrar o que tem dentro do objeto.
     System.out.println("O nome do objeto pessoa1 eh: "+pessoa1.getNome());
     System.out.println("O nome do objeto pessoa2 eh: "+pessoa2.getNome());
	}

}
