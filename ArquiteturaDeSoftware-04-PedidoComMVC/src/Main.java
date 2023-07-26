import java.util.Date;
import controller.PedidoController;
import model.Cliente;
import model.Pedido;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto cliente
        Cliente cliente = new Cliente(1, "João", "joao@email.com");
        
        // Cria um objeto produto
        Produto produto = new Produto(101, "Celular", 999.99);
        
        // Cria um objeto data
        Date data = new Date();

        // Cria um objeto pedidoController
        PedidoController pedidoController = new PedidoController();
        
        // Cria um objeto pedido usando controller
        Pedido pedido = pedidoController.criarPedido(1, cliente, produto, 1, data);
        
        // Exibe os detalhes do pedido
        pedidoController.exibirDetalhesPedido(pedido);
    }
}
