public class PT7_1_ForEach {
    public static void main(String[] args) {
        String[] frutas = new String[]{"Maçã", "Laranja", "Uva", "Goiaba"};

        for (int i = 0; i < 4; i++){
            System.out.println(frutas[i]);
        }
        // For each não permite manipular índices específicos nem fazer a ordem reversa
        // For each funciona em Array
        System.out.println();
        System.out.println("For Each:");
        for (String fruta: frutas){
            System.out.println(fruta);
        }

        System.out.println();
        System.out.println("Separação");
        System.out.println();

        for (int i = 0; i < 4; i++){
            if (i == 2){
                System.out.println("Minha fruta favorita é " + frutas[i]);
            } else {
                System.out.println(frutas[i]);
            }
        }

        System.out.println();
        System.out.println("Separação");
        System.out.println();


        for (int i = 3; i >= 0; i--){
            System.out.println(frutas[i]);
        }

        System.out.println();
        System.out.println("Separação");
        System.out.println();

        // o For Each por exemplo é útil para fazer a média, pois a ordem não importa para a soma das notas
        int[] notas = new int[]{10, 5, 7, 8};

        int somaDasNotas = 0;
        for(int nota: notas){
            somaDasNotas = somaDasNotas + nota;
        }
        System.out.println(somaDasNotas);

    }
}
