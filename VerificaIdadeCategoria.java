import java.util.Scanner;

/**
 * Programa 3: Classificar a idade de uma pessoa
 * Entrada: idade da pessoa
 * Saída: categoria etária (Criança, Adolescente, Adulto ou Idoso)
 */
public class VerificaIdadeCategoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        
        // Processamento e saída
        if (idade >= 0 && idade <= 12) {
            System.out.println("A pessoa com " + idade + " anos é CRIANÇA");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("A pessoa com " + idade + " anos é ADOLESCENTE");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("A pessoa com " + idade + " anos é ADULTO");
        } else if (idade >= 60) {
            System.out.println("A pessoa com " + idade + " anos é IDOSO");
        } else {
            System.out.println("Idade inválida!");
        }
        
        scanner.close();
    }
}
