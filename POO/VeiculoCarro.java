public class VeiculoCarro extends Veiculo {
    private int numeroPortas;

    public VeiculoCarro(String marca, int ano, int numeroPortas) {
        super(marca, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Número de Portas: " + getNumeroPortas());
    }
}
       