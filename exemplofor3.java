import java.util.Scanner;

public class exemplofor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <=5; i++) {
            
                
            System.out.println("Informe o "+i+"º número: ");
            int numero = sc.nextInt();

            System.out.println("O número informado foi: "+numero);
      
        }

        sc.close();

    }
    
}
