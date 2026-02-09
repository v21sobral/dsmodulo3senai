import java.util.Scanner;

/**
 * Programa 2: Verificar se um número é par ou ímpar
 * Lê um número inteiro e identifica sua paridade
 */
public class VerificaParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        // Processamento e saída
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR");
        }
        
        scanner.close();
    }
}
