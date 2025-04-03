package exercicios;

//Record que demonstra deep (profunda) imutabilidade.
// Tanto o record quanto o objeto CidadeRecord dentro dele são imutáveis.

public record PessoaRecord(String nome, CidadeRecord cidade) {
}
