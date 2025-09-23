package sessao2;

//1 Criando a classe pessoa
public class Pessoa {
//Criando os atributos
    private String nome;
    private int idade;

    //Criando construtores
    
//Construtor com parametros

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
    }
    // Parte 3 Criando os getters e setters
    //Setters (Que atribui dados)

    public void setNome(String nome) {
        this.nome = nome;
    }
    //Criando os Getters (Acessa os atributos)

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
        public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        
        }
        else {
        System.out.println("Erro: A idade não pode ser um valor negativo.");
        }
    }
}