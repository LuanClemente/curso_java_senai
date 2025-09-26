//Passo 3: Usar o metodo generico com coringa.
import java.util.List; //importa a interface List
import java.util.ArrayList; //importa a classe ArrayList

public class Main { //Classe principal
    public static void imprimirListaFilmes(List<? extends Filme> lista) { //Metodo que aceita listas de Filme ou suas subclasses
        for (Filme filme : lista) { //Percorre a lista de filmes
            System.out.println(filme.toString()); //Imprime cada filme (chama o metodo toString)
        }
    }
    public static void main(String[] args) { //Metodo principal
        // Usando a classe generica customizada
        Caixa<String> caixaString = new Caixa<>(); //Caixa para String
        caixaString.adicionar("Java para Iniciantes"); //Adiciona uma String
        System.out.println("Conteudo da caixa de String: " + caixaString.obter()); //Exibe o conteudo da caixa

        Caixa<Integer> caixaInteger = new Caixa<>(); //Caixa para Integer
        caixaInteger.adicionar(123); //Adiciona um Integer
        System.out.println("Conteudo da caixa de Integer: " + caixaInteger.obter()); //Exibe o conteudo da caixa

        // Exemplo com Wildcard
        List<Filme> filmes = new ArrayList<>(); //Cria uma lista de filmes
        filmes.add(new Filme("O Chamado", Genero.ACAO)); //Adiciona filmes a lista
        filmes.add(new Filme("A Chegada", Genero.FICCAO_CIENTIFICA)); //Adiciona filmes a lista
        imprimirListaFilmes(filmes); //Chama o metodo generico com a lista de filmes
    }
}
// Fim da classe principal