package questao1;

public class Compras implements AreaInteressada {

    private static final int ESTOQUE_MINIMO = 5;

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        if (novaQuantidade < ESTOQUE_MINIMO) {
            System.out.println("  [COMPRAS] ALERTA: estoque de \"" + nomeProduto
                    + "\" baixo (" + novaQuantidade + " un.). Providenciar reposição.");
        }
    }
}
