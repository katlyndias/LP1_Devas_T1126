import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        System.out.println("Digite uma nota para saber a grade");
        Scanner entrada = new Scanner(System.in);
        int notaGeral = entrada.nextInt();


        // Se nota maior ou igual a 90 -> A
        // Se nota maior ou igual a 80 -> B
        // Se nota maior ou igual a 70 -> C
        // Se nota menor que 70 -> Z

        char grade;

        switch (notaGeral / 10) {
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'Z';
        }

        System.out.println(grade);
    }
}
