package sessao4.atividade_2;

public class ParsingRegistro {
    public static void main(String[] args) {
        String registro = "2024001;Joao Silva;Java Programming;9.5";
        
        System.out.println("Registro Original: " + registro);
        System.out.println("----------------------------------------");
        
        // 1. Use split() para dividir a string pelo delimitador ";"
        String[] dados = registro.split(";");
        
        // Os dados sao armazenados nas seguintes posicoes:
        // dados[0]: Matricula
        // dados[1]: Nome do Aluno
        // dados[2]: Curso
        // dados[3]: Nota
        
        if (dados.length == 4) {
            System.out.println("Matricula: " + dados[0]);
            
            // 2. Imprimir o nome em maiusculas
            String nomeUpper = dados[1].toUpperCase();
            System.out.println("Nome:      " + nomeUpper);
            
            System.out.println("Curso:     " + dados[2]);
            
            // 3. Imprimir a nota
            System.out.println("Nota:      " + dados[3]);
        } else {
            System.out.println("Erro: O formato do registro nao corresponde ao esperado.");
        }
    }
}

