//Dado uma array turma onde cada um dos seus elementos é
//uma array com as notas de cada um dos alunos, em java calcule e
//mostre a média de cada aluno e a média da turma.
//        Exemplo:
//Turma:
//        [[9, 8, 7, 8], [10, 9, 8, 9], [9, 8, 7, 8]]
//Output:
//Aluno 0 - Média 8,
//Aluno 1 - Média 9,
//Aluno 2 - Média 8
//Média da turma: 8,33


public class L4_EX2 {
        public static void main(String[] args) {
            // Definindo a turma com as notas dos alunos
            int[][] turma = {{9, 8, 7, 8}, {10, 9, 8, 9}, {9, 8, 7, 8}};

            // Calculando e exibindo a média de cada aluno
            for (int i = 0; i < turma.length; i++) {
                int[] notasAluno = turma[i];
                double mediaAluno = calculaMedia(notasAluno);
                System.out.printf("Aluno %d - Média %.0f %n", i, mediaAluno);
            }

            // Calculando e exibindo a média da turma
            double mediaTurma = calculaMediaTurma(turma);
            System.out.printf("Média da turma: %.2f %n", mediaTurma);
        }

        // Função para calcular a média de um array de notas
        public static double calculaMedia(int[] notas) {
            int soma = 0;
            for (int nota : notas) {
                soma += nota;
            }
            return (double) soma / notas.length;
        }

        // Função para calcular a média da turma
        public static double calculaMediaTurma(int[][] turma) {
            int totalNotas = 0;
            int totalAlunos = turma.length;

            for (int i = 0; i < turma.length; i++) {
                for (int j = 0; j < turma[i].length; j++) {
                    totalNotas += turma[i][j];
                }
            }

            return (double) totalNotas / (totalAlunos * turma[0].length);
        }
}
