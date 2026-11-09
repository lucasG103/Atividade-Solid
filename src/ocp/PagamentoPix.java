package ocp;

public class PagamentoPix implements Pagamento {
    @Override
    public String pagar(double valor) {
        return String.format("Pago R$ %.2f via PIX.", valor);
    }
}
