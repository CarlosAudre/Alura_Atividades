package Streaming.Atividades.src.atv4;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args){
        Produto produto1 = new Produto("Sabonete");
        //produto1.setNome("Sabonete");
        produto1.setPreco(5.60);
        produto1.setQuantidade(20);

        Produto produto2 = new Produto("Shampoo");
        //produto2.setNome("Shampoo");
        produto2.setPreco(20.5);
        produto2.setQuantidade(15);

        Produto produto3 = new Produto("Creme");
        //produto3.setNome("Creme");
        produto3.setPreco(19);
        produto3.setQuantidade(17);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        System.out.println(produtos.size());
        System.out.println(produtos.get(0));
        System.out.println("Lista de produtos: " + produtos);

        ProdutoPerecivel validade1 = new ProdutoPerecivel("Danone");
        validade1.setPreco(5.3);
        validade1.setQuantidade(23);
        validade1.setDataValidade("03/2028");
        System.out.println(validade1);
    }

}
