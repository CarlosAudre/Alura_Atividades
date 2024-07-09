package Streaming.Atividades.src.desafio3;

public class AplicacaoCompras implements Comparable<AplicacaoCompras> {
    private double preco;
    private String nome;

   public AplicacaoCompras(double preco, String nome){
       this.preco = preco;
       this.nome = nome;
   }

    @Override
    public String toString() {
        return nome + " - " + preco + "R$";
    }


    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(AplicacaoCompras outroPreco) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outroPreco.getPreco()));
    }
}
