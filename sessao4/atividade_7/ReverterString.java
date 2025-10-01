package sessao4.atividade_7;

public class ReverterString { // Classe para reverter uma string usando recursao.
    
    public static String reverter(String str) { // Metodo recursivo para reverter a string.
        // Se a string for nula, vazia ou tiver apenas 1 caractere,
        // nao ha nada a fazer, entao a retornamos.
        if (str == null || str.length() <= 1) { // Condicao de parada.
            return str; // Retorna a string original.
        }
        
        return reverter(str.substring(1)) + str.charAt(0); // Concatena o primeiro caractere no final da string revertida.
    }
        public static void main(String[] args) { // Metodo principal para testar a funcao de reverter.
        String original = "Revertido"; // String a ser revertida.
        String invertida = reverter(original); // Chama o metodo recursivo.
        
        System.out.println("String Original: " + original); // Exibe a string original.
        System.out.println("String Invertida: " + invertida); // Retorna a string invertida.
    }
} // Fim da classe ReverterString.
