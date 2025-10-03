package sessao5.atividade_9;

import java.io.BufferedReader; // Importa a classe BufferedReader para leitura eficiente de texto
import java.io.BufferedWriter; // Importa a classe BufferedWriter para escrita eficiente de texto
import java.io.FileReader; // Importa a classe FileReader para ler arquivos de texto
import java.io.FileWriter; // Importa a classe FileWriter para escrever arquivos de texto
import java.io.IOException; // Importa a classe IOException para tratamento de erros de I/O

public class NumeradorDeL { // Classe principal para numerar linhas de um arquivo de texto

    public static void main(String[] args) { // Método principal onde a execução começa
        String arquivoEntrada = "entrada.txt"; // Nome do arquivo de entrada
        String arquivoSaida = "saida_numerada.txt"; // Nome do arquivo de saída
        
        System.out.println("Processando o arquivo: " + arquivoEntrada); // Informa o arquivo de entrada
        System.out.println("Gerando arquivo de saída: " + arquivoSaida + "\n"); // Informa o arquivo de saída
        
        // Inicializa o contador de linhas
        int contadorLinhas = 1;

        // 1. Usa a sintaxe try-with-resources para garantir o fechamento AUTOMÁTICO
        // de ambos os streams (leitor e escritor), mesmo em caso de erro.

        try ( // Início do bloco try-with-resources
            // Abre o leitor com buffer para leitura eficiente linha por linha
            BufferedReader leitor = new BufferedReader(new FileReader(arquivoEntrada)); // Cria o leitor do arquivo
            
            // Abre o escritor com buffer para escrita eficiente
            BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida)) // Cria o escritor do arquivo
        ) { // Fim do bloco try-with-resources
            String linha; // Variável para armazenar cada linha lida
            
            // 2. Lê o arquivo linha por linha usando o método readLine()
            // O loop continua enquanto readLine() não retornar 'null' (fim do arquivo).
            while ((linha = leitor.readLine()) != null) { // Lê uma linha do arquivo de entrada
                
                // 3. Constrói a nova linha prefixada com o número
                String novaLinha = contadorLinhas + ": " + linha; // Formata a nova linha
                
                // 4. Escreve a nova linha no arquivo de saída
                escritor.write(novaLinha); // Escreve a linha no arquivo
                
                // Escreve o separador de linha
                escritor.newLine(); // Adiciona uma nova linha no arquivo
                
                // Incrementa o contador de linhas
                contadorLinhas++; 
                
                // Imprime no console para feedback
                System.out.println("Linha processada: " + novaLinha); // Mostra a linha processada
            }

        } catch (IOException e) {
            // Trata a exceção em caso de erro de I/O (ex: arquivo não encontrado)
            System.err.println("\n--- ERRO de I/O ---");
            System.err.println("Ocorreu um erro no processamento: " + e.getMessage()); // Mostra a mensagem de erro
        }
        
        System.out.println("\nProcessamento finalizado. Total de " + (contadorLinhas - 1) + " linhas gravadas."); // Informa o total de linhas processadas
    }
} // Fim da classe NumeradorDeL