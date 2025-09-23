//Temos que criar

public class atividade6 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Luan";
        String str3 = "You are " + str2;
    //acima segue as estrings declaradas

    //abaixo segue comando para printar as estrings no terminal
        System.out.println(str1 + "\n");
        System.out.println(str2 + "\n");

//abaixo da as boas vindas
System.out.println("Welcome: " + str3);

//abaixo diz quantas letras tem a string str1
System.out.println("Length: "+ str1.length());

//Display a substring of str1 beginning with character 0,
System.out.println("Sub: "+ str3.substring(0,5));

//display a string value in uppercase
System.out.println("Upper: "+str2.toUpperCase());
    }//end method main
}//end class StringOperations
