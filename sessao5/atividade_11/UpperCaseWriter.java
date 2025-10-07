package sessao5.atividade_11;

import java.io.FilterWriter; // Importa a classe FilterWriter
import java.io.Writer; // Importa a classe Writer 
import java.io.IOException; // Importa a classe IOException


/**
 * UpperCaseWriter é um FilterWriter que converte todos os caracteres de uma String
 * para maiúsculas antes de passá-los para o Writer subjacente (o 'out' protegido).
 * * Isso demonstra o Padrão Decorator, onde adicionamos uma funcionalidade
 * a um stream existente.
 */
public class UpperCaseWriter extends FilterWriter { // Extende FilterWriter


    /**
     * Construtor.
     * @param out O Writer subjacente que receberá os dados processados.
     */
    public UpperCaseWriter(Writer out) { // Construtor que recebe um Writer 
        super(out); // Chama o construtor da superclasse FilterWriter
    }


    /**
     * Sobrescreve o método write(String) para converter a string para maiúsculas
     * antes de escrever.
     * @param str A string a ser escrita.
     * @throws IOException Se ocorrer um erro de I/O na escrita.
     */
    @Override
    public void write(String str) throws IOException { // Sobrescreve o método write(String) 
        // Converte a string para maiúsculas
        String upperCaseStr = str.toUpperCase();
       
        // Chama o método write do Writer subjacente (this.out)
        super.write(upperCaseStr, 0, upperCaseStr.length());
    }


    // Nota: O método write(int c) também deveria ser sobrescrito para
    // ser completo, mas focamos em write(String) conforme o desafio.
}
