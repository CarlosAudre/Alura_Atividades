package Streaming.Atividades.src.atv3;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Audre");
        pessoa1.setIdade(19);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Mauricio");
        pessoa2.setIdade(19);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Rone");
        pessoa3.setIdade(17);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        System.out.println("Tamanho da lista: " + pessoas.size());
        System.out.println("Primeira pessoa da lista: " + pessoas.get(0));
        System.out.println("Lista completa: " + pessoas);

    }

}
