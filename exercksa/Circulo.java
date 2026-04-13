public class Circulo extends FormaGeometrica {
    private double raio;

    //Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    //Implementação do método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
} 
    

