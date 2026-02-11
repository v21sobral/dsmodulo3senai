import java.util.Scanner;

public class Repeticao3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String resp="sim";

        while (resp.equalsIgnoreCase("sim")) {
            System.out.println("deseja continuar? Sim ou não");
            resp=sc.nextLine();

            
        }
        System.out.println("programa encerrado");

        sc.close();
    }
    
}
