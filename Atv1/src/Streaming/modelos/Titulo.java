package Streaming.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;



    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }


    public  int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }


    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }
    public void setSomaDasAvaliacoes(double somaDasAvaliacoes){
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }


    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public void setTotalDeAvaliacoes(int totalDeAvaliacoes){
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }


    public boolean IncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    public void exibeFixaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    public double mediaDasAvaliacoes(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
