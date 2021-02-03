package exerc01;

import java.util.Scanner;

public class Pessoa {
    //atributos
	private String nome;
	private String endereco;
	private String telefone;
	
	//metodo construtor
	
	public Pessoa(String nome,String endereco,String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void Cadastrar() {
		 String nomeC;
		 String enderecoC;
		 String telefoneC;
		  
		 Scanner doc = new Scanner(System.in);
		 
		 System.out.println("Entre com o valor do nome:");
		 nomeC =doc.next();
		 System.out.println("Entre com o nome da rua:");
		 enderecoC =doc.next();
		 System.out.println("Entre com o valor do telefone:");
		 telefoneC =doc.next();	
		
		 //mostrou os resultadosS
		 System.out.println("***********************");
		 System.out.println("Seu nome é: "+nomeC);
		 System.out.println("Seu endereco é: "+enderecoC);
		 System.out.println("Seu telefone é: "+telefoneC);
	}

	
}
