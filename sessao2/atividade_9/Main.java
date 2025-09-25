package sessao2.atividade_9;

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