package Streaming.Atividades.src.atv6;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Sabonete");
        produto1.setPreco(13);

        Produto produto2 = new Produto();
        produto2.setNome("Shampoo");
        produto2.setPreco(20);

        Produto produto3 = new Produto();
        produto3.setNome("Creme");
        produto3.setPreco(23);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        System.out.println(produtos);
        double precoMedio = 0;
        for (int i = 0; i < produtos.size(); i++){
            Double preco = produtos.get(i).getPreco();
            precoMedio += preco;
        }
        System.out.println("Preço médio dos produtos: " + precoMedio / 3 + "R$");

    }
}
