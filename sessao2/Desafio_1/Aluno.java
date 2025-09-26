package sessao2.Desafio_1;

public class Aluno {
    private String nome; // Nome do aluno
    private double nota; // Nota do aluno

    public Aluno(String nome, double nota) { // Construtor para inicializar nome e nota
        this.nome = nome; // Atribuição do valor do nome
        this.nota = nota; // Atribuição do valor da nota
    }
    public String getNome() { // Método para obter o nome do aluno
        return nome; // Retorna o nome do aluno
    }
    public double getNota() { // Método para obter a nota do aluno
        return nota; // Retorna a nota do aluno
    }
    public void setNome(String nome) { // Método para definir o nome do aluno
        this.nome = nome; // Atribuição do valor do nome
    }
    public void setNota(double nota) { // Método para definir a nota do aluno
        this.nota = nota; // Atribuição do valor da nota
        if (nota < 0.0 || nota > 10.0) { // Verifica se a nota está fora do intervalo válido
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10."); // Lança uma exceção se a nota for inválida
        }
    }

    public String getStatus() { // Método para obter o status do aluno
        if (nota >= 7.0) {
            return "Aprovado"; // Retorna "Aprovado" se a nota for 7.0 ou superior
        } else if (nota >= 5.0) {
            return "Recuperação"; // Retorna "Recuperação" se a nota for entre 5.0 e 6.9
        } else {
            return "Reprovado"; // Retorna "Reprovado" se a nota for inferior a 5.0
        }
    }
} // fim da classe
