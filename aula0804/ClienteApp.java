public class ClienteApp {
    public static void main(String[] args) {
        ClientePf pf = new ClientePf("123.456.789-00");
        pf.atualizarDados("João Silva", "Rua A, 123");
        System.out.println("Cliente PF:");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Endereço: " + pf.getEndereco());
        System.out.println("CPF: " + pf.getCpf());
        ClientePj pj = new ClientePj();
        pj.atualizarDados("Empresa XYZ", "Avenida B, 456", "12.345.678/0001-00", "Empresa XYZ LTDA");
        System.out.println("\nCliente PJ:");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Endereço: " + pj.getEndereco());    
        System.out.println("CNPJ: " + pj.getCnpj());
        System.out.println("Razão Social: " + pj.getRazaoSocial());
    }
}
