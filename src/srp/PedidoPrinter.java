package srp;

public class PedidoPrinter {
    public void exibir(Pedido pedido) {
        System.out.println("Pedido #" + pedido.getId() + " | Cliente: " + pedido.getCliente());
        pedido.getItens().forEach(item -> System.out.println(" - " + item));
        System.out.printf("Total: R$ %.2f%n", pedido.getTotal());
    }
}
