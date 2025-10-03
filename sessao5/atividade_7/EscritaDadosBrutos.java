package sessao5.atividade_7;

import java.io.FileOutputStream; // Importa FileOutputStream para escrita de arquivos
import java.io.IOException; // Importa IOException para tratamento de erros

public class EscritaDadosBrutos { // Classe principal

    public static void main(String[] args) { // Método principal
        
        // 1. Cria um array de bytes (dados brutos)
        // Estes números serão escritos diretamente no arquivo binário.
        byte[] dados = {10, 20, 30, 40, 50, 60, 70}; // Exemplo de dados brutos
        // Nome do arquivo onde os dados serão escritos
        String nomeArquivo = "dados_brutos.dat"; 
        
        System.out.println("Iniciando a escrita de " + dados.length + " bytes no arquivo: " + nomeArquivo); // Mensagem inicial

        // 2. Usa try-with-resources com FileOutputStream
        // Isso garante que o 'outputStream' será fechado automaticamente no final do bloco try, 
        // mesmo se ocorrer uma exceção.
        try (FileOutputStream outputStream = new FileOutputStream(nomeArquivo)) { // Abre (ou cria) o arquivo para escrita
            // O FileOutputStream escreve dados em formato binário (bytes)
            
            // 3. Usa o método write(byte[]) para gravar o array inteiro no arquivo
            outputStream.write(dados); // Escreve os dados brutos no arquivo
            
            System.out.println("Escrita concluída com sucesso."); // Mensagem de sucesso
            
        } catch (IOException e) { // Trata exceções de I/O
            // Trata a exceção em caso de erro de I/O (ex: erro de permissão)
            System.err.println("\n--- ERRO de I/O ---"); // Mensagem de erro
            System.err.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage()); // Detalhes do erro
        }
        
        // Observação: Você pode verificar o arquivo 'dados_brutos.dat'. 
        // Se você abri-lo como texto, verá caracteres não legíveis, pois são dados binários.
    }
}
