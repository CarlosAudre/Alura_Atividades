package ativ1.NumerosPrimos;

public class NumerosPrimos {
    private int valor;


    public void setNumero(int valor) {
        this.valor = valor;
    }


    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void verificarPrimalidade(int valor) {
        this.valor = valor;
        int i;
        boolean ehPrimo = true;
        for ( i = 2; i <= valor; i++) {
            for (int u = 2; u < i; u++) {
                if (i > u) {
                    if (i % u == 0){
                        ehPrimo = false;
                        break;
                    }
                    else{
                        ehPrimo = true;
                    }
                }

            }


        }
        if(valor <= 1){
            System.out.println(valor + " não é um número primo");
        }
        else if (ehPrimo == true) {
            System.out.println((i - 1)+ " é um número primo");
        } else {
            System.out.println((i - 1) + " não é um número primo");
        }
    }

    public void listarPrimos(int numeroLimite){

        for (int i = 2; i <= numeroLimite; i++) {
            boolean ehPrimo = true;
            for (int u = 2; u < i; u++) {
                if (i % u == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println(i + " é um número primo");
            }
        }

    }
}

