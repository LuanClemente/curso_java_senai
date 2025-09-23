package sessao2;

public class atividade2 {
    // Atributos e getters...
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(-5); // Tentando definir uma idade inválida
        System.out.println("Idade definida: " + pessoa.getIdade()); // Deve imprimir 0 (ou o valor padrão)
    }
}
