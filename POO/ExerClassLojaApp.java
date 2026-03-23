import java.util.Scanner;

public class ExerClassLojaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o preco do produto: ");
        double preco = scanner.nextDouble();
        
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        ExerClassLoja produto1 = new ExerClassLoja(nome, preco, quantidade);

        System.out.println("\nNome do produto: " + produto1.getNome());
        System.out.println("Preco do produto: " + produto1.getPreco());
        System.out.println("Quantidade do produto: " + produto1.getQuantidade());

        System.out.println("\nAtualizando dados do produto...");
        
        System.out.print("Digite o novo nome do produto: ");
        String novoNome = scanner.nextLine();
        produto1.setNome(novoNome);
        
        System.out.print("Digite o novo preco do produto: ");
        double novoPreco = scanner.nextDouble();
        produto1.setPreco(novoPreco);
        
        System.out.print("Digite a nova quantidade do produto: ");
        int novaQuantidade = scanner.nextInt();
        produto1.setQuantidade(novaQuantidade);

        System.out.println("\nNome atualizado: " + produto1.getNome());
        System.out.println("Preco atualizado: " + produto1.getPreco());
        System.out.println("Quantidade atualizada: " + produto1.getQuantidade());

        scanner.close();
    }
}