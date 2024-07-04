package atv2;

public class texte {
    public static void main(String[] args){
        Musica musica1 = new Musica();
        musica1.setAlbum("Fim de semana");
        musica1.setTitulo("Golden hour");
        musica1.setGenero("Pop");
        musica1.setArtista("JVKE");
        musica1.setDuracao(3.52);
        musica1.setTotalDeReproducoes(3000);
        musica1.setCurtidas(1000);
        musica1.reproduzir();
        musica1.curtir();
        musica1.detalhes();

        System.out.println("*************************************************************");

        Podcast podcast = new Podcast();
        podcast.setHost("Igão");
        podcast.setTitulo("Maior farm de ferro do minecraft");
        podcast.setDuracao(3.52);
        podcast.setTotalDeReproducoes(3000);
        podcast.setCurtidas(500);
        podcast.reproduzir();
        podcast.curtir();
        podcast.setDescricao(".................................");
        podcast.detalhes();
        podcast.classificacao();

    }
}
