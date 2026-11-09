package ocp;

public class PagamentoDinheiro implements Pagamento {
    @Override
    public String pagar(double valor) {
        return String.format("Pago R$ %.2f em dinheiro.", valor);
    }
}
