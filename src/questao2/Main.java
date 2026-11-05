package questao2;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Questão 2 - Strategy (Tarifa de Estacionamento) ===");

        int minutos = 130;

        PerfilCobranca[] perfis = {
            new PerfilRotativo(),
            new PerfilMensalista(),
            new PerfilConveniado()
        };

        System.out.println("\nMesmo tempo (" + minutos + " min) nos três perfis:");
        for (PerfilCobranca perfil : perfis) {
            Ticket t = new Ticket("ABC1D23", minutos, perfil);
            System.out.println(String.format("  %-11s -> R$ %.2f",
                    perfil.getNome(), t.calcularValor()));
        }

        System.out.println("\nTroca de perfil no mesmo tíquete:");
        Ticket ticket = new Ticket("XYZ9K87", 95, new PerfilRotativo());
        imprimir(ticket);

        ticket.setPerfil(new PerfilConveniado());
        imprimir(ticket);

        ticket.setPerfil(new PerfilMensalista());
        imprimir(ticket);
    }

    private static void imprimir(Ticket t) {
        System.out.println(String.format("  Placa %s | %d min | %-11s -> R$ %.2f",
                t.getPlaca(), t.getMinutos(), t.getPerfil().getNome(), t.calcularValor()));
    }
}
