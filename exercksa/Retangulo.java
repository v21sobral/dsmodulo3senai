public class Retangulo extends FormaGeometrica {
    private double comprimento;
    private double altura;

    //Construtor
    public Retangulo(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    //Implementação do método calcularArea
    @Override
    public double calcularArea() {
        return comprimento * altura;
    }
    
}
