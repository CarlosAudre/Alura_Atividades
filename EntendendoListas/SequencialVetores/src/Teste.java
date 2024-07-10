public class Teste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Audre");
        Aluno aluno2 = new Aluno("Pedro");
        Aluno aluno3 = new Aluno("João");

        Vetor lista = new Vetor();
        lista.adiciona(aluno1);
        lista.adiciona(aluno2);
        System.out.println(lista);
        System.out.println(lista.tamanho());
        System.out.println(lista.contem(aluno1));
        System.out.println(lista.contem(aluno3));
        System.out.println(lista.pega(1));
        lista.adiciona( 0,aluno3);
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);

    }
}
