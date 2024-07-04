package ativ1.NumerosPrimos;

public class GeradorPrimo extends NumerosPrimos{
    public void GerarProximoPrimo(){
        int valor = getValor();
        for (int i = 2; i <= valor; i++) {
            boolean ehPrimo = true;
            for (int u = 2; u < i; u++) {
                if (i % u == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println("Número primo gerado: " + i );
            }
        }

    }
    }

