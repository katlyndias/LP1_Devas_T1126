public class PT10_Arrays {

    public static void main(String[] args) {
        // Vetores com valores definidos

        int[] nums = new int[]{1, 2, 3, 4,5 };

        System.out.println(nums.length);
        System.out.println(nums[0]);

        System.out.println("----------");
        // Vetores sem valores definidos
        int[] nums2 = new int[5]; // -> por padrão cria [0, 0, 0, 0, 0]
        System.out.println(nums2.length);
        System.out.println(nums2[0]); // printa zero quando não foi atribuído nada

        // Por que o vetor é como é?
        // 1 - Por que precisamos definir um tipo? Para a fórmula do endereço de memória funcionar (saber quanto precisa pular)
        // 2 - Por que precisamos definir um tamanho? Porque como o Java armazena um do lado do outro precisa saber o tamanho total
        // 3 - Por que inicia com índice zero? Para facilitar o cálculo de endereço de memória

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        double[] notas = new double[4];
        notas[0] = 10.0;
        notas[1] = 5.0;
        notas[2] = 7.5;
        notas[3] = 9.0;

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        media(notas);

    }
    // checar se tá igual ao dele


    public static void media(double[] notas){
        int somaDasNotas=0;
        for(int i = 0; i < notas.length; i++){
            somaDasNotas += notas[i];
        }


//        for(double nota: notas){
//            somaDasNotas += nota;
//        }

        double media = somaDasNotas/notas.length;
        System.out.println("A média é " + media);
    }
}
