package Streaming.Atividades.src.atv7;

public class Quadrado implements Forma {

    @Override
    public void calcularArea() {
        System.out.println("Área do quadrado: " + lado*lado);
    }

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
