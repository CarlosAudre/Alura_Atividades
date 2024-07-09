package Streaming.Atividades.src.atv5;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void emitirSom(){
        System.out.println("Som");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade;

    }
}
