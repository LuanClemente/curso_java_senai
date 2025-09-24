package sessao2.atividade_5;

//criando classe retangulo
public class retangulo {

    //criando valores para altura e largura
    private double altura;
    private double largura;

    //construtor da classe retangulo
    public retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    //método para calcular a área do retângulo
    public double calcularArea() {
        return altura * largura;
    }
}
        
