package questao2;

public class Ticket {

    private final String placa;
    private final int minutos;
    private PerfilCobranca perfil;

    public Ticket(String placa, int minutos, PerfilCobranca perfil) {
        this.placa = placa;
        this.minutos = minutos;
        this.perfil = perfil;
    }

    public void setPerfil(PerfilCobranca perfil) {
        this.perfil = perfil;
    }

    public double calcularValor() {
        return perfil.calcular(minutos);
    }

    public String getPlaca() { return placa; }
    public int getMinutos() { return minutos; }
    public PerfilCobranca getPerfil() { return perfil; }
}
