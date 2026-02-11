import java.util.Scanner;

public class exerciciorepeticaonumeropsitivo {

    public static void main(String[] args) {
        
        // Limpa a tela (opcional, pode ser removido se não funcionar)
        // System.out.println("\033[H\033[2J");
        // System.out.flush();

        Scanner sc = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Digite um número positivo (negativo para sair): ");
            numero = sc.nextInt();
            if (numero < 0) {
                break;
            }
            // Aqui pode-se fazer algo com o número, se desejar
        }
        System.out.println("Programa encerrado.");
        sc.close();
    }
    
}
