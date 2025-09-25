/**
 * Atividade 9: Modelagem de um Sistema de Veiculos

Crie um sistema para modelar diferentes tipos de veiculos.

Interface: Crie uma interface chamada Veiculo com os seguintes metodos:

double calcularCustoPorKm(double distancia): Retorna o custo total para uma determinada distancia.

String getTipo(): Retorna o tipo de veículo (ex: "Carro", "Bicicleta").

Classes: Implemente as seguintes classes que representam veiculos concretos, tornando-as imutaveis:

Carro: Propriedades: consumoPorLitro e precoCombustivelPorLitro.

Bicicleta: Propriedades: custoDeManutencaoPorKm.

Classe de Teste: Crie uma classe Main com o metodo main. Instancie um Carro e uma Bicicleta, e chame os metodos da interface para demonstrar o calculo do custo e o tipo de cada veiculo.
Dica: Para tornar as classes imutaveis, declare todos os campos como final, nao forneca metodos setters e inicialize os campos no construtor.

Codigo:

Veiculo.java (Interface)

public interface Veiculo {
    double calcularCustoPorKm(double distancia);
    String getTipo();
}

Carro.java (Classe Imutável)

public final class Carro implements Veiculo {
    private final double consumoPorLitro;
    private final double precoCombustivelPorLitro;

    public Carro(double consumoPorLitro, double precoCombustivelPorLitro) {
        this.consumoPorLitro = consumoPorLitro;
        this.precoCombustivelPorLitro = precoCombustivelPorLitro;
    }

    @Override
    public double calcularCustoPorKm(double distancia) {
        return (distancia / consumoPorLitro) * precoCombustivelPorLitro;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }
}

Bicicleta.java (Classe Imutável)

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

Main.java (Classe de Teste)

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro(10.0, 5.50); // 10 km/L, R$ 5,50/L
        Veiculo bicicleta = new Bicicleta(0.25); // R$ 0,25/km

        double distancia = 50.0;

        System.out.println("Veículo: " + carro.getTipo());
        System.out.println("Custo para " + distancia + "km: R$ " + carro.calcularCustoPorKm(distancia));

        System.out.println("\nVeículo: " + bicicleta.getTipo());
        System.out.println("Custo para " + distancia + "km: R$ " + bicicleta.calcularCustoPorKm(distancia));
    }
}


 */


package sessao2.atividade_9;

public interface Veiculo { 
    // Metodos abstratos da interface Veiculo
    double calcularCustoPorKm(double distancia);
    String getTipo();
}
