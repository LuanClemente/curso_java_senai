package sessao4.atividade_3;

public class ConstrutorEmail { // Classe para construir uma lista de e-mails
    public static void main(String[] args) { // Metodo principal
        String[] destinatarios = {"ana@dominio.com", "beto@dominio.com", "carla@dominio.com", "daniel@dominio.com"}; // Array de destinatarios de e-mail
        
        System.out.println("Lista de Destinatarios:"); // Exibe a lista original
        
        // 1. Inicializa o StringBuilder (melhor performance para muitas modificacoes)
        StringBuilder listaEmails = new StringBuilder(); // Cria um StringBuilder vazio
        
        // 2. Itera sobre o array e usa append()
        for (String email : destinatarios) { // Para cada email no array de destinatarios
            listaEmails.append(email); // Adiciona o email ao StringBuilder
            listaEmails.append(";"); // Adiciona o delimitador ';' apos cada email
        } // Fim do loop
        
        System.out.println("String construida (com delimitador extra): " + listaEmails.toString()); // Exibe a string com o delimitador extra

        // 3. Remove o ultimo caractere (o ';' extra)
        // O indice do ultimo caractere eh o length() - 1
        if (listaEmails.length() > 0) { // Verifica se o StringBuilder nao esta vazio
            int ultimoIndice = listaEmails.length() - 1; // Calcula o indice do ultimo caractere
            listaEmails.deleteCharAt(ultimoIndice); // Remove o ultimo caractere
        } // Fim da condicao
        
        System.out.println("----------------------------------------"); // Linha divisoria
        
        // 4. Imprime o resultado final (convertendo para String)
        String mensagemFinal = listaEmails.toString(); // Converte o StringBuilder para String
        System.out.println("Lista de E-mails Final: " + mensagemFinal); // Exibe a lista final de e-mails
    }
}// Fim da classe ConstrutorEmail

