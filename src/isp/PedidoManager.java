package isp;

public class PedidoManager implements GerenciadorPedidos {
    @Override
    public void criarPedido(int id) {
        System.out.println("Pedido " + id + " criado.");
    }

    @Override
    public void cancelarPedido(int id) {
        System.out.println("Pedido " + id + " cancelado.");
    }
}
