import java.util.*;
public class primeiroProjeto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************************************");
        System.out.println("Seja bem vindo ao banco virtual!");
        System.out.println("Antes de iniciarmos, precisaremos coletar alguns dos seus dados.");
        System.out.println("***************************************************\n");
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();


        boolean tempo1 = true;
        String tipoConta = "";
        while(tempo1){
            System.out.println("Quanto ao seu tipo de conta, selecione uma opção abaixo:");
            System.out.println("(a) Corrente  (B) Poupança  (C) Pagamento    (D) Salário" );
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("a")){
                tipoConta = "Corrente";
                tempo1 = false;

            }

            else if(opcao.equalsIgnoreCase("b")){
                tipoConta = "Poupança";
                tempo1 = false;
            }

            else if(opcao.equalsIgnoreCase("c")){
                tipoConta = "Pagamento";
                tempo1 = false;
            }

            else if(opcao.equalsIgnoreCase("d")){
                tipoConta = "Salário";
                tempo1 = false;
            }
            else {
                System.out.println("Opção inválida");
            }

            }
        boolean entradaValida = true;
        double saldo = 0;

        while (entradaValida){
            System.out.println("Digite o seu saldo atual:");
            try {
                saldo = scanner.nextDouble();
                scanner.nextLine();
                entradaValida = false;
            }
            catch (InputMismatchException e){
                System.out.println("Valor inválido");
                scanner.next();
            }
            /* O try e catch foi a minha principal descoberta construindo este código.
            Descobri que serve para ser utilizadas em situações inesperadas, como a do código acima,
            onde uso o comando InputMismatchException para aqueles valores que não são considerados
            double, conseguindo evitar o erro que apareceria caso fosse digitado um primitivo diferente.

             */
        }

        System.out.println("****************************************************\n");

        System.out.println("Nome:                    " + nome );
        System.out.println("Tipo da conta:           " +  tipoConta);
        System.out.println("Saldo inicial:           " +  saldo + "R$ \n");

        System.out.println("****************************************************\n");

        System.out.println("Operações");
        boolean tempo2 = true;
        while(tempo2){
            System.out.println(""" 
                1- Consultar saldo
                2- Receber valor 
                3- Transferir valor
                4-Sair
                """);
            String operacoes = scanner.nextLine();

            if (operacoes.equals("1")) {
                System.out.println("Saldo atual: " + saldo + "R$\n");
            }

            else if(operacoes.equals("2")) {

                System.out.println("Digite o quanto que quer receber\n");
                double receber = 0;
                try {
                    receber = scanner.nextDouble();
                    scanner.nextLine();
                    if (receber > 0){
                        saldo += receber;
                        String saldoConvertido = saldo + "\n";
                        System.out.println("Saldo atual: " + saldoConvertido + "R$" + "\n");

                    }
                    else{
                        System.out.println("Valor precisa ser maior que zero");
                    }

                }
                catch (InputMismatchException e){
                    System.out.println("Valor inválido");
                    scanner.next();
                }

            }

            else if(operacoes.equals("3")){
                System.out.println("Digite o valor que quer transferir\n");
                System.out.println("");
                double transferir = 0;

                try {
                    transferir = scanner.nextDouble();
                    scanner.nextLine();
                    if(transferir <= saldo){
                        saldo -= transferir;
                        System.out.println("");
                        System.out.println("Transferência completa\n");
                        System.out.println("Saldo atual: " + saldo + "\n");

                    }
                    else if(transferir > saldo){
                        System.out.println("Saldo insuficiente");
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Valor inválido");
                    scanner.next();
                }

            }
            else if(operacoes.equals("4")){
                System.out.println("Fim do programa");
                tempo2 = false;
            }

            else{
                System.out.println("Valor inválido");

            }

        }

        }

    }


