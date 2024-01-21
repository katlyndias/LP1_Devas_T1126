package POO;

// Subclasse Aluno (abstrata)
abstract class Aluno extends Pessoa {
    public Aluno(String nome, int idade, String nacionalidade) {
        super(nome, idade, nacionalidade);
    }

    // Método abstrato
    public abstract void assistirAulas();
}
