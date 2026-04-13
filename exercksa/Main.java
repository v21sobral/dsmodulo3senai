public class Main {
    public static void main(String[] args) {
        //Criando um círculo com raio 5
        Circulo circulo = new Circulo(5);
        System.out.println("Área do círculo: " + circulo.calcularArea());

        //Criando um retângulo com comprimento 4 e altura 3
        Retangulo retangulo = new Retangulo(4, 3);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
    }
}
