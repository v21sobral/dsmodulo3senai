
public class CamisaApp {
    public static void main(String[] args) {
        Camisa camisa1 = new Camisa("Ciano", "G", "Social");
        Camisa camisa2 = new Camisa("Branca", "M", "Terno");

        System.out.println("Camisa 1:");
        System.out.println("Cor: " + camisa1.getCor());
        System.out.println("Tamanho: " + camisa1.getTamanho());
        System.out.println("Tipo: " + camisa1.getTipo());

        System.out.println("\nCamisa 2:");
        System.out.println("Cor: " + camisa2.getCor());
        System.out.println("Tamanho: " + camisa2.getTamanho());
        System.out.println("Tipo: " + camisa2.getTipo());
    }
    
}
