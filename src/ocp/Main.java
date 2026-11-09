package ocp;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();
        processador.processar(new PagamentoCartao(), 50);
        processador.processar(new PagamentoPix(), 50);
        processador.processar(new PagamentoDinheiro(), 50);
        processador.processar(new PagamentoValeRefeicao(), 50);
    }
}
