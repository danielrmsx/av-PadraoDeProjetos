package questao3;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Questão 3 - Decorator (Pedido de Café) ===\n");

        Bebida pedido1 = new Chantilly(new Leite(new Espresso()));

        Bebida pedido2 = new Calda(new Cha());

        Bebida pedido3 = new Espresso();
        pedido3 = new Chantilly(pedido3);
        pedido3 = new Chantilly(pedido3);
        pedido3 = new Calda(pedido3);

        Bebida pedido4 = new Cha();

        imprimir(1, pedido1);
        imprimir(2, pedido2);
        imprimir(3, pedido3);
        imprimir(4, pedido4);
    }

    private static void imprimir(int numero, Bebida pedido) {
        System.out.println(String.format("Pedido %d: %s%n  Total: R$ %.2f%n",
                numero, pedido.getDescricao(), pedido.getPreco()));
    }
}
