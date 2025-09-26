//Passo 1: Criar a classe generica Caixa.

public class Caixa<T> {
    private T item;

    public void adicionar(T item) {
        this.item = item;
    }

    public T obter() {
        return this.item;
    }
}