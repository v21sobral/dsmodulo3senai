import java.util.Scanner;

/**
 * Programa 5: Controle de acesso a porta com senha
 * PROBLEMA: Controlar acesso a uma porta usando senha pré-configurada
 * ENTRADA: SENHA (alfanumérica)
 * SAÍDA: "PORTA ABERTA" ou "SENHA NAO CONFERE"
 */
public class ControladorSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variável para armazenar a senha pré-configurada
        String senhaCorreta = "1234";
        
        // Entrada de dados
        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();
        
        // Processamento e saída
        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("PORTA ABERTA");
        } else {
            System.out.println("SENHA NAO CONFERE");
        }
        
        scanner.close();
    }
}
