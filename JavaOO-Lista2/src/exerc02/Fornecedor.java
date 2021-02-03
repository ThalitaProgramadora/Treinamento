package exerc02;

import java.util.Scanner;

import exerc01.Pessoa;

public class Fornecedor extends Pessoa{
     private Double ValorCredito;
     private Double ValorDivida;
     
      public Fornecedor(String nome,String endereco,String telefone, Double ValorCredito, Double ValorDivida) {
    	  super(nome,endereco,telefone);
    	  this.ValorCredito=ValorCredito;
    	  this.ValorDivida = ValorDivida;
    	  }

	public Double getValorCredito() {
		return ValorCredito;
	}

	public void setValorCredito(Double valorCredito) {
		ValorCredito = valorCredito;
	}

	public Double getValorDivida() {
		return ValorDivida;
	}

	public void setValorDivida(Double valorDivida) {
		ValorDivida = valorDivida;
	}
    public double ObterSaldo() {
    	Double credito,divida,saldo;
    	Scanner doc =new Scanner(System.in);
    	System.out.println("Entre com o valor do credito: ");
    	credito = doc.nextDouble();   	
    	System.out.println("Entre com o valor do divida: ");
    	divida = doc.nextDouble();
    	
    	saldo = credito-divida;
    	System.out.println("***************************************");
    	System.out.println("Seu credito disponivel é de: "+credito);
    	System.out.println("\nSua divida pe de: "+divida);
    	System.out.println("\nSeu saldo ficou: "+saldo);
    	return saldo;
    }   
}
