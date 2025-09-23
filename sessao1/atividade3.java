//Aqui nosso objetivo e converter as classes, como de INT para SHORT e etc.

public class atividade3 {
    public static void main(String[] args) {
        int meuInt = 150;
        short meuShort = (short) meuInt; //aqui convertemos a variavel meuInt de INT para SHORT

        double meuDouble = 9.78;
        int outroInt = (int) meuDouble; //aqui convertemos a variavel meuDouble de DOUBLE para INT

        float meuFloat = 12.34f;
        int maisumInt = (int) meuFloat; //aqui convertemos a variavel meuFloat de FLOAT para INT
//acima temos nossas variaveis, cada uma seguida de sua conversao

//abaixo temos o sistema de printar tudo na tela, ja com os valores convertidos
    System.out.println(meuShort + "\n" + outroInt + "\n" + maisumInt);
    }
}
