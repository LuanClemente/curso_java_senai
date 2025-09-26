package sessao3.atividade_3;

import java.util.HashMap; // Importa a classe HashMap
import java.util.Map; // Importa a interface Map

public class ExemploHashMap { // Início da classe
    public static void main(String[] args) { // Início do método main
        // Criamos um mapa onde a chave é um Integer e o valor é uma String
        Map<Integer, String> alunos = new HashMap<>(); // Cria um HashMap vazio

        // 1. Adicionar alunos (pares de matrícula-nome)
        System.out.println("--- Cadastrando alunos ---"); // Mensagem inicial
        alunos.put(101, "João Silva"); // Adiciona um aluno com matrícula 101
        alunos.put(102, "Maria Oliveira"); // Adiciona um aluno com matrícula 102
        alunos.put(103, "Carlos Santos"); // Adiciona um aluno com matrícula 103
        System.out.println("Mapa de alunos: " + alunos); // Ex: {101=João Silva, 102=Maria Oliveira, 103=Carlos Santos}

        // 2. Encontrar o nome de um aluno pela sua matrícula (chave)
        System.out.println("\n--- Buscando um aluno ---"); // Mensagem inicial
        String nomeAluno = alunos.get(102); // Busca o nome do aluno com matrícula 102
        System.out.println("O nome do aluno com matrícula 102 é: " + nomeAluno); // Saída: Maria Oliveira

        // 3. Verificar se uma matrícula já existe
        boolean temMatricula = alunos.containsKey(101); // Verifica se a matrícula 101 existe
        System.out.println("A matrícula 101 existe? " + temMatricula); // Saída: true

        // 4. Remover um aluno pela sua matrícula
        System.out.println("\n--- Removendo um aluno ---"); // Mensagem inicial
        alunos.remove(103); // Remove o aluno com matrícula 103
        System.out.println("Mapa após remover o aluno 103: " + alunos); // Ex: {101=João Silva, 102=Maria Oliveira}
    }
}
// end method main