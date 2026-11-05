package questao3;

public abstract class Complemento extends Bebida {

    protected final Bebida bebida;

    protected Complemento(Bebida bebida) {
        this.bebida = bebida;
    }

    protected abstract String getNomeComplemento();
    protected abstract double getPrecoComplemento();

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", " + getNomeComplemento();
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + getPrecoComplemento();
    }
}
