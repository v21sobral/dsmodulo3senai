import java.util.Scanner;

public class exemplofor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <=5; i++) {
            
                
            System.out.println("Informe o "+i+"º número: ");
            int numero = sc.nextInt();

            for (int j = 1; j <= numero; j++) {
                System.out.println(numero+"x"+j+"="+(numero*j));
            }

            
      
        }

        sc.close();

    }
    
}
