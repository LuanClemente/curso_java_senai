package sessao2.atividade_4;

public class mainContaBancaria {
    public static void main(String[] args) {
        // Cria um novo objeto da classe ContaBancaria
        // Este objeto representa uma conta bancária com saldo inicial zero
        ContaBancaria conta = new ContaBancaria();

        // Realiza um depósito de R$1000,00 na conta
        // O método depositar soma o valor ao saldo, se for positivo
        conta.depositar(1000.00);

        // Exibe o saldo atual da conta no terminal
        // O método getSaldo retorna o valor do saldo
        System.out.println("Saldo Depositado na Conta: " + conta.getSaldo());
    }
}
