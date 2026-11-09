package ocp;

public class ProcessadorPagamento {
    public void processar(Pagamento pagamento, double valor) {
        System.out.println(pagamento.pagar(valor));
    }
}
