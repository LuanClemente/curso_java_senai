import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class ConversorUnidades { // Classe principal

    public static void main(String[] args) { // Método principal onde a execução do programa começa
        // 1. Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in); // Scanner para entrada de dados
        
        // Variáveis para armazenar os valores
        double valorEmMetros; // Valor em metros (entrada)
        double valorEmCentimetros; // Valor em centímetros (saída)
        
        // O fator de conversão é uma constante
        final double FATOR_CONVERSAO = 100.0; // 1 metro = 100 centímetros

        // --- ENTRADA (INPUT) ---
        
        // 2. Solicita e lê o valor em metros (tipo double/ponto flutuante)
        System.out.print("Digite o valor em metros (ex: 1.75): "); // Prompt que aparece para o usuário
        valorEmMetros = scanner.nextDouble(); // Lê o valor digitado pelo usuário

        // 3. Fecha o objeto Scanner
        scanner.close(); 
        
        // --- PROCESSAMENTO ---
        
        // 4. Calcula o valor equivalente em centímetros
        valorEmCentimetros = valorEmMetros * FATOR_CONVERSAO; // Converte metros para centímetros
        
        // --- SAÍDA (OUTPUT) ---
        
        // 5. Imprime o resultado da conversão
        System.out.println("\n--- Conversão ---"); // Cabeçalho para a seção de saída (\n cria uma nova linha)
        System.out.println(valorEmMetros + " metros equivalem a " + valorEmCentimetros + " centímetros."); // Exibe o resultado da conversão
    }
} // Fim da classe ConversorUnidades
