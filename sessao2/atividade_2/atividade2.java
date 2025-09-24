package sessao2.atividade_2;

import sessao2.atividade_1.Pessoa;

public class atividade2 {
    // Atributos e getters...
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();// Cria um novo objeto da classe Pessoa
        pessoa.setIdade(-5); // Tentando definir uma idade inválida

        if (pessoa.getIdade() <= 0) {
            System.out.println("Idade inválida.");// Verifica se a idade é inválida
        } else {
            System.out.println("Idade definida: " + pessoa.getIdade());// Exibe a idade definida 
        }
    }
}