//Passo 1: Criar a classe generica Caixa.

public class Caixa<T> { //Classe generica com tipo T
    private T item; //Atributo do tipo generico T

    public void adicionar(T item) { //Metodo para adicionar item do tipo T
        this.item = item; //Atribui o item ao atributo
    }

    public T obter() { //Metodo para obter o item do tipo T
        return this.item; //Retorna o item armazenado
    }
}
// Fim da classe Caixa