//Dado um inteiro, X, imprima seus primeiros 10 múltiplos. Cada
//        múltiplo X * i (onde 1 <= i <= 10) deve ser impresso em uma
//        nova linha na forma: X x i = resultado.
//        i. Exemplo de input - > 2
//        ii. Exemplo de output ->
//        2 x 1 = 2
//        2 x 2 = 4
//        2 x 3 = 6
//        2 x 4 = 8
//        2 x 5 = 10
//        2 x 6 = 12
//        2 x 7 = 14
//        2 x 8 = 16
//        2 x 9 = 18
//        2 x 10 = 20

import java.util.Scanner;

public class L2_EX4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número inteiro do qual deseja saber a tabuada: ");
        int numero = entrada.nextInt();
        int resultado = 0;

        for(int i = 1; i <= 10; i++){
        resultado = numero * i;
            System.out.printf("%d x %d = %d %n", numero, i, resultado);
        }

        entrada.close();
    }
}
