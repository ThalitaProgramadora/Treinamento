package exerc02;
//2)Crie uma classe avião e apresente os atributos e métodos
//referentes a esta classe, em seguia crie um objeto avião,
//defina as instacias deste objeto e apresente as
//informações contidas dentro deste objeto no console.
public class Aviao {
	 private int id;
     private String modelo;
     private int ano;
     
     public Aviao(int id,String modelo,int ano) {
    	 this.modelo = modelo;
    	 this.ano = ano;    	 
     }
     public int getid() {
    	 return id;
     }
     public void setId(int id) {
    	 this.id =id;
     }
     public String getmodelo() {
    	 return modelo;
     }
     public void setModelo(String modelo) {
    	 this.modelo = modelo;
     }
     public int getano() {
		return ano;    	 
     }
}
