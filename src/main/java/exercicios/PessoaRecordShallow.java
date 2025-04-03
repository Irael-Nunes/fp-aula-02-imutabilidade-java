package exercicios;

//Record que demonstra shallow (superficial) imutabilidade.
//Embora o record em si seja imutável, o objeto Cidade dentro dele é mutável.

public record PessoaRecordShallow(String nome, Cidade cidade) {
}

