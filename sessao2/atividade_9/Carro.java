package sessao2.atividade_9;

public final class Carro implements Veiculo { // Criando classe Carro e implementando a interface Veiculo
    // Atributos imutáveis da classe Carro
    private final double consumoPorLitro; // Consumo do carro por litro
    private final double precoCombustivelPorLitro; // Preco do combustivel por litro

    // Construtor da classe Carro que recebe os valores dos atributos
    public Carro(double consumoPorLitro, double precoCombustivelPorLitro) { // Construtor da classe Carro
        this.consumoPorLitro = consumoPorLitro; // Inicializando o consumo por litro
        this.precoCombustivelPorLitro = precoCombustivelPorLitro; // Inicializando o preco do combustivel por litro
    }
//reendendo os métodos da interface Veiculo
    @Override // Sobrescrevendo o metodo calcularCustoPorKm da interface Veiculo
    public double calcularCustoPorKm(double distancia) { // Metodo para calcular o custo por km
        return (distancia / consumoPorLitro) * precoCombustivelPorLitro; // Retornando o custo total
    }

    @Override // Sobrescrevendo o metodo getTipo da interface Veiculo
    public String getTipo() { // Metodo para obter o tipo do veiculo
        return "Carro"; // Retornando o tipo do veiculo
    }
} // Fim da classe Carro