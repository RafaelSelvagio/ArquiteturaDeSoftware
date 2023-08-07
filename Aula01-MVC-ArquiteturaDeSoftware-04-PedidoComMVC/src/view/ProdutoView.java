package view;

import model.Produto;

public class ProdutoView {
	public void exibirProduto(Produto produto) {
        System.out.println("==== Detalhes do Produto ====");
        System.out.println("ID: " + produto.getIdProduto());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("--------------------");
    }
}
