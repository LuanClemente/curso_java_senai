package sessao5.atividade_5;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class CalculadoraIMC { // Classe principal

    public static void main(String[] args) { // Método principal
        // Cria o objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar os dados
        double peso; // peso que será em double
        double altura; // altura que será em double
        double imc; // imc que será em double

        // --- 1. ENTRADA (INPUT) ---
        
        // Solicita e lê o peso (double)
        System.out.print("Digite seu peso em kg (ex: 75.5): ");
        peso = scanner.nextDouble(); // Lê o peso como double

        // Solicita e lê a altura (double)
        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        altura = scanner.nextDouble(); // Lê a altura como double

        // Fecha o Scanner
        scanner.close(); // Boa prática fechar o scanner após o uso
        
        // --- 2. PROCESSAMENTO ---
        
        // Calcula o IMC: Peso / (Altura * Altura)
        imc = peso / (altura * altura); // Fórmula do IMC
        
        // --- 3. SAÍDA (OUTPUT FORMATADO) ---
        
        System.out.println("\n--- Resultado ---"); // Cabeçalho do resultado
        // Usa System.out.printf para formatar a saída.
        // O formato "%.2f" garante que o número double (f) seja exibido com
        // exatamente duas casas decimais (.2).
        System.out.printf("Seu IMC calculado é: %.2f%n", imc); // Exibe o IMC formatado com 2 casas decimais

        //exibir a classificação do IMC

        if (imc < 18.5) { // se IMC < 18.5 pessoa está abaixo do peso
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 24.9) { // se IMC < 24.9 pessoa está no peso normal
            System.out.println("Classificação: Peso normal");
        } else if (imc < 29.9) { // se IMC < 29.9 pessoa está com sobrepeso
            System.out.println("Classificação: Sobrepeso");
        } else { // se IMC >= 29.9 pessoa está com obesidade
            System.out.println("Classificação: Obesidade");
        }
    }
} // Fim da classe CalculadoraIMC

