
public class CamisaApp {
    public static void main(String[] args) {
        Camisa camisa1 = new Camisa("Vermelha", "M", 49.99);
        Camisa camisa2 = new Camisa("Azul", "G", 59.99);

        System.out.println("Camisa 1:");
        System.out.println("Cor: " + camisa1.getCor());
        System.out.println("Tamanho: " + camisa1.getTamanho());
        System.out.println("Preço: R$ " + camisa1.getPreco());

        System.out.println("\nCamisa 2:");
        System.out.println("Cor: " + camisa2.getCor());
        System.out.println("Tamanho: " + camisa2.getTamanho());
        System.out.println("Preço: R$ " + camisa2.getPreco());
    }
}
