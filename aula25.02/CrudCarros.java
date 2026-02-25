import java.util.Scanner;

public class CrudCarros {

    public static void main(String[] args) {

        String[] carros = new String[10];
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU DE CARROS =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    boolean cadastrado = false;
                    for (int i = 0; i < carros.length; i++) {
                        if (carros[i] == null) {
                            System.out.print("Digite o nome do carro: ");
                            carros[i] = sc.nextLine();
                            System.out.println("Carro cadastrado na posição " + i + ".");
                            cadastrado = true;
                            break;
                        }
                    }
                    if (!cadastrado) {
                        System.out.println("Array cheio! Não é possível cadastrar mais carros.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Lista de Carros ---");
                    boolean vazio = true;
                    for (int i = 0; i < carros.length; i++) {
                        if (carros[i] != null) {
                            System.out.println("[" + i + "] " + carros[i]);
                            vazio = false;
                        }
                    }
                    if (vazio) {
                        System.out.println("Nenhum carro cadastrado.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Lista de Carros ---");
                    for (int i = 0; i < carros.length; i++) {
                        if (carros[i] != null) {
                            System.out.println("[" + i + "] " + carros[i]);
                        }
                    }
                    System.out.print("Digite o índice do carro a alterar: ");
                    int indiceAlterar = sc.nextInt();
                    sc.nextLine();
                    if (indiceAlterar < 0 || indiceAlterar >= carros.length || carros[indiceAlterar] == null) {
                        System.out.println("Posição inválida ou vazia.");
                    } else {
                        System.out.print("Novo nome para o carro: ");
                        carros[indiceAlterar] = sc.nextLine();
                        System.out.println("Carro alterado com sucesso!");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Lista de Carros ---");
                    for (int i = 0; i < carros.length; i++) {
                        if (carros[i] != null) {
                            System.out.println("[" + i + "] " + carros[i]);
                        }
                    }
                    System.out.print("Digite o índice do carro a remover: ");
                    int indiceRemover = sc.nextInt();
                    sc.nextLine();
                    if (indiceRemover < 0 || indiceRemover >= carros.length || carros[indiceRemover] == null) {
                        System.out.println("Posição inválida ou vazia.");
                    } else {
                        System.out.println("Carro \"" + carros[indiceRemover] + "\" removido.");
                        carros[indiceRemover] = null;
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                   

                default:
                    System.out.println("Opção inválida!");
                
                 try {
                            Thread.sleep(3000); // 500 milissegundos entre cada ponto
                            
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    
            }

        } while (opcao != 0);

        sc.close();
    }
}