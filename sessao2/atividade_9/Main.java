package sessao2.atividade_9;

public class Main { // Classe principal para testar os veiculos
    public static void main(String[] args) { // Metodo principal
        Veiculo carro = new Carro(10.0, 5.50); // definindo um carro com consumo de 10 km/l e preco do combustivel R$ 5,50/l
        Veiculo bicicleta = new Bicicleta(0.25); // definindo uma bicicleta com custo de manutencao R$ 0,25/km

        double distancia = 50.0; // definindo distancia percorrida

        System.out.println("Veículo: " + carro.getTipo()); // Exibindo o tipo do veiculo
        System.out.println("Custo para " + distancia + "km: R$ " + carro.calcularCustoPorKm(distancia)); // Exibindo o custo para a distancia percorrida

        System.out.println("\nVeículo: " + bicicleta.getTipo()); // Exibindo o tipo do veiculo
        System.out.println("Custo para " + distancia + "km: R$ " + bicicleta.calcularCustoPorKm(distancia)); // Exibindo o custo para a distancia percorrida
    }
} // Fim da classe Main