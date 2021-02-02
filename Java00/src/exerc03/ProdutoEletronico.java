package exerc03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProdutoEletronico {
 private int id;
 private String celular;
 private String computador;
 private String tablet;
 private String acessorios;
 
public ProdutoEletronico(int id,String celular,String computador,String tablet,String acessorios) {
	this.id=id;
	this.celular= celular;
	this.computador=computador;
	this.tablet=tablet;
	this.acessorios=acessorios;
} 
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCelular() {
	return celular;
}
public void setCelular(String celular) {
	this.celular = celular;
}
public String getComputador() {
	return computador;
}
public void setComputador(String computador) {
	this.computador = computador;
}
public String getTablet() {
	return tablet;
}
public void setTablet(String tablet) {
	this.tablet = tablet;
}
public String getAcessorios() {
	return acessorios;
}
public void setAcessorios(String acessorios) {
	this.acessorios = acessorios;
}
 
public void cadastrarCelular() {
	String mat[][] = new String[5][5];
	int i=0,j=0,somar=0;
	
	Scanner ler = new Scanner(System.in);
	
	for(i=0;i<3;i++)
	{
		System.out.printf("\nEntre com o modelo do celular: [%d] [%d]: ",(i+1),(j+1));
		mat[i][j] = ler.next();
		for(j=0;j<3;j++)
		{
			System.out.printf("\nEntre com o modelo do celular: [%d] [%d]: ",(i+1),(j+1));
			mat[i][j] = ler.next();
			somar = somar + 1;	
			j++;
		}
		i++;
		somar = somar + 1;	
	}
	System.out.println("\nFoi cadastrado um total de : "+somar+" celulares.");
	i = 0;
	j =0;
	System.out.println("*******************************************");
	for(i=0;i<3;i++)
	{
		JOptionPane.showMessageDialog(null,"\\nModelos disponiveis para compra:" +mat[i][j]);
		for(j=0;j<3;j++)
		{
			JOptionPane.showMessageDialog(null,"\\nModelos disponiveis para compra:" +mat[i][j]);
			j++;
		}
		i++;
	}
}	
public void CadastrarComputador(){
	String mat[][] = new String[5][5];
	int i=0,j=0,somar=0;
	
	Scanner ler = new Scanner(System.in);
	
	for(i=0;i<3;i++)
	{
		System.out.printf("\nEntre com o modelo do computador: [%d] [%d]: ",(i+1),(j+1));
		mat[i][j] = ler.next();
		for(j=0;j<3;j++)
		{
			System.out.printf("\nEntre com o modelo do computador: [%d] [%d]: ",(i+1),(j+1));
			mat[i][j] = ler.next();
			somar = somar + 1;	
			j++;
		}
		i++;
		somar = somar + 1;	
	}
	System.out.println("\nFoi cadastrado um total de : "+somar+" computadores.");
	i = 0;
	j =0;
	System.out.println("*******************************************");
	for(i=0;i<3;i++)
	{
		JOptionPane.showMessageDialog(null,"\\nModelos disponiveis para compra:" +mat[i][j]);
		for(j=0;j<3;j++)
		{
			JOptionPane.showMessageDialog(null,"\\nModelos disponiveis para compra:" +mat[i][j]);
			j++;
		}
		i++;
	}
}		
	
public void CadastrarTablet() {
	String mat[][] = new String[5][5];
	int i=0,j=0,somar=0;
	
	Scanner ler = new Scanner(System.in);
	
	for(i=0;i<3;i++)
	{
		System.out.printf("\nEntre com o modelo do tablet: [%d] [%d]: ",(i+1),(j+1));
		mat[i][j] = ler.next();
		for(j=0;j<3;j++)
		{
			System.out.printf("\nEntre com o modelo do tablet: [%d] [%d]: ",(i+1),(j+1));
			mat[i][j] = ler.next();
			somar = somar + 1;	
			j++;
		}
		i++;
		somar = somar + 1;	
	}
	System.out.println("\nFoi cadastrado um total de : "+somar+" celulares.");
	i = 0;
	j =0;
	System.out.println("*******************************************");
	for(i=0;i<3;i++)
	{
		JOptionPane.showMessageDialog(null,"\\nModelos disponiveis para compra:" +mat[i][j]);
		for(j=0;j<3;j++)
		{
			JOptionPane.showMessageDialog(null,"\\nModelos disponiveis para compra:" +mat[i][j]);
			j++;
		}
		i++;
	}
}	

public void CadastrarAcessorio() {
	String mat[][] = new String[5][5];
	int i=0,j=0,somar=0;
	
	Scanner ler = new Scanner(System.in);
	
	for(i=0;i<3;i++)
	{
		System.out.printf("\nEntre com o modelo do acessorio: [%d] [%d]: ",(i+1),(j+1));
		mat[i][j] = ler.next();
		for(j=0;j<3;j++)
		{
			System.out.printf("\nEntre com o modelo do acessorio: [%d] [%d]: ",(i+1),(j+1));
			mat[i][j] = ler.next();
			somar = somar + 1;	
			j++;
		}
		i++;
		somar = somar + 1;	
	}
	System.out.println("\nFoi cadastrado um total de : "+somar+" acessorios.");
	i = 0;
	j =0;
	System.out.println("*******************************************");
	for(i=0;i<3;i++)
	{
		JOptionPane.showMessageDialog(null,"\\nModelos disponiveis para compra:" +mat[i][j]);
		for(j=0;j<3;j++)
		{
			JOptionPane.showMessageDialog(null,"\\nModelos disponiveis para compra:" +mat[i][j]);
			j++;
		}
		i++;
	}
}	
}

