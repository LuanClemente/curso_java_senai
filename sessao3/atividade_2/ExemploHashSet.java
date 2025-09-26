package sessao3.atividade_2;

import java.util.HashSet; // Importa a classe HashSet do pacote java.util
import java.util.Set; // Importa a interface Set do pacote java.util

public class ExemploHashSet { // Classe principal
    public static void main(String[] args) { // Método principal
        // Criamos um conjunto que só aceita tarefas (String)
        Set<String> tarefas = new HashSet<>(); // Declaração e inicialização do HashSet

        // 1. Adicionar tarefas ao conjunto
        System.out.println("--- Adicionando tarefas ---"); // Mensagem inicial
        tarefas.add("Comprar pão"); // Adiciona "Comprar pão" ao conjunto
        tarefas.add("Estudar Java"); // Adiciona "Estudar Java" ao conjunto
        tarefas.add("Comprar pão"); // Tentando adicionar uma duplicata
        tarefas.add("Lavar o carro");// Adiciona "Lavar o carro" ao conjunto
        tarefas.add("estudar java"); // Adiciona "estudar java" (diferente por causa do 'e' e 'j' minúsculo)
        System.out.println("Conjunto de tarefas: " + tarefas); // Saída: [Lavar o carro, Comprar pão, Estudar Java]
        // A ordem pode variar, mas 'Comprar pão' aparece apenas uma vez
        // Ex: [Lavar o carro, Comprar pão, Estudar Java]

        // 2. Verificar se uma tarefa já existe
        boolean temTarefa = tarefas.contains("Estudar Java"); // Verifica se "Estudar Java" está no conjunto
        System.out.println("\nA tarefa 'Estudar Java' está no conjunto? " + temTarefa); // Saída: true
        
        // 3. Remover uma tarefa
        System.out.println("\n--- Removendo uma tarefa ---"); // Mensagem inicial
        tarefas.remove("Lavar o carro"); // Remove "Lavar o carro" do conjunto
        System.out.println("Conjunto após remover 'Lavar o carro': " + tarefas); // Saída: [Comprar pão, Estudar Java]
    }
}
// Fim da classe ExemploHashSet