import java.util.ArrayList; // Importa a classe ArrayList do pacote java.util

public class ExemploArrayList { // Classe principal
    public static void main(String[] args) { // Método principal
        // Criamos uma lista que só aceita nomes (String)
        ArrayList<String> listaPresenca = new ArrayList<>(); // Declaração e inicialização do ArrayList

        // 1. Adicionar nomes à lista (eles são adicionados no final)
        System.out.println("--- Adicionando nomes ---"); // Mensagem inicial
        listaPresenca.add("Ana"); // Adiciona "Ana" à lista
        listaPresenca.add("Bruno"); // Adiciona "Bruno" à lista
        listaPresenca.add("Carla"); // Adiciona "Carla" à lista
        System.out.println("Lista inicial: " + listaPresenca); // Saída: [Ana, Bruno, Carla]

        // 2. Acessar um nome pela sua posição (índice)
        String primeiroNome = listaPresenca.get(0); // Acessa o primeiro nome (índice 0)
        System.out.println("O primeiro nome da lista é: " + primeiroNome); // Saída: Ana

        // 3. Remover um nome
        System.out.println("\n--- Removendo um nome ---"); // Mensagem inicial
        listaPresenca.remove("Bruno"); // Remove "Bruno" da lista
        System.out.println("Lista após remover 'Bruno': " + listaPresenca); // Saída: [Ana, Carla]
    }
}
// Fim da classe ExemploArrayList