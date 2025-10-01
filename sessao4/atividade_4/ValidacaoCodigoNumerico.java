package sessao4.atividade_4;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidacaoCodigoNumerico {
    public static void main(String[] args) {
        
        // Padrao: exatamente 6 digitos (\d{6})
        // O uso de "\\d" eh necessario em Strings Java para escapar a barra.
        String regex = "\\d{6}"; 
        Pattern padrao = Pattern.compile(regex);
        
        String codigo1 = "123456"; // Valido
        String codigo2 = "12345";  // Invalido (5 digitos)
        String codigo3 = "12345a"; // Invalido (contem letra)
        String codigo4 = "1234567"; // Invalido (7 digitos)
        
        System.out.println("Padrao: " + regex);
        System.out.println("----------------------------------------");
        
        // Funcao auxiliar para testar e imprimir o resultado
        testarCodigo(padrao, codigo1);
        testarCodigo(padrao, codigo2);
        testarCodigo(padrao, codigo3);
        testarCodigo(padrao, codigo4);
    }
    
    public static void testarCodigo(Pattern padrao, String codigo) {
        // Cria o Matcher para a string atual
        Matcher matcher = padrao.matcher(codigo);
        
        // Usa matches() para verificar se a string INTEIRA se encaixa no padrao.
        boolean isValido = matcher.matches();
        
        System.out.printf("Codigo '%s': %s%n", codigo, isValido ? "VALIDO" : "INVALIDO");
    }
}
