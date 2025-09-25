package sessao2.atividade_9;

public final class Bicicleta implements Veiculo {
    private final double custoDeManutencaoPorKm;

    public Bicicleta(double custoDeManutencaoPorKm) {
        this.custoDeManutencaoPorKm = custoDeManutencaoPorKm;
    }

    @Override
    public double calcularCustoPorKm(double distancia) {
        return distancia * custoDeManutencaoPorKm;
    }

    @Override
    public String getTipo() {
        return "Bicicleta";
    }
}