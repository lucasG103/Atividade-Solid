package isp;

public class EntregaManager implements GerenciadorEntregas {
    @Override
    public void atribuirEntregador(int pedidoId, String entregador) {
        System.out.println("Pedido " + pedidoId + " -> " + entregador);
    }

    @Override
    public void atualizarStatus(int pedidoId, String status) {
        System.out.println("Pedido " + pedidoId + " status: " + status);
    }
}
