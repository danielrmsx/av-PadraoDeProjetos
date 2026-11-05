package questao2;

public class PerfilConveniado implements PerfilCobranca {

    public static final int MINUTOS_GRATUITOS = 30;
    public static final double VALOR_HORA = 8.00;
    public static final double PERCENTUAL_DESCONTO = 0.25;

    @Override
    public double calcular(int minutos) {
        if (minutos <= MINUTOS_GRATUITOS) {
            return 0.0;
        }
        int minutosCobrados = minutos - MINUTOS_GRATUITOS;
        int horas = (int) Math.ceil(minutosCobrados / 60.0);
        double valorHoraComDesconto = VALOR_HORA * (1 - PERCENTUAL_DESCONTO);
        return horas * valorHoraComDesconto;
    }

    @Override
    public String getNome() { return "Conveniado"; }
}
