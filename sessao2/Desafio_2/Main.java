package sessao2.Desafio_2;

public class Main {
       public static void main(String[] args) {
        ListaDeCompras lista = new ListaDeCompras();
        lista.adicionarItem("Pão", 0);
        lista.adicionarItem("Leite", 1);
        lista.adicionarItem("Maçã", 2);
        lista.adicionarItem("Arroz", 3);
        lista.adicionarItem("Feijão", 4);
        lista.imprimirLista();
        
        System.out.println("Item no índice 0: " + lista.obterItem(0));

        lista.adicionarItem("Ovos", 10);    // Índice inválido
        lista.imprimirLista();              // Deve lançar uma exceção
        
    }
}

