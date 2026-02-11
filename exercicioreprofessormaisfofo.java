import java.util.Scanner;

public class exercicioreprofessormaisfofo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nome = "";

        while (!nome.equals("Anderson")) {
            System.out.print("Qual é o nome do professor mais fofo do SENAI? ");
            nome = sc.nextLine();
            
            if (!nome.equals("Anderson")) {
                System.out.println("Errado! Tente novamente.\n");
            }
        }
        
        System.out.println("Parabéns! Você acertou! Anderson é realmente o professor mais fofo!");
        sc.close();
    }
    
}
