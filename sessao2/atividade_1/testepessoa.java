package sessao2.atividade_1;

public class testepessoa {
    //metodo principal que será executado no inicio da classe
    public static void main(String[] args) {
        //Declarando um objeto do tipo pessoa
        Pessoa pessoa = new Pessoa();

        Pessoa p;
        p= new Pessoa("Carlos", 50);
        pessoa.setNome("João");
        pessoa.setIdade(30);
        
    //Printando na tela
    
    System.out.println("Nome: " + pessoa.getNome());
    System.out.println("Idade: " + pessoa.getIdade());
    
    System.out.println("Nome: " + p.getNome());
    System.out.println("Idade: " + p.getIdade());
    }
}
