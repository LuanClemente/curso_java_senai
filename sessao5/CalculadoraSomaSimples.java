package sessao5;

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class CalculadoraSomaSimples { // Classe principal

    public static void main(String[] args) { // Método principal onde a execução do programa começa
        
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        
        // Variáveis para armazenar os números
        int primeiroNumero; // Declaração da variável para o primeiro número dizemos que tem que ser um inteiro
        int segundoNumero; // Declaração da variável para o segundo número dizemos que tem que ser um inteiro
        int soma; // Declaração da variável para armazenar a soma dos dois números Inteiros

        // --- ENTRADA (INPUT) ---
        
        System.out.print("Por favor, digite o primeiro número inteiro: "); // Solicita o primeiro número ao usuário
        primeiroNumero = scanner.nextInt(); // Lê o primeiro número inteiro digitado pelo usuário

        System.out.print("Agora, digite o segundo número inteiro: "); // Solicita o segundo número ao usuário
        segundoNumero = scanner.nextInt(); // Lê o segundo número inteiro digitado pelo usuário
        
        scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
        
        // --- PROCESSAMENTO ---
        
        soma = primeiroNumero + segundoNumero; // Calcula a soma dos dois números e armazena na variável 'soma'
        
        // --- SAÍDA (OUTPUT) ---
        
        System.out.println("\n--- Resultado ---"); // Imprime um cabeçalho para o resultado (\n cria uma nova linha)
        System.out.println("A soma dos números " + primeiroNumero + " e " + segundoNumero + " é: " + soma);// Imprime o resultado da soma formatado
    }
}
// Fim da classe CalculadoraSomaSimples