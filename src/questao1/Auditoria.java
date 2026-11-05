package questao1;

import java.util.ArrayList;
import java.util.List;

public class Auditoria implements AreaInteressada {

    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        String registro = nomeProduto + ": " + quantidadeAnterior + " -> " + novaQuantidade;
        registros.add(registro);
        System.out.println("  [AUDITORIA] Registrado: " + registro);
    }

    public List<String> getRegistros() {
        return registros;
    }
}
