package sessao5.atividade_10;

import java.io.*; // Importa classes para manipulação de arquivos e streams de objetos
import sessao5.atividade_8.Produto; // Importa a classe Produto correta para serialização

public class SerializacaoEDesserializacao { // Classe principal para demonstrar serialização e desserialização de objetos
    
    // Nome do arquivo onde o objeto será salvo
    private static final String ARQUIVO_SER = "produto.ser";

    public static void main(String[] args) { // Método principal que executa a lógica de serialização e desserialização
        
        // 1. Criação do Objeto Original
        // O código é 101, mas foi marcado como transient na classe Produto.
        Produto original = new Produto("Celular S10", 1500.0, 101); // Cria um objeto Produto
        System.out.println("--- 1. OBJETO ORIGINAL ---"); // Exibe o objeto original
        System.out.println("Objeto Original: " + original); // Usa o método toString() da classe Produto
        System.out.println("Código Original (transient): " + original.getCodigo()); // Exibe o código original (transient)
        
        // ----------------------------------------
        // A. SERIALIZAÇÃO (Salvando o Objeto)
        // ----------------------------------------
        System.out.println("\n--- 2. SERIALIZANDO Objeto para o arquivo: " + ARQUIVO_SER); // Indica o início da serialização do objeto
        try ( // Try-with-resources para garantir o fechamento dos streams
            // Usa FileOutputStream para o fluxo de bytes no arquivo
            FileOutputStream fileOut = new FileOutputStream(ARQUIVO_SER);
            // Usa ObjectOutputStream para escrever o objeto no fluxo de bytes
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut)
        ) {
            // Escreve o objeto no arquivo.
            objOut.writeObject(original);
            System.out.println("Serialização concluída. Estado salvo."); // Confirma que a serialização foi concluída com sucesso
            
        } catch (IOException i) { // Captura exceções de I/O
            i.printStackTrace(); // Exibe o rastreamento da pilha para depuração
            return; // Termina se a serialização falhar
        }

        // ----------------------------------------
        // B. DESSERIALIZAÇÃO (Carregando o Objeto)
        // ----------------------------------------
        System.out.println("\n--- 3. DESSERIALIZANDO Objeto do arquivo: " + ARQUIVO_SER); // Indica o início da desserialização do objeto
        Produto restaurado = null; // Inicializa a variável para o objeto restaurado
        
        try ( // Try-with-resources para garantir o fechamento dos streams
            // Usa FileInputStream para ler o fluxo de bytes do arquivo
            FileInputStream fileIn = new FileInputStream(ARQUIVO_SER);
            // Usa ObjectInputStream para ler o objeto a partir do fluxo de bytes
            ObjectInputStream objIn = new ObjectInputStream(fileIn)
        ) {
            // Lê o objeto e faz o casting para a classe Produto
            restaurado = (Produto) objIn.readObject(); // Desserializa o objeto do arquivo
            System.out.println("Desserialização concluída. Objeto restaurado."); // Confirma que a desserialização foi concluída com sucesso
            
        } catch (IOException i) { // Captura exceções de I/O durante a desserialização
            i.printStackTrace(); // Exibe o rastreamento da pilha para depuração
            return; // Termina se a desserialização falhar
        } catch (ClassNotFoundException c) { // Captura exceções se a classe do objeto não for encontrada 
            System.out.println("Classe Produto não encontrada."); // Mensagem de erro específica
            c.printStackTrace(); // Exibe o rastreamento da pilha para depuração 
            return; // Termina se a classe não for encontrada 
        }
        
        // ----------------------------------------
        // 4. COMPROVAÇÃO DO EFEITO TRANSIENT
        // ----------------------------------------
        System.out.println("\n--- 4. COMPROVAÇÃO ---"); // Indica o início da comprovação do efeito transient
        System.out.println("Objeto Restaurado: " + restaurado); // Exibe o objeto restaurado
        
        // Comprova que o campo 'codigo' foi perdido
        System.out.println("\nEfeito Transient:"); // Explica o efeito do modificador transient 
        System.out.println("Nome (Salvo): " + restaurado.getNome()); // Exibe o nome restaurado do objeto
        System.out.println("Preço (Salvo): " + restaurado.getPreco()); // Exibe o preço restaurado do objeto 
        System.out.println("Código (Transient, PERDIDO): " + restaurado.getCodigo()); // Exibe o código, que foi perdido devido ao modificador transient
    } // Fim do método main
}
