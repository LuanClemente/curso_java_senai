package sessao4.atividade_1;

public class AnaliseURL { // Classe para analisar componentes basicos de uma URL
    public static void main(String[] args) { // Metodo principal
        String url = "https://www.oracle.com/java/documentation";  // Url a ser analisado
        
        System.out.println("URL em analise: " + url); // Exibe a URL
        System.out.println("----------------------------------------"); // Linha divisoria

        // 1. Verificar o protocolo (http ou https)
        boolean usaHttp = url.startsWith("http://"); // Verifica se a URL comeca com "http://" voltando um valor booleano (Verdadeiro ou Falso)
        boolean usaHttps = url.startsWith("https://"); // Verifica se a URL comeca com "https://" voltando um valor booleano (Verdadeiro ou Falso)
        
        System.out.println("Usa HTTPS? " + usaHttps); // Exibe se a URL usa HTTPS (True ou False por ser boolean)
        System.out.println("Usa HTTP?  " + usaHttp); // Exibe se a URL usa HTTP (True ou False por ser boolean)

        // 2. Verificar se contem o indicador de dominio (.com)
        boolean isComercial = url.contains(".com"); // Verifica se a URL contem ".com" voltando um valor booleano (Verdadeiro ou Falso)
        System.out.println("Contem .com? " + isComercial); // Exibe se a URL contem ".com" (True ou False por ser boolean)

        // 3. Extrair o dominio
        
        // Passo a: Encontrar o Indice onde o dominio comeca (apos "//").
        int inicioProtocolo = url.indexOf("://"); // Encontra o indice de "://" na URL indexof retorna a posicao do primeiro caractere da substring encontrada
        // O dominio comeca dois caracteres apos "://"
        int inicioDominio = inicioProtocolo + 3; // Adiciona 3 para pular "://" que são tres caracteres

        // Passo b: Encontrar o indice onde o dominio termina (na proxima "/").
        // Procuramos o '/' a partir do indice onde o dominio comeca.
        int fimDominio = url.indexOf("/", inicioDominio); // Encontra o indice do primeiro '/' apos o inicio do dominio
        
        // Se nao encontrar '/', significa que a URL termina no dominio (ex: "https://google.com").
        if (fimDominio == -1) { // Se nao encontrar '/', indexOf retorna -1
            fimDominio = url.length(); // Define o fim do dominio como o comprimento total da URL
        }

        // Passo c: Usar substring() para extrair o dominio.
        String dominio = url.substring(inicioDominio, fimDominio); // Extrai o dominio usando substring do inicio ao fim do dominio
        
        System.out.println("----------------------------------------"); // Linha divisoria
        System.out.println("DomÃ­nio Extraido: " + dominio); // Exibe o dominio extraido
    }
} // Fim da classe AnaliseURL
