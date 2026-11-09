package srp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new PedidoService().criar("Cliente 1", List.of("Pizza", "Refrigerante"), 62.50);
        new PedidoRepositoryMemoria().salvar(pedido);
        new PedidoPrinter().exibir(pedido);
    }
}
