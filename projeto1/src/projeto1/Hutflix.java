package projeto1;

import javax.swing.JOptionPane;

public class Hutflix {

	public static void main(String[] args) {
		int telefone, filmes;
		String nome = null, endereco, t, f; 
		String humor,q, h, o, pizza, pizza1, pizza2;
		int inum = 1, opcao, op;

		while (inum <= 5) {
			nome = JOptionPane.showInputDialog("Digite seu nome:");

			endereco = JOptionPane.showInputDialog("Digite seu endereço:");
			t = JOptionPane.showInputDialog("Digite seu telefone:");
			telefone = Integer.parseInt(t);
			f = JOptionPane.showInputDialog(
					"Por favor, qual seu filme preferido?\n1 - Se beber não case \n 2 - os vingadores\n 3-O iluminado\n4-Titanic\n5-Harry Potter");
			filmes = Integer.parseInt(f);

			// filme se beber não case
			if (filmes == 1) {
				o = JOptionPane.showInputDialog(
						"Escolha um caracteristica:\nSe beber não case:\n1)imaginativos\n2)originais\n3)criativos ");
				opcao = Integer.parseInt(o);
				q = JOptionPane.showInputDialog("Gostaria de 1 ou 2 pizza? levando 2 ganha um refri ! ");
				op = Integer.parseInt(o);
				if (opcao == 1 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nbaiana\nbacon\nchocolate com confeitos");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza:" + pizza);
				}
				if (opcao == 1 && op == 2) {
					pizza1 = JOptionPane
							.showInputDialog("Digite a primeira pizza:\nbaiana\\nbacon\\nchocolate com confeitos");

					pizza2 = JOptionPane
							.showInputDialog("Digite a segunda pizza:\nbaiana\\nbacon\\nchocolate com confeitos");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1:"
							+ pizza1 + " e a pizza2:" + pizza2);
				}
				// opcao2
				if (opcao == 2 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nMussarela\nCalabresa\nAlho");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza:" + pizza);

				}
				if (opcao == 2 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite a primeira pizza:\nMuçarela\nCalabresa\nAlho)");
					pizza2 = JOptionPane.showInputDialog("Digite a segunda pizza:\nMuçarela\nCalabresa\nAlho)");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1:"
							+ pizza1 + " e a pizza2:" + pizza2);
				}
				// opcao3
				if (opcao == 3 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nAlho\nMuçarela\nBacon");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);
				}
				if (opcao == 3 && op == 2) {
					pizza1 = JOptionPane
							.showInputDialog("Digite a primeira pizza:\nAlho\nMuçarela\nBacon");
					pizza2 = JOptionPane.showInputDialog("Digite a segunda pizza:\nAlho\nMussarela\nBacon");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
			}
			// filme os vingadores
		
			if (filmes == 2) {
				o = JOptionPane.showInputDialog(
						"Escolha um caracteristica:\nOs vingadores: 1)ambiciosas\n2)disciplinadas\n3)confiáveis ");
				opcao = Integer.parseInt(o);
				q = JOptionPane.showInputDialog("Gostaria de 1 ou 2 pizza? levando 2 ganha um refri ! ");
				op = Integer.parseInt(o);
				if (opcao == 1 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nfrango com catupíry\nrucula com tomate seco\nromeu e julieta\n");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);
				}
				if (opcao == 1 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite a segunda pizza:\nfrango com catupíry\nrucula com tomate seco\nromeu e julieta\n");

					pizza2 = JOptionPane
							.showInputDialog("Digite a segunda pizza:\nfrango com catupíry\nrucula com tomate seco\nromeu e julieta\n");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2 :" + pizza2);
				}
				// opcao2
				if (opcao == 2 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nAliche\nPortuguesa\nNapolitano\n");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);

				}
				if (opcao == 2 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite a primeira pizza:\nAliche\nPortuguesa\nNapolitano\n)");
					pizza2 = JOptionPane.showInputDialog("Digite a segunda pizza:\nAliche\nPortuguesa\nNapolitano\n");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
				// opcao3
				if (opcao == 3 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nFrango catupiry\nbacon\nmargarita");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);
				}
				if (opcao == 3 && op == 2) {
					pizza1 = JOptionPane
							.showInputDialog("Digite a primeira pizza:\nFrango catupiry\nbacon\nmargarita)");
					pizza2 = JOptionPane.showInputDialog("Digite a segunda pizza:\nFrango catupiry\nbacon\nmargarita)");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
			}
			// filme o iluminado
			if (filmes == 3) {
				o = JOptionPane.showInputDialog(
						"Escolha um caracteristica:\nO Iluminado a)pessimistas b)ansiosas c)autocríticas d)vulneráveis ao estresse");
				opcao = Integer.parseInt(o);
				q = JOptionPane.showInputDialog("Gostaria de 1 ou 2 pizza? levando 2 ganha um refri ! ");
				op = Integer.parseInt(o);
				if (opcao == 1 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nmuçarela\ncalabresa\nalho");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);
				}
				if (opcao == 1 && op == 2) {
					pizza1 = JOptionPane
							.showInputDialog("Digite a primeira pizza:\nmuçarela\ncalabresa\nalho");

					pizza2 = JOptionPane
							.showInputDialog("Digite a segunda pizza:\nmuçarela\ncalabresa\nalho");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
				// opcao2
				if (opcao == 2 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nquatro queijos\nbaiana\ncalifornia");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);

				}
				if (opcao == 2 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite a primeira pizza:\nquatro queijos\nbaiana\ncalifornia)");
					pizza2 = JOptionPane.showInputDialog("Digite a segunda pizza:\nquatro queijos\nbaiana\ncalifornia");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço" + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
				// opcao3
				if (opcao == 3 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nbrigadeiro\nlombo\nquatro queijos");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);
				}
				if (opcao == 3 && op == 2) {
					pizza1 = JOptionPane
							.showInputDialog("Digite a primeira pizza:\nbrigadeiro\nlombo\nquatro queijos)");
					pizza2 = JOptionPane.showInputDialog("Digite a segunda pizza:\nbrigadeiro\nlombo\nquatro queijos");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
				// opcao4
				if (opcao == 4 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nmuçarela\ncalabresa\nnapolitano");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);
				}
				if (opcao == 4 && op == 2) {
					pizza1 = JOptionPane
							.showInputDialog("Digite a primeira pizza:\nmuçarela\ncalabresa\nnapolitano");
					pizza2 = JOptionPane.showInputDialog("Digite a segunda pizza:\nmuçarela\ncalabresa\nnapolitano");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
			}
			// filme titanica
			if (filmes == 4) {
				o = JOptionPane.showInputDialog(
						"Escolha um caracteristica:\nTitanic 1)determinada\\n2)centrada \\n3)romantica ");
				opcao = Integer.parseInt(o);
				q = JOptionPane.showInputDialog("Gostaria de 1 ou 2 pizza? levando 2 ganha um refri ! ");
				op = Integer.parseInt(o);
				if (opcao == 1 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nbaiana\nbacon\nchocolate com confeitos");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);
				}
				if (opcao == 1 && op == 2) {
					pizza1 = JOptionPane
							.showInputDialog("Digite a primeira pizza:\nbaiana\\nbacon\\nchocolate com confeitos");

					pizza2 = JOptionPane
							.showInputDialog("Digite a segunda pizza:\nbaiana\\nbacon\\nchocolate com confeitos");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
				// opcao2
				if (opcao == 2 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nMussarela\nCalabresa\nAlho");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);

				}
				if (opcao == 2 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite a primeira pizza:\nMussarela\nCalabresa\nAlho)");
					pizza2 = JOptionPane.showInputDialog("Digite a segunda pizza:\nMussarela\nCalabresa\nAlho)");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
				// opcao3
				if (opcao == 3 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nFrango catupiry\nbacon\nmargarita");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);
				}
				if (opcao == 3 && op == 2) {
					pizza1 = JOptionPane
							.showInputDialog("Digite a primeira pizza:\nFrango catupiry\nbacon\nmargarita)");
					pizza2 = JOptionPane.showInputDialog("Digite a segunda pizza:\nFrango catupiry\nbacon\nmargarita)");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
			}
			// filme harry potter
			if (filmes == 5) {
				o = JOptionPane.showInputDialog(
						"Escolha um caracteristica:\nHarry Potter\n1)criativos\n2)curiosos\n3)inovador ");
				opcao = Integer.parseInt(o);
				q = JOptionPane.showInputDialog("Gostaria de 1 ou 2 pizza? levando 2 ganha um refri ! ");
				op = Integer.parseInt(o);
				if (opcao == 1 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nbaiana\nbacon\nchocolate com confeitos");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço" + endereco + " a pizza: " + pizza);
				}
				if (opcao == 1 && op == 2) {
					pizza1 = JOptionPane
							.showInputDialog("Digite a primeira pizza:\nbaiana\\nbacon\\nchocolate com confeitos");

					pizza2 = JOptionPane
							.showInputDialog("Digite a segunda pizza:\nbaiana\\nbacon\\nchocolate com confeitos");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço" + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
				// opcao2
				if (opcao == 2 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nMussarela\nCalabresa\nAlho");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);

				}
				if (opcao == 2 && op == 2) {
					pizza1 = JOptionPane.showInputDialog("Digite a primeira pizza:\nMussarela\nCalabresa\nAlho)");
					pizza2 = JOptionPane.showInputDialog("Digite a segunda pizza:\nMussarela\nCalabresa\nAlho)");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
				// opcao3
				if (opcao == 3 && op == 1) {
					pizza = JOptionPane.showInputDialog("Digite uma pizza:\nFrango catupiry\nbacon\nmargarita");
					JOptionPane.showMessageDialog(null,
							" Será enviado para o endereço " + endereco + " a pizza: " + pizza);
				}
				if (opcao == 3 && op == 2) {
					pizza1 = JOptionPane
							.showInputDialog("Digite a primeira pizza:\nFrango catupiry\nbacon\nmargarita)");
					pizza2 = JOptionPane.showInputDialog("Digite a segunda pizza:\nFrango catupiry\nbacon\nmargarita)");
					JOptionPane.showMessageDialog(null, " Será enviado para o endereço " + endereco + " a pizza1: "
							+ pizza1 + " e a pizza2: " + pizza2);
				}
			}

			System.out.println("Você é o cliente número: " + inum);
			inum++;
		}

		JOptionPane.showMessageDialog(null, "Senhor(a) " + nome + "\n Volte sempre!!");
	}

}
