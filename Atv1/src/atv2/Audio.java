package atv2;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public void implementarCurtidas(){
        curtidas ++;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void reproduzirAudio(){
        totalDeReproducoes++;
    }

    public void detalhes(){
        System.out.println("Nome: " + titulo);
        System.out.println("Duração: " + duracao);
        System.out.println("Total de reproduções: " + totalDeReproducoes);
        System.out.println("Total de curtidas: " + curtidas);

    }

}
