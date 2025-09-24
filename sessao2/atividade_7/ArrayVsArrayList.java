package sessao2.atividade_7;

import java.util.ArrayList; // Importa a classe ArrayList
import java.util.Arrays; // Importa a classe Arrays para facilitar a impressão do array

public class ArrayVsArrayList { //Craindo classe principal

    public static void main(String[] args) { //metodo principal

        //Criação de um Array de String com tamanho fixo
        String[] frutasArray = new String[3]; // Array com tamanho fixo de 3
        // Adicionando elementos ao Array
        frutasArray[0] = "Maçã";
        frutasArray[1] = "Banana";
        frutasArray[2] = "Laranja";

        System.out.println("--- Array (Tamanho Fixo) ---");
        System.out.println("Conteúdo: " + Arrays.toString(frutasArray)); // Imprime o conteúdo do array
        System.out.println("Tamanho: " + frutasArray.length); // Imprime o tamanho do array (propriedade length)

        // Tentativa de adicionar um quarto elemento ao Array (irá causar um erro)
        try { // Bloco try para capturar a exceção
            frutasArray[3] = "Uva"; // Isso causará um ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) { // Captura a exceção específica
            System.out.println("\nErro ao adicionar ao Array: " + e.getMessage()); // Imprime a mensagem de erro no terminal
            System.out.println("Comentário: O Array não pode adicionar um quarto elemento porque seu tamanho 3 é fixo e não pode ser expandido para 4 ou mais.");// Explicação erro no terminal
        } // Fim do bloco try e catch

        System.out.println("\n"); //Quebra de linha

        // Criação de um ArrayList de String com tamanho dinâmico
        ArrayList<String> frutasList = new ArrayList<>(); //arraylist frutasList
        // Adicionando elementos ao ArrayList
        // Como o Arraylist não tem um tamanho fixo, podemos adicionar elementos livremente
        frutasList.add("Maçã");
        frutasList.add("Banana");
        frutasList.add("Laranja");

        System.out.println("--- ArrayList (Tamanho Dinâmico) ---");
        System.out.println("Conteúdo: " + frutasList); // Imprime o conteúdo do ArrayList
        System.out.println("Tamanho: " + frutasList.size()); // Imprime o tamanho do ArrayList utilizando o método size

        // por ser um arraylist, podemos adicionar mais elementos
        frutasList.add("Uva");
        System.out.println("Conteúdo após adicionar 'Uva': " + frutasList);
        System.out.println("Tamanho após adicionar 'Uva': " + frutasList.size());

    }
}

/*
 * Metodos utilizados:
 * * Arrays.toString(array) - Converte o array em uma String legível para impressão.
 * * array.length - Propriedade que retorna o tamanho do array.
 * * arrayList.add(elemento) - Adiciona um elemento ao final do ArrayList
 * *  arrayList.size() - Retorna o número de elementos no ArrayList.
*/
