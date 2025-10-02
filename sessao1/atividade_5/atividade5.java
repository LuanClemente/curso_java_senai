package atividade_5;
/**
 * aqui temos que criar duas variaveis e utilizando elas printar no terminal tres
 * retornos diferentes, que façam aparecer no terminal que o aluno foi aprovado 
 * retornos diferentes, que façam aparecer no terminal que o aluno foi aprovado
 * e tem atestado, que o aluno foi aprovado ou tem atestado e  o aluno foi reprovado
 */

public class atividade5 {
    public static void main(String[] args) {
        boolean estudanteAprovado = true;
        boolean temAtestado = false;
        //acima temos as variaveis e seus valores
        System.out.println("--- Cenário 1: Aprovado e SEM atestado ---");
        testarCondicao(true, false);

        //abaixo temos as funcoes de printar no terminal a parte do aluno aprovado e nao tem atestado
        if (estudanteAprovado && !temAtestado) {
            System.out.println("O aluno foi aprovado E não tem atestado.");
            }    else if (estudanteAprovado || temAtestado) {
                System.out.println("O aluno foi aprovado OU tem atestado.");
                }    else {
                    System.out.println("O aluno foi reprovado.");
            }
        System.out.println("\n--- Cenário 2: Aprovado e COM atestado ---");
        testarCondicao(true, true);

            //abaixo temos as funcoes de printar no terminal a parte que o aluno foi aprovado mas tem atestado
            temAtestado = true;
        if (estudanteAprovado && !temAtestado) {
            System.out.println("O aluno foi aprovado E não tem atestado.");
            }    else if (estudanteAprovado || temAtestado) {
                System.out.println("O aluno foi aprovado OU tem atestado.");
                }    else {
                    System.out.println("O aluno foi reprovado.");
        System.out.println("\n--- Cenário 3: Reprovado e SEM atestado ---");
        testarCondicao(false, false);

        System.out.println("\n--- Cenário 4: Reprovado e COM atestado ---");
        testarCondicao(false, true);
    }

    /**
     * Este método verifica a situação do aluno e imprime a mensagem correspondente.
     * @param estudanteAprovado true se o aluno foi aprovado.
     * @param temAtestado true se o aluno possui atestado.
     */
    public static void testarCondicao(boolean estudanteAprovado, boolean temAtestado) {
        // A lógica if-else if-else garante que apenas uma mensagem será impressa.
        if (estudanteAprovado) {
            // Se o aluno está aprovado, verificamos se tem atestado ou não.
            if (temAtestado) {
                System.out.println("O aluno foi aprovado E tem atestado.");
            } else {
                System.out.println("O aluno foi aprovado E não tem atestado.");
            }
            //abaixo temos as funcoes de printar no terminal a parte de o aluno foi reprovado
            if (estudanteAprovado = false);
        } else { // Se não foi aprovado, é reprovado. O atestado não importa para a reprovação.
            System.out.println("O aluno foi reprovado.");
            }
        }
    }
}
