public class Filme { //Classe Filme
    private String titulo; //Atributo titulo
    private Genero genero; //Atributo genero

    public Filme(String titulo, Genero genero) { //Construtor
        this.titulo = titulo; //Atribui o titulo
        this.genero = genero; //Atribui o genero
    }

    @Override //Sobrescreve o metodo toString para exibir informacoes do filme
    public String toString() { //Metodo toString
        return "Filme{" + "titulo='" + titulo + '\'' + ", genero=" + genero + '}'; //Retorna a representacao em string do filme
    }
}
// Fim da classe Filme