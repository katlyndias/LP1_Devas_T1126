package POO;

public class Main {
    public static void main(String[] args) {
        Atendente atendente = new Atendente("João", 30, "Brasileiro");
        Professor professor = new Professor("Maria", 40, "Brasileira");
        Bolsista bolsista = new Bolsista("Pedro", 20, "Brasileiro");
        NaoBolsista naoBolsista = new NaoBolsista("Ana", 25, "Brasileira");

        atendente.baterPonto();
        atendente.atenderPessoas();
        atendente.realizarAtividade();

        professor.baterPonto();
        professor.darAulas();
        professor.realizarAtividade();

        bolsista.assistirAulas();
        bolsista.receberBolsa();
        bolsista.realizarAtividade();

        naoBolsista.assistirAulas();
        naoBolsista.realizarAtividade();
    }
}
