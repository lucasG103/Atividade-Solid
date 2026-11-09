package isp;

public class Main {
    public static void main(String[] args) {
        GerenciadorPedidos pedidos = new PedidoManager();
        GerenciadorEntregas entregas = new EntregaManager();
        Notificavel notificador = new NotificadorEmail();
        GeradorRelatorio relatorio = new RelatorioVendas();

        pedidos.criarPedido(1);
        entregas.atribuirEntregador(1, "Entregador 1");
        entregas.atualizarStatus(1, "A caminho");
        notificador.notificar("cliente1", "Seu pedido saiu para entrega.");
        System.out.println(relatorio.gerarRelatorio());
    }
}
