package Exerc01e02;

public class AnimalCavalo extends Animal {
	public String nomecavalo;
    public AnimalCavalo() {
    	super("Cavalo",0);
    }
    
    
    
    public String getNomecavalo() {
		return nomecavalo;
	}



	public void setNomecavalo(String nomecavalo) {
		this.nomecavalo = nomecavalo;
	}



	@Override
    public void EmitirSom(String paraSaber) {
    	System.out.println("ouve "+paraSaber+"RIMM... RIMM... RIMM");
    }
    
    @Override
    public void Correr(String som) {
    	System.out.println("ela"+som+"proou... proouu... proou..");
    }
}
