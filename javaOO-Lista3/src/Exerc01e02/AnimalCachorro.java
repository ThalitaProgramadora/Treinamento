package Exerc01e02;

public class AnimalCachorro extends Animal {
   
	public AnimalCachorro() {
		super("Cachorro", 0);
	}
	
	@Override
	public void EmitirSom(String paraSaber) {
		System.out.println("ouve "+paraSaber+" AU... AU... AU...");
	}
	
	@Override
	public void Correr(String som) {
		System.out.println("o dog "+som+" Plock... Plock... Plock...");
	}
}
