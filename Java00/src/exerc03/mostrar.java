package exerc03;

import javax.swing.JOptionPane;

public class mostrar {

	public static void main(String[] args) {
		int opcao;
		String o;
		o=JOptionPane.showInputDialog(null,"\nEscolha uma opção \n1-Cadastra celular\n2-Cadastra computador\n3-Cadastrar tablet\n4-Cadastrar acessorios");
		opcao = Integer.parseInt(o);
		if(opcao ==1) {
			ProdutoEletronico produtoeletronico = new ProdutoEletronico(1,"","","","");
			produtoeletronico.cadastrarCelular();
		}else if(opcao ==2) {			
			ProdutoEletronico produtoeletronico = new ProdutoEletronico(1,"","","","");
			produtoeletronico.CadastrarComputador();
		}else if(opcao ==3) {
			ProdutoEletronico produtoeletronico = new ProdutoEletronico(1,"","","","");
			produtoeletronico.CadastrarTablet();
		}else if(opcao == 4) {
			ProdutoEletronico produtoeletronico = new ProdutoEletronico(1,"","","","");
			produtoeletronico.CadastrarAcessorio();
		}else {
			JOptionPane.showMessageDialog(null, "Valor inválido!!");
		}
	}

}
