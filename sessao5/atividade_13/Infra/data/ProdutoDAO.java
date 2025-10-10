package sessao5.atividade_13.Infra.data;


/**
 * Classe ProdutoDAO (Data Access Object).
 * Responsável por todas as operações de CRUD (Create, Read, Update, Delete)
 * relacionadas à entidade Produto.
 * Ela usará as constantes definidas em DatabaseConfig.
 */
public class ProdutoDAO {
   
    public ProdutoDAO() {
        // Construtor
        System.out.println("ProdutoDAO inicializado.");
    }


    /**
     * Método que simula a abertura de uma conexão com o banco.
     */
    public void conectar() {
        System.out.println("\nTentando conectar ao banco de dados...");
        System.out.println("URL: " + DatabaseConfig.DB_URL);
        System.out.println("Usuário: " + DatabaseConfig.DB_USER);
        // Nota: Em aplicações reais, a senha NUNCA deve ser logada!
        System.out.println("Senha: " + DatabaseConfig.DB_PASSWORD);
        System.out.println("Conexão simulada com sucesso!");
    }
}
