package questao1;

public class Vendas implements AreaInteressada {

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        if (quantidadeAnterior == 0 && novaQuantidade > 0) {
            System.out.println("  [VENDAS] ALERTA: \"" + nomeProduto
                    + "\" voltou ao estoque (" + novaQuantidade + " un.). Pode voltar a vender!");
        }
    }
}
