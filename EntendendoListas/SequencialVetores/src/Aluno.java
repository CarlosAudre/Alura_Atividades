public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Boolean equals(Aluno outro){
        return outro.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
