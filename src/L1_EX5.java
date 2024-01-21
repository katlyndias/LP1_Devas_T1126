//Faça um programa que calcula o IMC

import java.util.Scanner;

public class L1_EX5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo (a) à calculadora de IMC!");
        System.out.println("Qual a sua altura em metros?");
        double altura = entrada.nextDouble();

        System.out.println("Qual o seu peso em kg?");
        double peso = entrada.nextDouble();

        double IMC = peso/(altura * altura);
        System.out.printf("O valor do seu IMC é %.2f.\n", IMC);

        entrada.close();
    }

}
