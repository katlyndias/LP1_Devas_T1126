
//Receba X notas e calcule a média. (O usuário vai dizer a quantidade de valores que quer calcular)

import java.util.Scanner;

    public class L2_EX3 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de notas que deseja calcular a média: ");
        double qtdeNotas = entrada.nextInt();
        double somaNotas = 0;
        double nota = 0;
        double media = 0;

        if(qtdeNotas <= 0){
            System.out.println("Quantidade de notas não pode ser negativa nem zero!");
        } else {
            for (int i = 1; i <= qtdeNotas; i++) {
                System.out.printf("Digite a %dª nota: ", i);
                nota = entrada.nextDouble();
                somaNotas += nota;
            }
            media = somaNotas / qtdeNotas;

            System.out.printf("A média das %.0f notas é: %.2f", qtdeNotas, media);
        }
        entrada.close();
    }
}
