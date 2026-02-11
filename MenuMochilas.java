import java.util.Scanner;

public class MenuMochilas {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler entradas do usuário
        Scanner sc = new Scanner(System.in);
        
        // Variável para armazenar a opção escolhida
        int opcao = 0;
        
        // Loop que continua enquanto o usuário não escolher sair
        while (opcao != 4) {
            // Exibe o menu
            System.out.println("\n=== MENU DE MOCHILAS ===");
            System.out.println("1. Mochila Escolar");
            System.out.println("2. Mochila de Viagem");
            System.out.println("3. Mochila Esportiva");
            System.out.println("4. Sair");
            System.out.print("\nEscolha uma opção: ");
            
            // Lê a opção escolhida pelo usuário
            opcao = sc.nextInt();
            
            // Verifica a opção e exibe a descrição correspondente
            switch (opcao) {
                case 1:
                    System.out.println("\n--- Mochila Escolar ---");
                    System.out.println("Compacta e ideal para estudantes");
                    System.out.println("Características: Tamanho médio, vários compartimentos");
                    System.out.println("Capacidade: 20-30 litros");
                    System.out.println("Uso: Transporte de livros e material escolar");
                    break;
                    
                case 2:
                    System.out.println("\n--- Mochila de Viagem ---");
                    System.out.println("Espaçosa, ideal para longas jornadas");
                    System.out.println("Características: Grande capacidade, compartimentos especiais");
                    System.out.println("Capacidade: 50-70 litros");
                    System.out.println("Uso: Viagens, camping, longas expedições");
                    break;
                    
                case 3:
                    System.out.println("\n--- Mochila Esportiva ---");
                    System.out.println("Leve, resistente e ergonômica");
                    System.out.println("Características: Distribuição de peso, respirável");
                    System.out.println("Capacidade: 15-25 litros");
                    System.out.println("Uso: Academia, trilhas, atividades físicas");
                    break;
                    
                case 4:
                    System.out.println("\nPrograma encerrado. Até logo!");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
            }
        }
        
        // Fecha o Scanner
        sc.close();
    }
}
