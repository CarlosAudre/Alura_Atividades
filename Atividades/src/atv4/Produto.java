package Streaming.Atividades.src.atv4;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", preco: " + preco + "R$, Quantidade: " + quantidade;
    }
}
