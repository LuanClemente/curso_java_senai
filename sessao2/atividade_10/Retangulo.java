package sessao2.atividade_10;

public final class Retangulo implements Forma { // Classe final para Retângulo
    private final double largura; // Largura do retângulo atributo final
    private final double altura; // Altura do retângulo atributo final

    public Retangulo(double largura, double altura) { // Construtor para inicializar largura e altura
        this.largura = largura; // Atribuição do valor da largura
        this.altura = altura; // Atribuição do valor da altura
    }

    @Override // Implementação do método getArea da interface Forma
    public double getArea() { // Cálculo da área do retângulo
        return largura * altura; // Fórmula para a área do retângulo
    }

    @Override // Implementação do método getPerimetro da interface Forma
    public double getPerimetro() { // Cálculo do perímetro do retângulo
        return 2 * (largura + altura); // Fórmula para o perímetro do retângulo
    }
}
// fim da classe