package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for(int i=0; i<3; i++){
            System.out.println("Digite um nome: ");
            String nome = sc.nextLine();
            nomes.add(nome);
        }

        
        //Listando
        for(int i=0; i<nomes.size(); i++){
            System.out.println((1+i)+ "- "+nomes.get(i));
        }

        //Alterar
        int Alterar;
        do{
            System.out.println("Digite a posição do nome que deseja alterar: ");
            Alterar = sc.nextInt();
            if(Alterar < 0 || Alterar >= nomes.size()){
                System.out.println("Posição inválida. Tente novamente.");
            }

        } while(Alterar < 0 || Alterar >= nomes.size());
        sc.nextLine(); // Limpar o buffer
        System.out.println("Digite o novo nome: ");
        String novoNome = sc.nextLine();
        nomes.set(Alterar, novoNome);

        sc.close();
    }
    
}
