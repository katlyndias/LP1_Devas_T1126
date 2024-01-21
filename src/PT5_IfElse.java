public class PT5_IfElse {
    public static void main(String[] args) {
        //If
        //Else

        double nota = 7;
        String nome = "Grazi";

        if (nota >= 7){
            System.out.println("Aprovada!");
        } else {
            System.out.println("Não Aprovada!");
        }

        //---------------------------------

        // Se nota maior ou igual a 90 -> A
        // Se nota maior ou igual a 80 -> B
        // Se nota maior ou igual a 70 -> C
        // Se nota menor que 70 -> Z

        int notaGeral = 0;
        char grade;

        if(notaGeral >= 90){
            grade = 'A';
        } else if (notaGeral >= 80){
            grade = 'B';
        } else if (notaGeral >=70){
            grade = 'C';
        } else {
            grade = 'Z';
        }
        System.out.println(grade);

        //Colocar no switch/case esse de cima

    }
}
