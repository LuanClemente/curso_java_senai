package sessao4.atividade_2;

public class ParsingRegistro { // Classe para analisar um registro de aluno
    public static void main(String[] args) { // Metodo principal
        String registro = "2024001;Joao Silva;Java Programming;9.5"; // Registro do aluno a ser analisado
        
        System.out.println("Registro Original: " + registro); // Exibe o registro original
        System.out.println("----------------------------------------"); // Linha divisoria
        
        // 1. Use split() para dividir a string pelo delimitador ";"
        String[] dados = registro.split(";");// Divide o registro em partes usando ";" como delimitador
        
        // Os dados sao armazenados nas seguintes posicoes:
        // dados[0]: Matricula
        // dados[1]: Nome do Aluno
        // dados[2]: Curso
        // dados[3]: Nota
        
        if (dados.length == 4) { // Verifica se o registro foi dividido corretamente em 4 partes
            System.out.println("Matricula: " + dados[0]); // 1. Imprimir a matricula
            
            // 2. Imprimir o nome em maiusculas
            String nomeUpper = dados[1].toUpperCase(); // Converte o nome para maiusculas
            System.out.println("Nome:      " + nomeUpper); // Exibe o nome em maiusculas
            
            System.out.println("Curso:     " + dados[2]); // Imprimir o curso
            
            // 3. Imprimir a nota
            System.out.println("Nota:      " + dados[3]); // Exibe a nota
        } else { // Se o registro nao tiver 4 partes, exibe uma mensagem de erro
            System.out.println("Erro: O formato do registro nao corresponde ao esperado."); // Mensagem de erro
        }
    }
} // Fim da classe ParsingRegistro

