package aula3003.ArrayList;

import java.util.ArrayList;

public class exerc01 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Victor");
        nomes.add("Ferdinanda");
        nomes.add("Sarita");
        nomes.add("Enzo");

        for(int i=0; i<nomes.size(); i++){
            System.err.println((1+i)+ "- "+nomes.get(i));
        }
        nomes.set(2, "Maria");
        System.out.println(nomes);
        nomes.remove(0);
        System.out.println(nomes);
        for(String nome: nomes){
            System.out.println(nome);
        }
    }
    
}
