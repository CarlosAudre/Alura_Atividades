package Streaming.Atividades.src.desafio3;

import java.util.*;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteCartao = 0;
        boolean entradaValida = true;
        double valor = 0;
        String descricao = "";

        while (entradaValida) {
            System.out.println("Digite o limite do cartão: ");
            try {
                limiteCartao = scanner.nextDouble();
                entradaValida = false;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido");
                scanner.nextLine();
            }
        }

        ArrayList<AplicacaoCompras> valores = new ArrayList<>(); //É utilizado mais pra frente

        boolean rodando = true;
        while (rodando) {
            entradaValida = true;
            scanner.nextLine();
            while (entradaValida) {

                try {
                    System.out.println("Digite a descrição da compra:");
                    descricao = scanner.nextLine();

                    System.out.println("Digite o valor da compra:");
                    valor = scanner.nextDouble();
                    if (valor <= limiteCartao) {
                        limiteCartao -= valor;
                        System.out.println("Compra realizada!");
                        System.out.println("Limite atual: " + limiteCartao + " R$");
                        entradaValida = false;


                        AplicacaoCompras compras = new AplicacaoCompras(valor, descricao);
                        valores.add(compras);// Adiciona no array criado

                    } else {
                        System.out.println("Saldo insuficiente");
                        System.out.println("Saldo atual: " + limiteCartao + " R$");
                        entradaValida = false;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Valor inválido");
                    scanner.nextLine();
                }
            }

            boolean rodarDecisao = true;
            while (rodarDecisao) {
                System.out.println("Digite (0) para sair ou (1) para continuar");

                String decisao = scanner.next();

                if (decisao.equals("1")) {
                    rodarDecisao = false;
                    rodando = true;
                } else if (decisao.equals("0")) {
                    rodarDecisao = false;
                    rodando = false;
                } else {
                    System.out.println("Valor inválido");
                }
            }
        }

        System.out.println(valores.size()); /*A cada looping, o tamanho da lista vai cresncendo conforme
        vai se adicionando novos valores */

        System.out.println("****************************************************************");
        System.out.println("COMPRAS REALIZADAS: \n");
        for (int i = 0; i < valores.size(); i++){
            Collections.sort(valores);
            //Otra forma de ordenar - valores.sort(Comparator.comparing(AplicacaoCompras::getPreco));
            System.out.println(valores.get(i));
        }
        System.out.println("\n");
        System.out.println("****************************************************************");

    }
}
