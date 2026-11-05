package questao2;

public class PerfilRotativo implements PerfilCobranca {

    public static final double VALOR_HORA = 8.00;

    @Override
    public double calcular(int minutos) {
        int horas = (int) Math.ceil(minutos / 60.0);
        return horas * VALOR_HORA;
    }

    @Override
    public String getNome() { return "Rotativo"; }
}
