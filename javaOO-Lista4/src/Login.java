import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Login {

	public static void main(String[] args) {
		
	
		JOptionPane.showMessageDialog(null, "Entre com o seu login e senha ");
		String login = JOptionPane.showInputDialog(null, "login: ");
		String senha = JOptionPane.showInputDialog(null, "senha: ");
		
	
		if (login.equals("Tina") && senha.equals("1234")) {
			JOptionPane.showMessageDialog(null, "Logado com sucesso\nBem vinda Tina. ");
     	}else if(login.equals("Carlos") && senha.equals("5678")) {
     		JOptionPane.showMessageDialog(null, "Logado com sucesso\nBem vinda Carlos. ");
     	}else {
     		JOptionPane.showMessageDialog(null, "Login ou senha inválido!. ");
     	}
		
			ArrayList<String> estoque = new ArrayList();
			JOptionPane.showMessageDialog(null, "Tina logada\nEscolha uma opcao.");
			int opcao =Integer.parseInt((JOptionPane.showInputDialog(null, "1-Remover\n2-Atualizar\n3-Mostrar\nfinalizar ")));
			
			while(opcao!=0){
		
				switch(opcao)
					{
						case 1:
							String produto = JOptionPane.showInputDialog(null, "Digite qual produto vai adicionar: ");
							estoque.add(produto);
							break;
				
						case 2:
							String produto1 = JOptionPane.showInputDialog(null, "Digite qual produto vai adicionar: ");
							if(estoque.contains(produto1))
							{
							estoque.remove(produto1);
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Produto indisponivel.");
							}
							break;
							
						case 3:
						
						
							String verifica = JOptionPane.showInputDialog(null, "Digite o produto que quer atualizar: ");
							JOptionPane.showMessageDialog(null,"Digite o nome do produto que entrará no lugar de "+verifica+":");
							String novo = JOptionPane.showInputDialog(null, "Digite o produto que quer adicionar: ");
							
							if(estoque.contains(verifica))
							{
								estoque.remove(verifica);
								estoque.add(novo);
							}
							else
							{
								JOptionPane.showMessageDialog(null, "Produto indisponivel.");
							}
							System.out.println(estoque);
							break;	
						case 4:
							JOptionPane.showMessageDialog(null," Os produtos  do estoque:"+estoque);
							break;
						default:
							JOptionPane.showMessageDialog(null, "Finalizou o programa!!!");
					
						}
				JOptionPane.showMessageDialog(null, "Tina logada\nEscolha uma opcao.");
				opcao =Integer.parseInt((JOptionPane.showInputDialog(null, "1-Remover\n2-Atualizar\n3-Mostrar\nfinalizar ")));
			}
		}


	
	
		
	}

