import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escoha o animal (1 - Cachorro, 2 - Gato): ");
        int escolha = sc.nextInt();
        
        Animal animal;
        switch (escolha) {
            case 1:
                animal = new Cachorro();
                break;
            case 2:
                animal = new Gato();
                break;
            default:
                System.out.println("Opção inválida. Criando um animal genérico.");
                animal = new Animal();
                break;
        }
        
        animal.emitirSom();

        sc.close();
}
