package ativ1.Carro;

public class Carro {
    private String nomeModelo;
    private double preco;

    public void ModeloAno(){
        double aumentoPreco = 0;
        for(int i = 2020; i <= 2022; i++){
            double anoi = preco + (preco * aumentoPreco);
            System.out.println("O preço da BMW em " + i + " é de " + anoi);
            aumentoPreco += 0.1;
        }


    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
