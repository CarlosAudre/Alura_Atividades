package Streaming.Atividades.src.atv9;

import java.util.*;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(44);
        numeros.add(23);
        Collections.sort(numeros);
        System.out.println(numeros);

        Titulo titulo1 = new Titulo("Cobra Kai");
        Titulo titulo2 = new Titulo("Stranger things");
        Titulo titulo3 = new Titulo("Game of Thrones");

        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);
        System.out.println(titulos);
        Collections.sort(titulos);
        System.out.println("Títulos em ordem alfabética: " + titulos);

        Jogos jogo1 = new Jogos("Elden Ring", 2022);
        Jogos jogo2 = new Jogos("Baldurs Gate", 2023);
        Jogos jogo3 = new Jogos("Red Dead Redemption 2", 2018);

        List<Jogos> jogos = new LinkedList<>();
        jogos.add(jogo1);
        jogos.add(jogo2);
        jogos.add(jogo3);
        Collections.sort(jogos);
        System.out.println(jogos);
        jogos.sort(Comparator.comparing(Jogos::getAnoLancamento));
        System.out.println("Jogos em ordem por lançamento: " + jogos);


    }
}
