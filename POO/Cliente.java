public class Cliente {

    private int codigo;
    private String nome;
    private String endereco;

    public Cliente(int codigo, String nome, String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void exibirDados() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
    }
    
}
