package sessao2.atividade_9;

public final class Bicicleta implements Veiculo { // Classe Bicicleta e implementando a interface Veiculo
    private final double custoDeManutencaoPorKm; // Custo de manutencao por km

    public Bicicleta(double custoDeManutencaoPorKm) { // Construtor da classe Bicicleta
        this.custoDeManutencaoPorKm = custoDeManutencaoPorKm; // Inicializando o custo de manutencao por km
    }

    @Override // Sobrescrevendo o metodo calcularCustoPorKm da interface Veiculo
    public double calcularCustoPorKm(double distancia) { // Metodo para calcular o custo por km
        return distancia * custoDeManutencaoPorKm; // Retornando o custo total
    }

    @Override
    public String getTipo() { // Sobrescrevendo o metodo getTipo da interface Veiculo
        return "Bicicleta"; // Retornando o tipo do veiculo
    }
} // Fim da classe Bicicleta