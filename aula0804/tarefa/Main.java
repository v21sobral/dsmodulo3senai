package tarefa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();
        int opcao;

        System.out.println("===========================================");
        System.out.println("   Bem-vindo ao Sistema de Sons de Animais");
        System.out.println("===========================================");
        System.out.println("Animais com sons pré-cadastrados:");
        System.out.println("  Cachorro | Gato | Vaca | Pato | Leão");
        System.out.println("===========================================\n");

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = lerInteiro(scanner);

            switch (opcao) {
                case 1:
                    adicionarAnimal(scanner, animais);
                    break;
                case 2:
                    emitirSomAnimal(scanner, animais);
                    break;
                case 3:
                    System.out.println("\nEncerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente novamente.\n");
            }

        } while (opcao != 3);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("----------- MENU -----------");
        System.out.println("1 - Adicionar novo animal");
        System.out.println("2 - Fazer um animal emitir som");
        System.out.println("3 - Sair");
        System.out.println("----------------------------");
    }

    private static void adicionarAnimal(Scanner scanner, List<Animal> animais) {
        System.out.print("\nDigite o tipo do animal (ex: Cachorro, Gato): ");
        String tipo = scanner.nextLine().trim();

        if (tipo.isEmpty()) {
            System.out.println("Nome inválido! O animal não foi adicionado.\n");
            return;
        }

        AnimalPersonalizado novoAnimal = new AnimalPersonalizado(tipo);
        animais.add(novoAnimal);

        if (novoAnimal.temSom()) {
            System.out.println("Animal \"" + tipo + "\" adicionado com sucesso! Som encontrado.\n");
        } else {
            System.out.println("Animal \"" + tipo + "\" adicionado, mas sem som cadastrado.\n");
        }
    }

    private static void emitirSomAnimal(Scanner scanner, List<Animal> animais) {
        if (animais.isEmpty()) {
            System.out.println("\nNenhum animal cadastrado ainda. Adicione um primeiro!\n");
            return;
        }

        System.out.println("\n--- Animais Cadastrados ---");
        for (int i = 0; i < animais.size(); i++) {
            System.out.println((i + 1) + " - " + animais.get(i).getNome());
        }

        System.out.print("Escolha o número do animal: ");
        int escolha = lerInteiro(scanner);

        if (escolha < 1 || escolha > animais.size()) {
            System.out.println("Opção inválida!\n");
            return;
        }

        System.out.println();
        animais.get(escolha - 1).fazerSom();
        System.out.println();
    }

    private static int lerInteiro(Scanner scanner) {
        while (true) {
            try {
                int valor = Integer.parseInt(scanner.nextLine().trim());
                return valor;
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número: ");
            }
        }
    }
}