package sessao2;

import sessao2.ContaBancaria.Depositar;

public class mainContaBancaria {
    public static void main(String[] args) {
        //Declarando um objeto do tipo pessoa
        ContaBancaria.Saldo = new Depositar();
        
        ContaBancaria.setDepositar(1000.00);

        //Printando no terminal
    System.out.println("Saldo Depositado na Conta: " + saldo.getSaldo());
    }
}
