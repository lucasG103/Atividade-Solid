package lsp;

public class Hamburguer extends Produto {
    private static final double PRECO_EXTRA = 3.0;
    private final int extras;

    public Hamburguer(String nome, double precoBase, int extras) {
        super(nome, precoBase);
        if (extras < 0) throw new IllegalArgumentException("Quantidade de extras inválida");
        this.extras = extras;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() + extras * PRECO_EXTRA;
    }
}
