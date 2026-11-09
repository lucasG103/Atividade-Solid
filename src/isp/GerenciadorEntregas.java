package isp;

public interface GerenciadorEntregas {
    void atribuirEntregador(int pedidoId, String entregador);
    void atualizarStatus(int pedidoId, String status);
}
