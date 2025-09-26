//Passo 3: Usar o metodo generico com coringa.
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void imprimirListaFilmes(List<? extends Filme> lista) {
        for (Filme filme : lista) {
            System.out.println(filme.toString());
        }
    }
    public static void main(String[] args) {
        // Usando a classe generica customizada
        Caixa<String> caixaString = new Caixa<>();
        caixaString.adicionar("Java para Iniciantes");
        System.out.println("Conteudo da caixa de String: " + caixaString.obter());

        Caixa<Integer> caixaInteger = new Caixa<>();
        caixaInteger.adicionar(123);
        System.out.println("Conteudo da caixa de Integer: " + caixaInteger.obter());

        // Exemplo com Wildcard
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("O Chamado", Genero.ACAO));
        filmes.add(new Filme("A Chegada", Genero.FICCAO_CIENTIFICA));
        imprimirListaFilmes(filmes);
    }
}
