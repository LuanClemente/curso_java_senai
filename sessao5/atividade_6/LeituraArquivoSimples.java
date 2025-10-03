package sessao5.atividade_6;

import java.io.FileReader; // Importa FileReader para leitura de arquivos
import java.io.IOException; // Importa IOException para tratamento de erros

public class LeituraArquivoSimples { // Classe principal

    public static void main(String[] args) { // Método principal
        // Nome do arquivo a ser lido
        String nomeArquivo = "entrada.txt";
        FileReader leitor = null; // Inicializado como null para ser acessível no bloco finally
        
        System.out.println("Iniciando a leitura do arquivo: " + nomeArquivo + "\n"); // Mensagem inicial
        
        try {
            // 1. Usa FileReader (Character Stream) para abrir o arquivo
            leitor = new FileReader(nomeArquivo); // Abre o arquivo para leitura
            int caractereLido; // Variável para armazenar o caractere lido

            // 2. Implementa um loop para ler cada caractere
            // O método read() retorna o código ASCII do caractere ou -1 se o fim do arquivo for atingido.
            while ((caractereLido = leitor.read()) != -1) {
                // Converte o código ASCII de volta para um caractere e imprime no console
                System.out.print((char) caractereLido);
            }

        } catch (IOException e) { // Trata exceções de I/O
            // 3. Trata a exceção em caso de erro (ex: arquivo não encontrado)
            System.err.println("\n--- ERRO de I/O ---"); // Mensagem de erro
            System.err.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage()); // Detalhes do erro
        } finally { // Bloco finally
            // O bloco finally garante que o recurso (FileReader) será fechado,
            // independentemente de ter ocorrido uma exceção ou não.
            try { // Tenta fechar o FileReader
                if (leitor != null) { // Verifica se o leitor foi inicializado corretamente
                    leitor.close(); // Fecha o arquivo aberto pelo FileReader
                    System.out.println("\n\nLeitor de arquivo fechado com sucesso."); // Mensagem de sucesso
                }
            } catch (IOException e) { // Trata exceções de I/O
                // Trata exceções caso o fechamento do arquivo falhe
                System.err.println("Erro ao tentar fechar o arquivo: " + e.getMessage()); // Detalhes do erro
            }
        }
    }
} // Fim da classe LeituraArquivoSimples
