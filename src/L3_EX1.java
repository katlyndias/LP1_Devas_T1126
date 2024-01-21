//Crie uma calculadora onde cada operação tem sua própria
//função. Ex: somar(...), subtrair(...), dividir(...), multiplicar(...)

import java.util.Scanner;

public class L3_EX1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem-vindo (a) à calculadora!");
        System.out.printf("Escolha a operação que deseja realizar:%n i. Somar%n ii. Subtrair%n iii. Dividir%n iv. Multiplicar%n");
        String operacao = entrada.nextLine();

        if ((operacao.equals("i"))||(operacao.equals("ii"))||(operacao.equals("iii"))||(operacao.equals("iv"))) {
            System.out.print("Digite o primeiro número: ");
            double num1 = entrada.nextInt();
            System.out.print("Digite o segundo número: ");
            double num2 = entrada.nextInt();
            double resultado1 = 0.0;
            double resultado2 = 0.0;

            if (operacao.equals("i")) {
                soma(num1, num2);
            } else if (operacao.equals("ii")) {
                subtracao(num1, num2);
            } else if (operacao.equals("iii")) {
                if (num2 != 0) {
                    divisao(num1, num2);
                } else {
                    System.out.println("Não é permitida a divisão por 0!");
                }
            } else if (operacao.equals("iv")) {
                multiplicacao(num1, num2);
            }
        } else {
            System.out.println("Operação inválida!");
        }
        entrada.close();

    }

    public static void soma(double a, double b){
        double resultado = a + b;
        System.out.printf("%.2f + %.2f = %.2f", a, b, resultado);
    }

    public static void subtracao(double a, double b){
        double resultado = a - b;
        System.out.printf("%.2f - %.2f = %.2f", a, b, resultado);
    }

    public static void divisao(double a, double b){
        double resultado = a / b;
        System.out.printf("%.2f / %.2f = %.2f", a, b, resultado);
    }

    public static void multiplicacao(double a, double b){
        double resultado = a * b;
        System.out.printf("%.2f x %.2f = %.2f", a, b, resultado);
    }
}
