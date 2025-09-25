package sessao2.atividade_9;

public final class Carro implements Veiculo {
    // Atributos imutáveis da classe Carro
    private final double consumoPorLitro;
    private final double precoCombustivelPorLitro;

    // Construtor da classe Carro que recebe os valores dos atributos
    public Carro(double consumoPorLitro, double precoCombustivelPorLitro) {
        this.consumoPorLitro = consumoPorLitro;
        this.precoCombustivelPorLitro = precoCombustivelPorLitro;
    }
//reendendo os métodos da interface Veiculo
    @Override
    public double calcularCustoPorKm(double distancia) {
        return (distancia / consumoPorLitro) * precoCombustivelPorLitro;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}