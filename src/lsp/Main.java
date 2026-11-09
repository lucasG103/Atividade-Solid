package lsp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
            new Pizza("Calabresa", 40, 5),
            new Hamburguer("Bacon", 25, 2),
            new Bebida("Suco", 8));

        double total = 0;
        for (Produto produto : produtos) {
            System.out.printf("%s: R$ %.2f%n", produto.getNome(), produto.calcularPreco());
            total += produto.calcularPreco();
        }
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
