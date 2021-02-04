package Exerc01e02;

public class AnimalPreguica extends Animal {
	public AnimalPreguica() {
    	super("Preguica",0);
    }
    
    @Override
    public void EmitirSom(String paraSaber) {
    	System.out.println("ouve "+paraSaber+ "friim... friim... friim");
    }
    
    @Override
    public void Correr(String som) {
    	System.out.println("ela "+som+" crock... crock... crock..");
    }
}
