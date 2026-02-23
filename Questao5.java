import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        if (!sc.hasNextInt()) {
            System.out.println("Entrada inválida.");
            sc.close();
            return;
        }
        int n = sc.nextInt();
        System.out.println("Tabuada do " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        sc.close();
    }
}
