/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica1;


public class PessoaApp {
    
    public static void main(String[] args){
        
        Pessoa pessoa1 = new Pessoa(1,"Elder");
        
        Pessoa pessoa2 = new Pessoa(2,"Ana");
        
        System.out.println("o nome do objeto pessoa1 eh: "+pessoa1.getNome());
        
        pessoa1.setNome("Helder");
        
        System.out.println("o nome do objeto pessoa1 eh: "+pessoa1.getNome());
                
        
    }
    
}
