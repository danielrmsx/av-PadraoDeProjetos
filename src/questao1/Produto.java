package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private final String nome;
    private int quantidade;

    private final List<AreaInteressada> areas = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public void adicionarArea(AreaInteressada area) {
        if (!areas.contains(area)) {
            areas.add(area);
        }
    }

    public void removerArea(AreaInteressada area) {
        areas.remove(area);
    }

    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
        if (novaQuantidade == this.quantidade) { 
            return;
        }
        int anterior = this.quantidade;
        this.quantidade = novaQuantidade;
        notificarAreas(anterior);
    }

    private void notificarAreas(int quantidadeAnterior) {
        for (AreaInteressada area : new ArrayList<>(areas)) {
            area.atualizar(nome, quantidadeAnterior, quantidade);
        }
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
}
