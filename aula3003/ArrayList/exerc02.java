package ArrayList;

import java.util.ArrayList;

public class exerc02 {
    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        for(int i=0; i<numeros.size(); i++){
            System.out.println((1+i)+ "- "+numeros.get(i));
        }   
        numeros.set(2, 35);
        System.out.println(numeros);
        numeros.remove(0);
        System.out.println(numeros);
        for(Integer numero: numeros){
            System.out.println(numero);
        }
    }
}
