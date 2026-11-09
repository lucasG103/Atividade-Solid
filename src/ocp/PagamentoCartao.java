package ocp;

public class PagamentoCartao implements Pagamento {
    @Override
    public String pagar(double valor) {
        return String.format("Pago R$ %.2f no cartão.", valor);
    }
}
