import java.util.Scanner;

/**
 * Programa 1: Verificar se um número é positivo, negativo ou nulo
 * Lê um número inteiro do teclado e indica sua classificação
 */
public class VerificaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        // Processamento e saída
        if (numero > 0) {
            System.out.println("O número " + numero + " é POSITIVO");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é NEGATIVO");
        } else {
            System.out.println("O número é NULO (zero)");
        }
        
        scanner.close();
    }
}
