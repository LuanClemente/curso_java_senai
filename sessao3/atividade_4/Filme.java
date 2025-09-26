public class Filme {
    private String titulo;
    private Genero genero;

    public Filme(String titulo, Genero genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" + "titulo='" + titulo + '\'' + ", genero=" + genero + '}';
    }
}
