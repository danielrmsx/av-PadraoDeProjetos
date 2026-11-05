package questao1;

public class Main {

    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado Mecânico", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        teclado.adicionarArea(compras);
        teclado.adicionarArea(vendas);
        teclado.adicionarArea(auditoria);

        System.out.println("=== Questão 1 - Observer (Monitor de Estoque) ===");

        System.out.println("\n> Estoque 10 -> 7");
        teclado.setQuantidade(7);

        System.out.println("\n> Estoque 7 -> 7 (sem mudança, ninguém deve ser avisado)");
        teclado.setQuantidade(7);

        System.out.println("\n> Estoque 7 -> 3");
        teclado.setQuantidade(3);

        System.out.println("\n> Estoque 3 -> 0");
        teclado.setQuantidade(0);

        System.out.println("\n> Estoque 0 -> 20");
        teclado.setQuantidade(20);

        System.out.println("\n> Removendo a área de COMPRAS");
        teclado.removerArea(compras);

        System.out.println("\n> Estoque 20 -> 2 (Compras não deve mais alertar)");
        teclado.setQuantidade(2);

        System.out.println("\nRegistros da auditoria: " + auditoria.getRegistros());
    }
}
