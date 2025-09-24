package atividade_4;
/* *
*Aqui nosso objetivo e criar diferentes variaveis de diferentes valores e classes
*depois somar, subitrair, multiplicar e dividir seus valores, depois printa-los 
*no console.
*/

public class atividade4 {
    public static void main(String[] args) {
        int int1 = 10;
        int int2 = 20;
        double double1 = 110;
        double double2 = -100;
    //Acima temos as variais e seus respectivos valores

    //abaixo segue as contas com apenas valores inteiros
    System.out.println("Contas com INT \n");

    //Abaixo printamos no terminal os calculos
    System.out.println(int1 + int2 + "\n");
    System.out.println(int1 - int2 + "\n");
    System.out.println(int1 * int2 + "\n");
    System.out.println(int2 / int1 + "\n");

    //abaixo temos contas com valores apenas em DOUBLE
    System.out.println("Contas com Double \n");

    //Abaixo printamos no terminal os calculos
    System.out.println(double1 + double2 + "\n");
    System.out.println(double1 - double2 + "\n");
    System.out.println(double1 * double2 + "\n");
    System.out.println(double1 / double2 + "\n");

    //abaixo temos contas com valores misturados, entre valores inteiros e em DOUBLE
    System.out.println("Contas com INT e Double \n");

    //Abaixo printamos no terminal os calculos
    System.out.println(int1 + double1 + "\n");
    System.out.println(int2 - double2 + "\n");
    System.out.println(int1 * double1 + "\n");
    System.out.println(int2 / double2 + "\n");
    }
}