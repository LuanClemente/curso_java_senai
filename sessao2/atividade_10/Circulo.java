package sessao2.atividade_10;

public final class Circulo implements Forma { // Classe final para Círculo
    private final double raio; // Raio do círculo atributo final

    public Circulo(double raio) { // Construtor para inicializar o raio
        this.raio = raio; // Atribuição do valor do raio
    }

    @Override // Implementação do método getArea da interface Forma
    public double getArea() { // Cálculo da área do círculo
        return Math.PI * raio * raio; // Fórmula para a área do círculo
    }

    @Override // Implementação do método getPerimetro da interface Forma
    public double getPerimetro() { // Cálculo do perímetro do círculo
        return 2 * Math.PI * raio; // Fórmula para o perímetro do círculo
    }
}
    // fim da classe