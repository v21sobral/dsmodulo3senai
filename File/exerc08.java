import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class exerc08 {
    public static void main(String[] args) {
        String caminho = "arquivo.txt";

        try {
            File arquivo = new File(caminho);
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
            writer.write("Conteudo atualizado");
            writer.write("Este texto substitui o anterior");
            writer.close();
            System.out.println("Arquivo atualizado com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao atualizar o arquivo." + e.getMessage());
            
        }
    }
}
