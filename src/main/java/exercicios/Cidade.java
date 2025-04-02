package exercicios;

//2) Classe que representa uma cidade de forma mutável.
// Diferente do record, aqui podemos alterar os valores
// após a criação.

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

