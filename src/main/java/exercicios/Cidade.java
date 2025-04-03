package exercicios;

//Classe que representa uma cidade de forma mutável.

public class Cidade {
    private String nome;
    public Cidade(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

