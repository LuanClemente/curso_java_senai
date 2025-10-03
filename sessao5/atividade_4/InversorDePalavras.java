package sessao5.atividade_4;

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class InversorDePalavras { // Classe principal

    /**
     * Função auxiliar para inverter uma String.
     * @param palavra A string a ser invertida.
     * @return A string invertida.
     */
    public static String inverterString(String palavra) { // Função para inverter a string
        // Usa a classe StringBuilder para facilitar a inversão
        StringBuilder sb = new StringBuilder(palavra); // Cria um StringBuilder com a palavra original
        return sb.reverse().toString(); // Inverte e retorna a string
    }

    public static void main(String[] args) { // Método principal
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        String entrada; // Variável para armazenar a entrada do usuário

        // --- 1. ENTRADA ---
        
        // Solicita a entrada, usando apenas uma chamada nextLine()
        System.out.print("Digite três palavras separadas por espaço: "); // Prompt para o usuário
        entrada = scanner.nextLine();  // Lê a linha inteira de entrada
        
        // Exibe a frase original
        System.out.println("Frase original: " + entrada); // Mostra a frase original

        // --- 2. PROCESSAMENTO (Split e Inversão) ---
        
        // Usa o método split() para dividir a String em um array
        // O delimitador é o espaço (" ")
        String[] palavras = entrada.split(" "); // Divide a entrada em palavras
        
        // Verifica se há pelo menos três palavras antes de prosseguir
        if (palavras.length >= 3) { // Garante que há pelo menos três palavras
            // A segunda palavra está no índice 1 do array
            String palavraAInverter = palavras[1]; // Pega a segunda palavra
            
            // Inverte a segunda palavra usando a função auxiliar
            String palavraInvertida = inverterString(palavraAInverter); // Inverte a palavra
            
            // Substitui a palavra original pela versão invertida no array
            palavras[1] = palavraInvertida;
            
            // Junta o array de volta em uma única String para a saída
            String fraseModificada = String.join(" ", palavras);
            
            // --- 3. SAÍDA ---
            System.out.println("Frase modificada: " + fraseModificada); // Mostra a frase modificada
            
        } else {
            System.out.println("Erro: Por favor, digite pelo menos três palavras."); // Erro se não houver três palavras
        }

        scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
    }
} // Fim da classe InversorDePalavras
