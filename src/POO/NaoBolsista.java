package POO;

// Nova subclasse NaoBolsista (final)
final class NaoBolsista extends Aluno {
    public NaoBolsista(String nome, int idade, String nacionalidade) {
        super(nome, idade, nacionalidade);
    }

    // Implementação do método abstrato da classe Pessoa
    @Override
    public void realizarAtividade() {
        System.out.println(getNome() + " está realizando atividades como aluno não bolsista.");
    }

    // Implementação do método abstrato da classe Aluno
    @Override
    public void assistirAulas() {
        System.out.println(getNome() + " está assistindo às aulas como aluno não bolsista.");
    }

    // Outros métodos específicos para NaoBolsista
}
