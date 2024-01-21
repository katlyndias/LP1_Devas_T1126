// Escreva um programa que captura nome, salário, idade, altura e sexo. Mostre na tela utilizando o printf.

import java.util.Scanner;

public class L1_EX2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual o seu salário? (digite apenas o número.)");
        double salario = entrada.nextDouble();

        System.out.println("Qual a sua idade? (Digite apenas o número.)");
        int idade = entrada.nextInt();

        System.out.println("Qual a sua altura em metros?");
        double altura = entrada.nextDouble();

        entrada.nextLine(); // Limpar
        System.out.println("Qual o seu sexo? Digite \"Masculino\", \"Feminino\" ou \"Outro\" ");
        String sexo = entrada.nextLine();


        //printf
        System.out.printf("Seu nome é: %s, seu salário é %.2f, sua idade é: %d anos, sua altura é %.2f metros, seu sexo é: %s %n", nome, salario, idade, altura, sexo);

        entrada.close();
    }
}
