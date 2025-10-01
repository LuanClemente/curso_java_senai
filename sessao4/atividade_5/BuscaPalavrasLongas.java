package sessao4.atividade_5;

import java.util.regex.Pattern; // Importa a classe Pattern para trabalhar com expressoes regulares
import java.util.regex.Matcher; // Importa a classe Matcher para encontrar correspondencias de padroes

public class BuscaPalavrasLongas { // Classe principal
    public static void main(String[] args) { // Metodo main
        String texto = "Este eh um exercicio sobre Java e Expressoes Regulares em programacao."; // Texto de exemplo para analise
        
        // Padrao: \w{5,} -> Um caractere de palavra, repetido 5 ou mais vezes.
        String regex = "\\w{5,}"; // Define o padrao de busca para palavras com 5 ou mais caracteres sendo que o simbolo \w inclui letras, digitos e o caractere de underscore (_)
        Pattern padrao = Pattern.compile(regex); // Compila o padrao de expressao regular
        Matcher matcher = padrao.matcher(texto); // Cria um matcher para encontrar o padrao no texto
        
        System.out.println("Texto em analise: " + texto); // Exibe o texto que sera analisado
        System.out.println("----------------------------------------"); // Linha separadora
        System.out.println("Palavras com 5 ou mais caracteres:"); // Indica o inicio da lista de palavras encontradas
        
        int contador = 0; // Contador para o numero de palavras encontradas
        
        // Loop while para encontrar todas as ocorrencias do padrao
        while (matcher.find()) { // Enquanto houver correspondencias
            // matcher.group() retorna a string que corresponde ao padrao
            String palavraEncontrada = matcher.group(); // Armazena a palavra encontrada
            System.out.println(" - " + palavraEncontrada); // Exibe a palavra encontrada
            contador++; // Incrementa o contador
        }
        
        System.out.println("----------------------------------------"); // Linha separadora
        System.out.println("Total de palavras longas encontradas: " + contador); // Exibe o total de palavras encontradas
    }
} // Fim da classe BuscaPalavrasLongas
