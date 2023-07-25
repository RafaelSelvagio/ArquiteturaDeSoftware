package model;

import java.util.Date;

public class Pedido {
    private int idPedido;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private Date data;

    public Pedido(int idPedido, Cliente cliente, Produto produto, int quantidade, Date data) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = data;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Pedido [idPedido=" + idPedido + ", cliente=" + cliente + ", produto=" + produto + ", quantidade=" + quantidade
                + ", data=" + data + "]";
    }
}
