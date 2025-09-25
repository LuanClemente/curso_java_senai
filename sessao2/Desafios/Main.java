package sessao2.Desafios;

public class Main { // Classe Main
    public static void main(String[] args) {  // Método principal
        Aluno aluno = new Aluno("João", -1.0); // Cria um objeto Aluno com nome "João" e nota -1.0 (inválida mas roda por causa da exceção)
    
        System.out.println("Nome: " + aluno.getNome()); // Imprime o nome do aluno
        System.out.println("Nota: " + aluno.getNota());// Imprime a nota do aluno
        System.out.println("Status: " + aluno.getStatus());// Imprime o status do aluno
    }
}   // fim da classe
