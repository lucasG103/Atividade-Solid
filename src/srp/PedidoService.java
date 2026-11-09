package srp;

import java.util.List;

public class PedidoService {
    private int proximoId = 1;

    public Pedido criar(String cliente, List<String> itens, double total) {
        if (cliente == null || cliente.isBlank()) throw new IllegalArgumentException("Cliente obrigatório");
        if (itens == null || itens.isEmpty()) throw new IllegalArgumentException("Pedido sem itens");
        if (total < 0) throw new IllegalArgumentException("Total inválido");
        return new Pedido(proximoId++, cliente, itens, total);
    }
}
