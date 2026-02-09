import java.util.Scanner;

/**
 * Programa 7: Tabela de preços de CDs por cor
 * PROBLEMA: Loja de CDs que marca produtos por cores em vez de preços
 * ENTRADA: COR do CD (alfanumérica)
 * SAÍDA: PREÇO correspondente
 * 
 * Tabela de preços:
 * Vermelho: R$ 20,00
 * Azul: R$ 15,00
 * Verde: R$ 25,00
 * Amarelo: R$ 18,00
 */
public class PrecoCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite a cor do CD (Vermelho, Azul, Verde, Amarelo): ");
        String cor = scanner.nextLine().toLowerCase();
        
        // Variável para armazenar o preço
        double preco = 0;
        boolean corValida = true;
        
        // Processamento (busca o preço de acordo com a cor)
        if (cor.equals("vermelho")) {
            preco = 20.00;
        } else if (cor.equals("azul")) {
            preco = 15.00;
        } else if (cor.equals("verde")) {
            preco = 25.00;
        } else if (cor.equals("amarelo")) {
            preco = 18.00;
        } else {
            System.out.println("Cor inválida!");
            corValida = false;
        }
        
        // Saída
        if (corValida) {
            System.out.printf("CD de cor %s: R$ %.2f%n", cor, preco);
        }
        
        scanner.close();
    }
}
