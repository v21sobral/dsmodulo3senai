import java.util.Scanner;

/**
 * Programa 4: Verificar maioridade
 * Entrada: idade da pessoa
 * Saída: indicação se é maior de idade ou não
 */
public class VerificaMaioridade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        
        // Processamento e saída
        if (idade >= 18) {
            System.out.println("A pessoa com " + idade + " anos é MAIOR DE IDADE");
        } else {
            System.out.println("A pessoa com " + idade + " anos é MENOR DE IDADE");
        }
        
        scanner.close();
    }
}
