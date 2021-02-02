//1) Crie uma classe cliente e apresente os 
//atributos e métodos referentes esta classe,
//em seguida crie um objeto do tipo cliente, 
//defina as instancias deste objeto e apresente 
//as informações deste objeto no console.
public class Cliente {
	private int codigo;
    private String nome;
    
    public Cliente(int codigo, String nome) {
    	  this.codigo=codigo;
          this.nome=nome;
    }
    
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
}
