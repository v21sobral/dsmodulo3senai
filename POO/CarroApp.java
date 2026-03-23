
public class CarroApp {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2019);

        System.out.println("O modelo do carro 1 é: " + carro1.getModelo());
        System.out.println("A marca do carro 1 é: " + carro1.getMarca());
        System.out.println("O ano de fabricação do carro 1 é: " + carro1.getAnoFabricacao());

        carro1.setModelo("Camry");
        carro1.setMarca("Toyota");
        carro1.setAnoFabricacao(2021);

        System.out.println("O modelo do carro 1 é: " + carro1.getModelo());
        System.out.println("A marca do carro 1 é: " + carro1.getMarca());
        System.out.println("O ano de fabricação do carro 1 é: " + carro1.getAnoFabricacao());

        carro2.setModelo("Accord");
        carro2.setMarca("Honda");
        carro2.setAnoFabricacao(2020);

        System.out.println("O modelo do carro 2 é: " + carro2.getModelo());
        System.out.println("A marca do carro 2 é: " + carro2.getMarca());
        System.out.println("O ano de fabricação do carro 2 é: " + carro2.getAnoFabricacao());
    }
}
