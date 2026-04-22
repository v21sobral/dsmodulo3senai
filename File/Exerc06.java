import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exerc06 {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("dados.txt", true));
            bw.write("\nTerceira linha");
            bw.write("\nQuarta linha");
            bw.close();
            System.out.println("Escrita concluida");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
