package Streaming.Atividades.src.atv7;

public class Circulo implements Forma {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área do círculo: " + 3 * (raio * raio));
    }
}
