package sessao5.atividade_13.Infra.data;

import sessao5.atividade_13.Infra.data.DatabaseConfig;
import sessao5.atividade_13.Infra.data.ProdutoDAO;


public class AplicacaoConfig {
   
    public static void main(String[] args) {
       
        System.out.println("--- DEMONSTRAÇÃO DE ACESSO ÀS CONSTANTES ---");


        // Acessando as constantes de configuração diretamente da classe,
        // sem criar uma instância de DatabaseConfig.
       
        System.out.println("1. Acessando DB_URL: " + DatabaseConfig.DB_URL);
        System.out.println("2. Acessando DB_USER: " + DatabaseConfig.DB_USER);
        System.out.println("3. Acessando DB_PASSWORD: " + DatabaseConfig.DB_PASSWORD);
       
        System.out.println("\n-------------------------------------------");


        // Cria uma instância do DAO e usa as configurações
        ProdutoDAO dao = new ProdutoDAO();
        dao.conectar();
    }
}
