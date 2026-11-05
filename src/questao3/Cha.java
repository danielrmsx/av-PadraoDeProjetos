package questao3;

public class Cha extends Bebida {

    public static final double PRECO = 4.50;

    @Override
    public String getDescricao() { return "Chá"; }

    @Override
    public double getPreco() { return PRECO; }
}
