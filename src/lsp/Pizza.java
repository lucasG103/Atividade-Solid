package lsp;

public class Pizza extends Produto {
    private final double adicionalBorda;

    public Pizza(String nome, double precoBase, double adicionalBorda) {
        super(nome, precoBase);
        if (adicionalBorda < 0) throw new IllegalArgumentException("Adicional inválido");
        this.adicionalBorda = adicionalBorda;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() + adicionalBorda;
    }
}
