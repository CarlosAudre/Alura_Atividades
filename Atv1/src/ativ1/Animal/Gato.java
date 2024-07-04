package ativ1.Animal;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("MIAAAAAAAAU MIAAAAAAAAAAAAAAAAAAAAAAAAAAAU");
    }
    public void pegarPeixe(){
        System.out.println("Com suas garras da morte, o " + getName() + " pega um peixe e o come");
    }
}
