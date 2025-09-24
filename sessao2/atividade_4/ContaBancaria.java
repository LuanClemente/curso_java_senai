package sessao2.atividade_4;

// Classe que representa uma conta bancária
public class ContaBancaria {
    // Atributo privado que armazena o saldo da conta
    private double saldo;

    // Método para depositar um valor na conta
    // Recebe o valor a ser depositado e soma ao saldo atual
    public void depositar(double valor) {
        // Verifica se o valor é positivo antes de depositar
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // Método para consultar o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }
}
