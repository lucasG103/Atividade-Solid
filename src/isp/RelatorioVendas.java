package isp;

public class RelatorioVendas implements GeradorRelatorio {
    @Override
    public String gerarRelatorio() {
        return "Relatório de vendas: 12 pedidos, R$ 640,00";
    }
}
