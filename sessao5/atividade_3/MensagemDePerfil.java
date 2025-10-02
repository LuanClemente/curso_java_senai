import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class MensagemDePerfil { // Classe principal
    public static void main(String[] args) { // Método principal onde a execução do programa começa
        // Variáveis para armazenar os dados
        String nomeCompleto; // Nome completo (String)
        String cidade; // Cidade (String)
        int anoNascimento; // Ano de nascimento (int)

        // 1. Usando try-with-resources para garantir que o Scanner seja fechado automaticamente.
        // Isso é mais seguro e moderno que chamar scanner.close() manualmente.
        try (Scanner scanner = new Scanner(System.in)) { 
            // --- ENTRADA (INPUT) ---
            
            // 2. Coleta o nome completo (String)
            System.out.print("Digite seu nome completo: "); // Prompt para o usuário
            nomeCompleto = scanner.nextLine(); // Lê a entrada do usuário

            // 3. Coleta a cidade (String)
            System.out.print("Em qual cidade você mora? "); // Prompt para o usuário
            cidade = scanner.nextLine(); // Lê a entrada do usuário

            // 4. Coleta o ano de nascimento (int)
            System.out.print("Qual seu ano de nascimento? "); // Prompt para o usuário
            anoNascimento = scanner.nextInt(); // Lê a entrada do usuário
            
            // 5. O scanner.close() é chamado automaticamente aqui pelo try-with-resources.
        }
        
        // --- SAÍDA (OUTPUT) ---
        
        // 6. Imprime a mensagem de perfil combinada em uma única linha
        System.out.println("---"); // Cabeçalho para a seção de saída
        // Usando String.format para uma formatação mais limpa e legível.
        String mensagemFinal = String.format("Perfil criado: %s, de %s, nascido(a) em %d.", nomeCompleto, cidade, anoNascimento); // Formata a mensagem final
        System.out.println(mensagemFinal); // Imprime a mensagem final
    }
} // Fim da classe MensagemDePerfil
