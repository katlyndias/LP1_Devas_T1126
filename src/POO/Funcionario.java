package POO;

// Subclasse Funcionario (abstrata)
abstract class Funcionario extends Pessoa {
    public Funcionario(String nome, int idade, String nacionalidade) {
        super(nome, idade, nacionalidade);
    }

    // Método abstrato
    public abstract void baterPonto();
}