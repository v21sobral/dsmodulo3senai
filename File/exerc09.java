import java.io.File;


public class exerc09 {
    public static void main(String[] args) {
       
        String caminho = "arquivo.txt";

        File arquivo = new File(caminho);

        if(arquivo.exists()){
            if (arquivo.delete()){
                System.out.println("Arquivo deletado com sucesso.");
            } else {
                System.out.println("Não foi possível deletar o arquivo.");
            }
        }
    }
}
