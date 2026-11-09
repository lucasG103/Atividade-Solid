package srp;

import java.util.HashMap;
import java.util.Map;

public class PedidoRepositoryMemoria implements PedidoRepository {
    private final Map<Integer, Pedido> banco = new HashMap<>();

    @Override
    public void salvar(Pedido pedido) {
        banco.put(pedido.getId(), pedido);
        System.out.println("Pedido " + pedido.getId() + " salvo.");
    }
}
