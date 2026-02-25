import java.util.Scanner;

class ExercicioArrayList03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] nomes = new String[5];

        for(int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o "+i+"º nome: ");
            nomes[i] = sc.nextLine();

            System.out.println("O nome informado foi: "+nomes[i]);
        }

        for(String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();
    }
}
       
    
