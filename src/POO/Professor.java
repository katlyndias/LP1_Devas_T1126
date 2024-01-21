package POO;

// Subclasse Professor (final)
final class Professor extends Funcionario {
    public Professor(String nome, int idade, String nacionalidade) {
        super(nome, idade, nacionalidade);
    }

    // Implementação do método abstrato da classe Pessoa
    @Override
    public void realizarAtividade() {
        System.out.println(getNome() + " está realizando atividades como professor.");
    }

    // Implementação do método abstrato da classe Funcionario
    @Override
    public void baterPonto() {
        System.out.println(getNome() + " bateu o ponto como professor.");
    }

    // Método final
    public final void darAulas() {
        System.out.println(getNome() + " está dando aulas.");
    }

    // Outros métodos específicos para Professor
}