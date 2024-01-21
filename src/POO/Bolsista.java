package POO;

// Subclasse Bolsista (final)
final class Bolsista extends Aluno {
    public Bolsista(String nome, int idade, String nacionalidade) {
        super(nome, idade, nacionalidade);
    }

    // Implementação do método abstrato da classe Pessoa
    @Override
    public void realizarAtividade() {
        System.out.println(getNome() + " está realizando atividades como bolsista.");
    }

    // Implementação do método abstrato da classe Aluno
    @Override
    public void assistirAulas() {
        System.out.println(getNome() + " está assistindo às aulas como bolsista.");
    }

    // Método final
    public final void receberBolsa() {
        System.out.println(getNome() + " recebeu a bolsa.");
    }

    // Outros métodos específicos para Bolsista
}
