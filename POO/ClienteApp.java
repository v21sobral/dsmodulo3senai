public class ClienteApp {
    public static void main(String[] args) {
        ClientePf clientePf = new ClientePf(1, "João", "Rua A, 123", "123.456.789-00");
        ClientePj clientePj = new ClientePj(2, "Empresa XYZ", "Avenida B, 456", "12.345.678/0001-00");

        System.out.println("Dados do Cliente Pessoa Física:");
        clientePf.exibirDados();

        System.out.println("\nDados do Cliente Pessoa Jurídica:");
        clientePj.exibirDados();
    }
}
