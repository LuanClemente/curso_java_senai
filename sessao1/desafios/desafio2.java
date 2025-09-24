package desafios;
//O objetivo nosso e calcular a media das notas e imprimir como numero flutuante

public class desafio2 {
    public static void main(String[] args) {
        int nota1 = 7;
        int nota2 = 8;
        int nota3 = 9;
        //acima temos nossas notas como os valores originais

        //abaixo temos o calculo somando as tres notas e dividindo por tres
        double resultado = (nota1 + nota2 + nota3) / 3.0;
        double media = resultado;//aqui definimos a media como o resultado do nosso calculo
        
        //abaixo vamos printar no terminal o resultado da media
        System.out.println("A média é: " + media); // Deve imprimir 8.0
    }
}