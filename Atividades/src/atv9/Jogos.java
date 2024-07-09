package Streaming.Atividades.src.atv9;

public class Jogos implements Comparable<Jogos>{
    private String nome;
    private int AnoLancamento;

    public Jogos(String nome, int AnoLancamento){
        this.nome = nome; this.AnoLancamento = AnoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return AnoLancamento;
    }

    @Override
    public int compareTo(Jogos outroJogo) {
        return this.getNome().compareTo(outroJogo.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " (" + getAnoLancamento() + ")";
    }
}
