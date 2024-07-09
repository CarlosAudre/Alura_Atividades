package Streaming.Atividades.src.atv5;

public class Gato extends Animal{
    public Gato(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
    public void rosnar(){
        System.out.println("Rostando");
    }
}
