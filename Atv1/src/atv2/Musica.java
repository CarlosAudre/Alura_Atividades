package atv2;

public class Musica extends Audio implements Metodos{
        private String album;
        private String artista;
        private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void curtir() {
        implementarCurtidas();
    }

    @Override
    public void reproduzir() {
        reproduzirAudio();
        System.out.println(getTitulo() + " está sendo reporduzido");

    }

    @Override
    public void detalhes() {
        System.out.println("Albom: " + album);
        System.out.println("Artista : " + artista);
        System.out.println("Gênero: " + genero);
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Total de reproduções: " + getTotalDeReproducoes());
        System.out.println("Total de curtidas: " + getCurtidas());

    }

    public void classificacao(){
        if (getCurtidas() >= 1000){
            System.out.println("Música nota 10");
        } else if (getCurtidas() > 500 && getCurtidas() < 1000) {
            System.out.println("Música legal");

        }
        else {
            System.out.println("Uma das músicas já feitas");
        }
    }
}
