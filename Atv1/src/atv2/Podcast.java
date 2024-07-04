package atv2;

public class Podcast extends Audio implements Metodos {
    private String host;
    private String descricao;

    @Override
    public void curtir() {
        implementarCurtidas();
    }

    @Override
    public void reproduzir() {
        reproduzirAudio();
        System.out.println(getTitulo() + " está sendo reporduzido");

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public void detalhes() {
        System.out.println("Host : " + host);
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Total de reproduções: " + getTotalDeReproducoes());
        System.out.println("Total de curtidas: " + getCurtidas());
        System.out.println("Descrição: " + descricao);
    }
    public void classificacao(){
        if (getCurtidas() >= 1000){
            System.out.println("Podcast nota 10");
        } else if (getCurtidas() > 500 && getCurtidas() < 1000) {
            System.out.println("Podcast legal");

        }
        else {
            System.out.println("Um dos podcasts já feitos");
        }
}
 }
