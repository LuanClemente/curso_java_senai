package sessao4.atividade_6;

import java.util.regex.Pattern; // Importa a classe Pattern
import java.util.regex.Matcher; // Importa a classe Matcher

public class ExtracaoData { // Classe principal
    public static void main(String[] args) { // Metodo principal
        String texto = "A reuniao esta marcada para 25/09/2025, anote ai."; // Texto de exemplo
        
        // Padrao: (DD)/(MM)/(AAAA)
        // \d{2} para dois digitos, \d{4} para quatro digitos.
        // Os parenteses criam os grupos de captura.
        String regex = "(\\d{2})/(\\d{2})/(\\d{4})"; // Padrao regex
        Pattern padrao = Pattern.compile(regex); // Compila o padrao
        Matcher matcher = padrao.matcher(texto); // Cria o matcher para o texto
        
        System.out.println("Texto Original: " + texto); // Exibe o texto original
        System.out.println("Padrao: " + regex); // Exibe o padrao regex
        System.out.println("----------------------------------------"); // linha divisoria
        
        if (matcher.find()) { // Verifica se encontrou uma correspondencia
            // matcher.group(0) eh a correspondencia completa: "25/09/2025"
            System.out.println("Data Completa: " + matcher.group(0)); // Exibe a data completa 
            
            // matcher.group(1) eh o conteudo do primeiro parentese
            String dia = matcher.group(1); // Captura o dia
            
            // matcher.group(2) eh o conteudo do segundo parentese
            String mes = matcher.group(2); // Captura o mes
            
            // matcher.group(3) eh o conteudo do terceiro parentese
            String ano = matcher.group(3); // Captura o ano
            
            System.out.println("Dia (Grupo 1): " + dia); // Exibe o dia
            System.out.println("MÃªs (Grupo 2): " + mes); // Exibe o mes
            System.out.println("Ano (Grupo 3): " + ano); // Exibe o ano
        } else { // Se nao encontrou nenhuma correspondencia
            System.out.println("Data nao encontrada no formato DD/MM/AAAA."); // Mensagem de erro
        }
    }
} // Fim da classe ExtracaoData

