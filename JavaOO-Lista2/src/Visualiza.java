import exerc01.Pessoa;
import exerc02.Fornecedor;

public class Visualiza {

	public static void main(String[] args) {
		Fornecedor pessoa1 = new Fornecedor(null, null, null, null, null);
        Pessoa pessoa2 = new Pessoa(null, null, null);
        
        pessoa1.Cadastrar();
        pessoa1.setValorCredito(22.0);
        pessoa1.setValorDivida(55.0);
        pessoa1.ObterSaldo();
        
	}

}
