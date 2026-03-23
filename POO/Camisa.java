
public class Camisa {
    private String cor;
    private String tamanho;
    private String tipo;

    public Camisa(String cor, String tamanho, String tipo){
        this.cor = cor;
        this.tamanho = tamanho; 
        this.tipo = tipo;
    }

    public String getCor(){
        return cor;
    }

    public String getTamanho(){
        return tamanho;
    }

    public String getTipo(){
        return tipo;
 private String marca;
    private String modelo;
    private int anoFabricacao;

    public Camisa(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    
    