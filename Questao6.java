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
                    System.out.print("Informe o número inicial para a contagem regressiva (maior igual a 0): ");
                    if (!sc.hasNextInt()) {
                        System.out.println("Entrada inválida.");
                        try {
                            // 1000 milissegundos = 1 segundo de pausa
                            Thread.sleep(3000); 
                        } catch (InterruptedException e) {
                            // Caso o sistema interrompa a pausa, ele limpa o erro
                            Thread.currentThread().interrupt();
                        }
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
                        try {
                            // Aguarda 1 segundo antes de imprimir o próximo número
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    break;

                case 0:
                    System.out.print("Saindo");
                    for (int i = 0; i < 3; i++) {
                        try {
                            Thread.sleep(500); // 500 milissegundos entre cada ponto
                            System.out.print(".");
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println(); // Pula uma linha após os pontos
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
