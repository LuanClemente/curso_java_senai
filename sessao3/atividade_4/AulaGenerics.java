import java.util.List; //importa a interface List

public class AulaGenerics { //Classe principal
    // Metodo generico com wildcard
    public static void imprimirListaFilmes(List<? extends Filme> lista) { //Metodo que aceita listas de Filme ou suas subclasses
        System.out.println("Lista de Filmes:"); //Imprime o titulo
        for (Filme filme : lista) { //Percorre a lista de filmes
            System.out.println(filme); //Imprime cada filme (chama o metodo toString)
        }
    }
}// Fim da classe principal