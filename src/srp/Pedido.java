package srp;

import java.util.List;

public class Pedido {
    private final int id;
    private final String cliente;
    private final List<String> itens;
    private final double total;

    public Pedido(int id, String cliente, List<String> itens, double total) {
        this.id = id;
        this.cliente = cliente;
        this.itens = List.copyOf(itens);
        this.total = total;
    }

    public int getId() { return id; }
    public String getCliente() { return cliente; }
    public List<String> getItens() { return itens; }
    public double getTotal() { return total; }
}
