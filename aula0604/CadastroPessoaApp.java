import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoaApp {
    private static ArrayList<CadastroPessoa> pessoas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("3. Alterar");
            System.out.println("4. Remover");
            System.out.println("5. Pesquisar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir newline

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    alterar();
                    break;
                case 4:
                    remover();
                    break;
                case 5:
                    pesquisar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrar() {
        System.out.print("Tipo (1-Aluno, 2-Professor): ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();
            pessoas.add(new Aluno(nome, idade, matricula));
        } else if (tipo == 2) {
            System.out.print("Disciplina: ");
            String disciplina = scanner.nextLine();
            pessoas.add(new Professor(nome, idade, disciplina));
        } else {
            System.out.println("Tipo inválido!");
        }
    }

    private static void listar() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (int i = 0; i < pessoas.size(); i++) {
                CadastroPessoa p = pessoas.get(i);
                System.out.println("Índice: " + i);
                if (p instanceof Aluno) {
                    System.out.println("Tipo: Aluno");
                } else if (p instanceof Professor) {
                    System.out.println("Tipo: Professor");
                } else {
                    System.out.println("Tipo: Pessoa");
                }
                p.exibirDados();
                System.out.println("---");
            }
        }
    }

    private static void alterar() {
        System.out.print("Índice da pessoa a alterar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice >= 0 && indice < pessoas.size()) {
            CadastroPessoa p = pessoas.get(indice);
            System.out.print("Novo nome: ");
            String nome = scanner.nextLine();
            p.setNome(nome);

            System.out.print("Nova idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            p.setIdade(idade);

            if (p instanceof Aluno) {
                System.out.print("Nova matrícula: ");
                String matricula = scanner.nextLine();
                ((Aluno) p).setMatricula(matricula);
            } else if (p instanceof Professor) {
                System.out.print("Nova disciplina: ");
                String disciplina = scanner.nextLine();
                ((Professor) p).setDisciplina(disciplina);
            }
        } else {
            System.out.println("Índice inválido!");
        }
    }

    private static void remover() {
        System.out.print("Índice da pessoa a remover: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice >= 0 && indice < pessoas.size()) {
            pessoas.remove(indice);
            System.out.println("Pessoa removida.");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    private static void pesquisar() {
        System.out.print("Nome a pesquisar: ");
        String nome = scanner.nextLine();

        boolean encontrado = false;
        for (CadastroPessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                p.exibirDados();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Pessoa não encontrada.");
        }
    }
}
