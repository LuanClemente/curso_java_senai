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


    // URL de conexão JDBC para o SQL Server rodando no Docker.
    // O 'trustServerCertificate=true' é necessário para conexões de desenvolvimento.
    public static final String DB_URL = "jdbc:sqlserver://127.0.0.1:1433;databaseName=estoque;encrypt=true;trustServerCertificate=true;";
   
    // Usuário do banco de dados. Usaremos o 'sa' que configuramos no Docker.
    public static final String DB_USER = "sa";
   
    // Senha do banco de dados.
    // ATENÇÃO: Em um projeto real, NUNCA coloque a senha diretamente no código. Use variáveis de ambiente.
    public static final String DB_PASSWORD = "Lc@45115722"; //
   
    // Opcional: Adicionar um construtor privado impede a criação de instâncias desta classe
    private DatabaseConfig() {
        // Esta classe serve apenas para manter constantes
    }
}
