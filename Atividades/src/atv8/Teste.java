package Streaming.Atividades.src.atv8;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(10, 5400);
        ContaBancaria conta2 = new ContaBancaria(33, 5600.33);
        ContaBancaria conta3 = new ContaBancaria(12, 3500.20);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        double contaComMaiorSaldo = 0;
        for (ContaBancaria conta: contas){
            double contaSaldo = conta.getSaldo();
            if(contaSaldo > contaComMaiorSaldo){
                contaComMaiorSaldo = contaSaldo;
            }

        }
        System.out.println("A conta que apresenta um maior saldo disponível há um total de " +
                contaComMaiorSaldo + "R$");

    }
}
