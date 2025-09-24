package sessao2.atividade_1;

//1 Criando a classe pessoa
public class Pessoa {
//Criando os atributos
    private String nome;//Atributo nome
    private int idade; //Atributo idade

//Criando construtores  
//Construtor com parametros

    public Pessoa(String nome, int idade) { //Dando parametros ao construtor
        this.nome = nome; //Atribuindo o valor do parametro ao atributo nome
        this.idade = idade; //atribuindo o valor do parametro ao atributo idade
    }

    public Pessoa() { //Construtor sem parametros
        this.nome = ""; //Atributo nome recebe valor vazio
        this.idade = 0; //Atributo idade recebe valor 0
    }
    // Parte 3 Criando os getters e setters
    //Setters (Que atribui dados)

    public void setNome(String nome) { //Metodo que atribui valor ao atributo nome
        this.nome = nome; //Atribuindo o valor do parametro ao atributo nome
    }
    //Criando os Getters (Acessa os atributos)

    public String getNome() { //Metodo que retorna o valor do atributo nome
        return nome; //Retorna o valor do atributo nome
    }

    public int getIdade() { //Metodo que retorna o valor do atributo idade
        return idade; //Retorna o valor do atributo idade
    }
        public void setIdade(int idade) { //Metodo que atribui valor ao atributo idade
        if (idade >= 0) { //Verifica se a idade é maior ou igual a 0
            this.idade = idade; //Atribuindo o valor do parametro ao atributo idade
        
        }
        else { //Se a idade for negativa
        System.out.println("Erro: A idade não pode ser um valor negativo ou igual a 0."); //exibe no terminal mensagem de erro
        }
    } 
}
