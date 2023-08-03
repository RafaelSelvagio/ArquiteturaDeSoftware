package view;

import model.Produto;

public class ProdutoView {
	public void exibirCliente(Produto produto) {
        System.out.println("==== Detalhes do Cliente ====");
        System.out.println("ID: " + produto.getIdProduto());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Email: " + produto.getPreco());
        System.out.println("--------------------");
    }
}
