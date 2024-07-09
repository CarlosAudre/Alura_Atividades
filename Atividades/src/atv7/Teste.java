package Streaming.Atividades.src.atv7;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(5);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(4);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(quadrado);
        for (Forma forma: formas){
            forma.calcularArea();
        }
    }
}
