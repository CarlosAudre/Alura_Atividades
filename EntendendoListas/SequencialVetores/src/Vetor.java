import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno outro){
        this.alunos[totalDeAlunos] = outro;
        totalDeAlunos++;

    }

    public int tamanho(){
        return totalDeAlunos;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeAlunos;
    }


    public Aluno pega(int posicao) {

        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posiçao invalida");
        }
        else {
            return alunos[posicao];
        }

    }


    public void remove(int posicao) {
        for(int i = posicao; i < this.totalDeAlunos; i++) {
            this.alunos[i] = this.alunos[i+1];
        }
        totalDeAlunos--;
        //O elemento na posição x, é substituido pelo outro elemento que está a sua  frente.
    }

    public boolean contem(Aluno outro){
        for (int i = 0; i < alunos.length; i++){
            if (alunos[i] == outro){
                return true;
            }
        }
        return false;
    }

    public void adiciona(int posicao, Aluno outro){
        for (int i = totalDeAlunos - 1; i >= posicao; i -=1 ){
            alunos[i + 1] = alunos[i];

        }
        alunos[posicao] = outro;
        totalDeAlunos++;
    }


    public String toString() {
        return Arrays.toString(alunos);
    }
}
