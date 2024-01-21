package POO;

// Subclasse Atendente (final)
final class Atendente extends Funcionario {
    public Atendente(String nome, int idade, String nacionalidade) {
        super(nome, idade, nacionalidade);
    }

    // Método final
    public final void atenderPessoas() {
        System.out.println(getNome() + " está atendendo pessoas.");
    }

    // Implementação do método abstrato da classe Pessoa
    @Override
    public void realizarAtividade() {
        System.out.println(getNome() + " está realizando atividades como atendente.");
    }

    // Implementação do método abstrato da classe Funcionario
    @Override
    public void baterPonto() {
        System.out.println(getNome() + " bateu o ponto como atendente.");
    }

    // Outros métodos específicos para Atendente
}