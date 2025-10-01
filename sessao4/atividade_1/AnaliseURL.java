package sessao4.atividade_1;

public class AnaliseURL {
    public static void main(String[] args) {
        String url = "https://www.oracle.com/java/documentation";
        
        System.out.println("URL em analise: " + url);
        System.out.println("----------------------------------------");

        // 1. Verificar o protocolo (http ou https)
        boolean usaHttp = url.startsWith("http://");
        boolean usaHttps = url.startsWith("https://");
        
        System.out.println("Usa HTTPS? " + usaHttps);
        System.out.println("Usa HTTP?  " + usaHttp);

        // 2. Verificar se contem o indicador de dominio (.com)
        boolean isComercial = url.contains(".com");
        System.out.println("Contem .com? " + isComercial);

        // 3. Extrair o dominio
        
        // Passo a: Encontrar o Indice onde o dominio comeca (apos "//").
        int inicioProtocolo = url.indexOf("://");
        // O dominio comeca dois caracteres apos "://"
        int inicioDominio = inicioProtocolo + 3; 

        // Passo b: Encontrar o indice onde o dominio termina (na proxima "/").
        // Procuramos o '/' a partir do indice onde o dominio comeca.
        int fimDominio = url.indexOf("/", inicioDominio); 
        
        // Se nao encontrar '/', significa que a URL termina no dominio (ex: "https://google.com").
        if (fimDominio == -1) {
            fimDominio = url.length();
        }

        // Passo c: Usar substring() para extrair o dominio.
        String dominio = url.substring(inicioDominio, fimDominio);
        
        System.out.println("----------------------------------------");
        System.out.println("DomÃ­nio Extraido: " + dominio);
    }
}
