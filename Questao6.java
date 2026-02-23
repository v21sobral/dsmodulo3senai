import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Calcular Tabuada");
            System.out.println("2 - Realizar Contagem Regressiva");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Tente novamente.");
                sc.next();
                continue;
            }

            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Informe o número para a tabuada: ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Entrada inválida.");
                        sc.next();
                        break;
                    }
                    int n = sc.nextInt();
                    System.out.println("Tabuada do " + n + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(n + " x " + i + " = " + (n * i));
                    }
                    break;

                case 2:
                    System.out.print("Informe o número inicial para a contagem regressiva (>=0): ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Entrada inválida.");
                        sc.next();
                        break;
                    }
                    int inicio = sc.nextInt();
                    if (inicio < 0) {
                        System.out.println("O número deve ser >= 0.");
                        break;
                    }
                    System.out.println("Contagem regressiva:");
                    for (int i = inicio; i >= 0; i--) {
                        System.out.println(i);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
