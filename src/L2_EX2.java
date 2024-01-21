//Desenvolver uma calculadora que o usuário será capaz de
//        escolher uma das opções abaixo e passar 2 números para o
//        processamento.
//        i. Somar
//        ii. Subtrair
//        iii. Dividir // não permitir divisão por ZERO
//        iv. Multiplicar
//        v. Resto
//        vi. Raiz
//        vii. Potência

import java.util.Scanner;

public class L2_EX2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem-vindo (a) à calculadora!");
        System.out.printf("Escolha a operação que deseja realizar:%n i. Somar%n ii. Subtrair%n iii. Dividir%n iv. Multiplicar%n v. Resto%n vi. Raiz%n vii. Potência%n");
        String operacao = entrada.nextLine();

        if ((operacao.equals("i"))||(operacao.equals("ii"))||(operacao.equals("iii"))||(operacao.equals("iv"))||(operacao.equals("v"))||(operacao.equals("vi"))||(operacao.equals("vii"))){

            System.out.print("Digite o primeiro número: ");
            double num1 = entrada.nextInt();
            System.out.print("Digite o segundo número: ");
            double num2 = entrada.nextInt();
            double resultado1 = 0.0;
            double resultado2 = 0.0;

            if(operacao.equals("i")){
                resultado1 = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, resultado1);
            } else if(operacao.equals("ii")){
                resultado1 = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, resultado1);
            } else if(operacao.equals("iii")) {
                if (num2 != 0) {
                    resultado1 = num1 / num2;
                    System.out.printf("%.2f + %.2f = %.2f", num1, num2, resultado1);
                } else {
                    System.out.println("Não é permitida a divisão por 0!");
                }
            } else if(operacao.equals("iv")){
                resultado1 = num1 * num2;
                System.out.printf("%.2f x %.2f = %.2f", num1, num2, resultado1);
            } else if(operacao.equals("v")){
                if (num2 != 0) {
                    resultado1 = num1 % num2;
                    System.out.printf("o resto de %.2f divido por %.2f = %.2f", num1, num2, resultado1);
                } else {
                    System.out.println("Não é permitida a divisão por 0!");
                }
            } else if(operacao.equals("vi")){
                resultado1 = Math.sqrt(num1);
                resultado2 = Math.sqrt(num2);
                System.out.printf("√%.2f = %.2f, √%.2f = %.2f", num1, resultado1, num2, resultado2);
            } else if(operacao.equals("vii")){
                resultado1 = Math.pow(num1,num2);
                System.out.printf("O número %.2f elevado a %.2f é igual a %.2f", num1, num2, resultado1);
            }

        } else {
            System.out.println("Operação inválida!");
        }

        entrada.close();
    }
}
