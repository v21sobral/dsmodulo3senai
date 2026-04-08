public class ClientePj extends Cliente {
    private String cnpj;
    private String razaoSocial;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void atualizarDados(String nome, String endereco, String cnpj, String razaoSocial) {
        super.atualizarDados(nome, endereco);
        setCnpj(cnpj);
        setRazaoSocial(razaoSocial);
    }
}
