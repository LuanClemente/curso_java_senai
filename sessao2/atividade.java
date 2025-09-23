package sessao2;

//1 Criando a classe pessoa
public class atividade {
//Criando os atributos
        private int idade;

    //Criando construtores
    
//Construtor com parametros

    public atividade(int idade) {
        this.idade = idade;
    }

    public atividade() {
        this.idade = 0;
    }
    // Parte 3 Criando os getters e setters
    //Setters (Que atribui dados)

    public void setIdade(int idade) {
        this.idade = idade;
    }
    //Criando os Getters (Acessa os atributos)
    public int getIdade() {
        return idade;
    }
}