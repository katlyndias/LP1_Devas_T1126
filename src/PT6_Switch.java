public class PT6_Switch {
    public static void main(String[] args) {

        // Se nota maior ou igual a 90 -> A
        // Se nota maior ou igual a 80 -> B
        // Se nota maior ou igual a 70 -> C
        // Se nota menor que 70 -> Z


        int notaGeral = 90;
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

        System.out.println("---- Separação ----");

        switch(notaGeral){
            case 100:
                System.out.println("Parabens");
                break;
            case 70:
                System.out.println("Foi por pouco");
                break;
            default:
                System.out.println("Não passou");
                break; // não é necessário, mas por padrão colocamos
        }
        System.out.println(grade);
    }
}
