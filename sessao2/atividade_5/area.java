package sessao2.atividade_5;

//classe para calcular a área do retângulo
public class area {
    //metodo main para executar o cálculo da área
    public static void main(String[] args) {
        retangulo meuRetangulo = new retangulo(10.0, 2.5); //altura e largura do retângulo
        double area = meuRetangulo.calcularArea(); //chama o método para calcular a área
        System.out.println("A área do retângulo é: " + area); //exibe o resultado no terminal
    }
}
