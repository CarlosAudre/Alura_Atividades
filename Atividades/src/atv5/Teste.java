package Streaming.Atividades.src.atv5;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Fushk", 3);
        Cachorro cachorro2 = new Cachorro("Rex", 5);

        Gato gato1 = new Gato("Mingau", 2);
        Gato gato2 = new Gato("Mel", 5);

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(cachorro1);
        animais.add(cachorro2);
        animais.add(gato1);
        animais.add(gato2);
        for (Animal pet: animais){
            System.out.println(pet);
            if (pet instanceof Gato gato){
                gato.rosnar();
            }
        }







    }
}
