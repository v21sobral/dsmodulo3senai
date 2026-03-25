public class VeiculoApp {
    public static void main(String[] args) {
        VeiculoCarro carro = new VeiculoCarro("Toyota", 2020, "Corolla");
        VeiculoMoto moto = new VeiculoMoto("Honda", 2019, "CB500X");

        System.out.println("Informações do Carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Modelo: " + carro.getModelo());

        System.out.println("\nInformações da Moto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Modelo: " + moto.getModelo());
    }
}
