package sessao5.atividade_11;

import java.io.BufferedWriter; // Importa a classe BufferedWriter para escrita com buffer 
import java.io.FileWriter; // Importa a classe FileWriter para escrita em arquivos 
import java.io.IOException; // Importa a classe IOException para tratamento de erros de I/O 
import java.io.Writer; // Importa a classe Writer para manipulação de escrita genérica 


public class AplicacaoDecorator { // Classe principal para demonstrar o uso do UpperCaseWriter com o padrão Decorator


    public static void main(String[] args) { // Método principal que executa a lógica de escrita no arquivo
        // Nome do arquivo onde a frase será salva
        String nomeArquivo = "maiusculo.txt";
       
        // Frase que será escrita em minúsculas
        String fraseOriginal = "esta é uma frase de teste em letras minúsculas.";
       
        System.out.println("Frase original (minúscula): \"" + fraseOriginal + "\""); // Exibe a frase original 
        System.out.println("Gravando no arquivo " + nomeArquivo + " usando o UpperCaseWriter..."); // Indica o início da escrita no arquivo
       
        // Define o stream mais externo como Writer para o try-with-resources
        Writer escritorFinal = null;


        // 1. Encadeamento de Streams (Padrão Decorator):
        // FileWriter -> UpperCaseWriter (Customizado) -> BufferedWriter (Eficiência)
        try (
            // O Writer mais externo é o BufferedWriter para bufferizar a saída.
            // Ele recebe o nosso UpperCaseWriter como argumento.
            BufferedWriter escritor = new BufferedWriter(
                // O UpperCaseWriter recebe o FileWriter.
                // A ordem de processamento é de fora para dentro na construção e de dentro para fora na escrita.
                new UpperCaseWriter(
                    new FileWriter(nomeArquivo) // O stream base para escrita no arquivo
                )
            )
        ) {
            // 2. Escreve a frase em minúsculas. O UpperCaseWriter irá interceptar e converter.
            escritor.write(fraseOriginal);
           
            // É importante fazer o flush para garantir que o buffer seja esvaziado no arquivo.
            escritor.flush();
           
            System.out.println("\nEscrita concluída. Verifique o arquivo " + nomeArquivo + "."); // Indica que a escrita foi concluída 
            System.out.println("O conteúdo deve estar em CAIXA ALTA."); // Informa que o conteúdo estará em maiúsculas 


        } catch (IOException e) { // Captura exceções de I/O durante a escrita
            System.err.println("\n--- ERRO DE I/O ---"); // Mensagem de erro
            System.err.println("Falha ao escrever ou fechar o arquivo: " + e.getMessage()); // Exibe a mensagem de erro
        }
   }
}
