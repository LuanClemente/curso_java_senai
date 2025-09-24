package desafios;
//nosso objetivo e inverter os valores das variaveis

public class desafio1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        //acima vemos o valor orignal das variavies

        //abaixo usamos o temp para poder inverter os valores
        int temp = a;
        a = b;
        b = temp;

        //abaixo colocamos para printar no terminal os valores das variaveis que devem estar trocados
        System.out.println("a = " + a); // Deve imprimir 25
        System.out.println("b = " + b); // Deve imprimir 10
    }
}
