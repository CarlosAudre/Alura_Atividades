package ativ1.NumerosPrimos;

public class VerificadorPrimos extends NumerosPrimos{

    public void verificarSeEhPrimo(int valor){
        for (int i = 2; i <= valor; i++) {
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

