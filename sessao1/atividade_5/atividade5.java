package atividade_5;
/**
 * aqui temos que criar duas variaveis e utilizando elas printar no terminal tres
 * retornos diferentes, que façam aparecer no terminal que o aluno foi aprovado 
 * e tem atestado, que o aluno foi aprovado ou tem atestado e  o aluno foi reprovado
 */

public class atividade5 {
    public static void main(String[] args) {
        boolean estudanteAprovado = true;
        boolean temAtestado = false;
        //acima temos as variaveis e seus valores

        //abaixo temos as funcoes de printar no terminal a parte do aluno aprovado e nao tem atestado
        if (estudanteAprovado && !temAtestado) {
            System.out.println("O aluno foi aprovado E não tem atestado.");
            }    else if (estudanteAprovado || temAtestado) {
                System.out.println("O aluno foi aprovado OU tem atestado.");
                }    else {
                    System.out.println("O aluno foi reprovado.");
            }

            //abaixo temos as funcoes de printar no terminal a parte que o aluno foi aprovado mas tem atestado
            temAtestado = true;
        if (estudanteAprovado && !temAtestado) {
            System.out.println("O aluno foi aprovado E não tem atestado.");
            }    else if (estudanteAprovado || temAtestado) {
                System.out.println("O aluno foi aprovado OU tem atestado.");
                }    else {
                    System.out.println("O aluno foi reprovado.");
            }
            //abaixo temos as funcoes de printar no terminal a parte de o aluno foi reprovado
            if (estudanteAprovado = false);
            System.out.println("O aluno foi reprovado.");
            }
        }
