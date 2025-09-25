package sessao2.atividade_10;

import java.util.ArrayList; // Importação da classe ArrayList
import java.util.List; // Importação da interface List

public class Main { // Classe principal
    public static void main(String[] args) { // Método principal
        List<Forma> formas = new ArrayList<>(); // Lista para armazenar formas
        // Adiciona um círculo e um retângulo à lista de formas
        formas.add(new Circulo(5.0)); // Adiciona um círculo com raio 5.0
        formas.add(new Retangulo(4.0, 6.0)); // Adiciona um retângulo com largura 4.0 e altura 6.0
// Itera sobre a lista de formas e imprime a área e o perímetro de cada uma
        for (Forma forma : formas) {  // Loop para cada forma na lista
            System.out.println("--------------------"); 
            System.out.println("Área: " + forma.getArea()); // Imprime a área da forma
            System.out.println("Perímetro: " + forma.getPerimetro()); // Imprime o perímetro da forma
        }
    }
}
// fim da classe