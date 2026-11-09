package lsp;

public abstract class Produto {
    private final String nome;
    private final double precoBase;

    protected Produto(String nome, double precoBase) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome obrigatório");
        if (precoBase < 0) throw new IllegalArgumentException("Preço base inválido");
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() { return nome; }
    protected double getPrecoBase() { return precoBase; }

    public abstract double calcularPreco();
}
