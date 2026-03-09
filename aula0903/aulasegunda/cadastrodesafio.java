package aulasegunda;
import java.util.Scanner;

public class cadastrodesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        int[] quantidades = new int[5];
        int qtd = 0;
        int opcao;

        do {
            System.out.println("\nSistema de Controle de Produtos");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (opcao) {
                case 1:
                    if (qtd < 5) {
                        System.out.print("Nome do produto: ");
                        String nome = scanner.nextLine();
                        System.out.print("Quantidade em estoque: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        if (quantidade >= 0) {
                            nomes[qtd] = nome;
                            quantidades[qtd] = quantidade;
                            qtd++;
                            System.out.println("Produto cadastrado com sucesso!");
                        } else {
                            System.out.println("Quantidade deve ser não negativa.");
                        }
                    } else {
                        System.out.println("Capacidade máxima atingida (5 produtos).");
                    }
                    break;
                case 2:
                    if (qtd == 0) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("Produtos cadastrados:");
                        for (int i = 0; i < qtd; i++) {
                            System.out.println((i + 1) + " - Nome: " + nomes[i] + ", Quantidade: " + quantidades[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nome do produto a pesquisar: ");
                    String nomePesquisa = scanner.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equals(nomePesquisa)) {
                            System.out.println("Produto encontrado:");
                            System.out.println("Nome: " + nomes[i] + ", Quantidade: " + quantidades[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Nome do produto a alterar: ");
                    String nomeAlterar = scanner.nextLine();
                    boolean alterado = false;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equals(nomeAlterar)) {
                            System.out.print("Novo nome: ");
                            String novoNome = scanner.nextLine();
                            System.out.print("Nova quantidade: ");
                            int novaQuantidade = scanner.nextInt();
                            scanner.nextLine(); // consume newline
                            if (novaQuantidade >= 0) {
                                nomes[i] = novoNome;
                                quantidades[i] = novaQuantidade;
                                System.out.println("Produto alterado com sucesso!");
                            } else {
                                System.out.println("Quantidade deve ser não negativa.");
                            }
                            alterado = true;
                            break;
                        }
                    }
                    if (!alterado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Nome do produto a remover: ");
                    String nomeRemover = scanner.nextLine();
                    boolean removido = false;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equals(nomeRemover)) {
                            // Shift elements to the left
                            for (int j = i; j < qtd - 1; j++) {
                                nomes[j] = nomes[j + 1];
                                quantidades[j] = quantidades[j + 1];
                            }
                            qtd--;
                            System.out.println("Produto removido com sucesso!");
                            removido = true;
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
