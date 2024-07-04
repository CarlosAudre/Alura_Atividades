package Streaming.modelos;
import Streaming.calculos.Classificar;

public class Filme extends Titulo implements Classificar {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    @Override
    public int getClassificacao(){
        return (int) mediaDasAvaliacoes() / 2;
    }
}
