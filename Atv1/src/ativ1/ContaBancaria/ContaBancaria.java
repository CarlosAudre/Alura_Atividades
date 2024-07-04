package ativ1.ContaBancaria;

public class ContaBancaria {

    private double saldo;

    public void depositar(double valor){
        if (saldo > valor){
            saldo = saldo - valor;
            System.out.println("Operação concluída");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void sacar(double valor){
        saldo = saldo + valor;
        System.out.println("Operacao concluída");
    }


    public  double ConsultarSaldo(){
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
