package sessao5.atividade_13.Infra.data;
/**
 * Classe que armazena as configurações de conexão com o banco de dados.
 * O uso de 'public static final' garante que esses valores:
 * 1. Sejam constantes (FINAL): não podem ser alterados após a inicialização.
 * 2. Pertençam à classe (STATIC): não é necessário criar uma instância de DatabaseConfig
 * para acessar as variáveis.
 * 3. Sejam acessíveis em qualquer lugar (PUBLIC).
 */
public class DatabaseConfig {


    // URL de conexão JDBC (simulação)
    public static final String DB_URL = "jdbc:mysql://localhost:3306/estoque_db";
   
    // Usuário do banco de dados (simulação)
    public static final String DB_USER = "usuario_app";
   
    // Senha do banco de dados (simulação)
    public static final String DB_PASSWORD = "senha123";
   
    // Opcional: Adicionar um construtor privado impede a criação de instâncias desta classe
    private DatabaseConfig() {
        // Esta classe serve apenas para manter constantes
    }
}
