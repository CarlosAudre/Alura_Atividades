package Streaming;

import Streaming.calculos.CalculadoraDeTempo;
import Streaming.calculos.FiltroRecomendaca;
import Streaming.modelos.Episodio;
import Streaming.modelos.Filme;
import Streaming.modelos.Serie;

public class Principal {
    public static void main(String [] args){
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFixaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        System.out.println("Soma das avaliações: " + meuFilme.getSomaDasAvaliacoes() );
        System.out.println("Total das avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média: " + meuFilme.mediaDasAvaliacoes());

        System.out.println("***********************************************");

        Filme filme2 = new Filme();
        filme2.setNome("Dragon ball");
        filme2.setAnoDeLancamento(2021);
        filme2.setDuracaoEmMinutos(150);
        filme2.exibeFixaTecnica();
        filme2.avalia(10);
        filme2.avalia(10);
        System.out.println("Soma das avaliações: " +filme2.getSomaDasAvaliacoes() );
        System.out.println("Total das avaliações: " + filme2.getTotalDeAvaliacoes());
        System.out.println("Média: " + filme2.mediaDasAvaliacoes());


        System.out.println("***********************************************");


        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFixaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("A série tem no total " + serie.getDuracaoEmMinutos() + " minutos");

        System.out.println("***********************************************");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);
        System.out.println("O tempo total para assisitr esse(s) filme(s) é de " + calculadora.getTempoTotal() + " minutos");

        System.out.println("***********************************************");

        FiltroRecomendaca filtro = new FiltroRecomendaca();
        filtro.filtra(meuFilme);

        System.out.println("***********************************************");

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }

}
