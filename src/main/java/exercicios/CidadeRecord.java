package exercicios;

//1) Record que representa uma cidade de forma imutável.
// Records são imutáveis por padrão - todos os campos são
// final e não podem ser alterados após a criação.

public record CidadeRecord(String nome) {
}