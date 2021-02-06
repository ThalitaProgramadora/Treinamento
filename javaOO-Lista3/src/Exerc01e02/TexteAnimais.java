package Exerc01e02;

import javax.swing.JOptionPane;

public class TexteAnimais {

	public static void main(String[] args) {
		AnimalCachorro Cachorro = new AnimalCachorro();
		AnimalCavalo Cavalo = new AnimalCavalo();
		AnimalPreguica Preguica = new AnimalPreguica();
		String cont = JOptionPane.showInputDialog(null, "Qual animal vc tem interesse\n(Digite a letra correspondente)"
				+ ":\nc-Cachorro\nca-Cavalo\nP-Preguica");
		// cachorro
		if (cont.equals("c") || cont.equals("C")) {
			String n, a;
			int i;
			n = JOptionPane.showInputDialog("Entre com o NOME do seu Cachorro: ");
			Cachorro.setNome(n);
			a = JOptionPane.showInputDialog("Entre com a IDADE do seu Cachorro: ");
			i = Integer.parseInt(a);
			Cachorro.setIdade(i);
			int opcao = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Gostaria de ouvir o som: 1- LATIDO ou 2-CORRE: "));
			if (opcao == 1) {
				JOptionPane.showMessageDialog(null, "\n O nome do cachorro eh: " + Cachorro.getNome()
						+ "\nA idade do cachorro eh: " + Cachorro.getIdade());
				Cachorro.EmitirSom("o som é ");
			} else if (opcao == 2) {
				JOptionPane.showMessageDialog(null, "o nome do cachorro eh " + Cachorro.getNome()
						+ "\nA idade do cachorro eh: " + Cachorro.getIdade());
				Cachorro.Correr("corre assim ");
			} else {
				JOptionPane.showMessageDialog(null, "Digite um valor válido!!");
			}
			// cavalo
		} else if (cont.equals("ca") || cont.equals("Ca")) {
			String n, a;
			int i;
			n = JOptionPane.showInputDialog("Entre com o NOME do seu Cavalo: ");
			Cavalo.setNome(n);
			a = JOptionPane.showInputDialog("Entre com a IDADE do seu Cavalo: ");
			i = Integer.parseInt(a);
			Cavalo.setIdade(i);
			int opcao = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Gostaria de ouvir o som: 1- rinxando ou 2-CORRE: "));
			if (opcao == 1) {
				JOptionPane.showMessageDialog(null,
						"\n O nome do cavalo eh: " + Cavalo.getNome() + "\nA idade do cavalo eh: " + Cavalo.getIdade());
				Cavalo.EmitirSom("o som é ");
			} else if (opcao == 2) {
				JOptionPane.showMessageDialog(null,
						"\n O nome do cavalo eh " + Cavalo.getNome() + "\nA idade do cavalo eh: " + Cavalo.getIdade());
				Cavalo.Correr("corre assim ");
			} else {
				JOptionPane.showMessageDialog(null, "Digite um valor válido!!");
			}
			// Preguica
		} else if (cont.equals("p") || cont.equals("P")) {
			String n, a;
			int i;
			n = JOptionPane.showInputDialog("Entre com o NOME da sua Preguica: ");
			Preguica.setNome(n);
			a = JOptionPane.showInputDialog("Entre com a IDADE da sua Preguica: ");
			i = Integer.parseInt(a);
			Preguica.setIdade(i);
			int opcao = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Gostaria de ouvir o som: 1- SOM DELA ou 2-CORRE: "));
			if (opcao == 1) {
				JOptionPane.showMessageDialog(null, "\n O nome da Preguica eh: " + Preguica.getNome()
						+ "\nA idade da preguica eh: " + Preguica.getIdade());
				Preguica.EmitirSom("o som é ");
			} else if (opcao == 2) {
				JOptionPane.showMessageDialog(null, "\n O nome da Preguica eh " + Preguica.getNome()
						+ "\nA idade da preguica eh: " + Preguica.getIdade());
				Preguica.Correr("corre assim ");
			} else {
				JOptionPane.showMessageDialog(null, "Digite um valor válido!!");
			}
		} else {
			System.out.println("Digite um animal válido!!Obrigada");
		}

	}

}
