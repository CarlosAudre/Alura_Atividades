package Streaming.modelos;

import Streaming.calculos.Classificar;

public class Episodio implements Classificar {
    private String nome;
    private int numero;
    private Serie serie;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    private int totalVisualizacoes;

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100){
            return 4;
        }
        else {
            return 2;
        }

    }
}
