package ocp;

public class PagamentoValeRefeicao implements Pagamento {
    @Override
    public String pagar(double valor) {
        return String.format("Pago R$ %.2f via vale-refeição.", valor);
    }
}
