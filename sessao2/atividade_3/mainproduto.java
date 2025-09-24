package sessao2.atividade_3;
//Criando main
public class mainproduto {
    //Metodo principal que será executado no inicio da classe
    public static void main(String[] args) {
        //Declarando um objeto do tipo pessoa
        Produto produto = new Produto();
        
        Produto produto1;
        produto1 = new Produto("TV Oled", 50, 2500.00);
            produto.setNome("PC Gamer");
            produto.setpreco(4000.00);
            produto.setquantidadeEmEstoque(20);

        //Printando no terminal
    System.out.println("Nome do Produto: " + produto.getNome());
    System.out.println("Preço do produto: " + produto.getpreco());
    System.out.println("Quantidade em Estoque: " + produto.getquantidadeEmEstoque());
    
    System.out.println("\n");//Quebra de linha

    System.out.println("Nome do Produto: " + produto1.getNome());
    System.out.println("Preço do Produto: " + produto1.getpreco());
    System.out.println("Quantidade em Estoque:" + produto1.getquantidadeEmEstoque());
    }
}