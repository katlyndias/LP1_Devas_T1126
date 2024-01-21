//Escreva um programa que captura nome, idade e profissão do usuário e mostra na tela os valores.
//(Utilize a classe Scanner e os 3 métodos print, printf e println).


import java.util.Scanner;

public class L1_EX1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual a sua idade? (Digite apenas o número.");
        int idade = entrada.nextInt();

        entrada.nextLine(); // Limpar
        System.out.println("Qual a sua profissão?");
        String profissao = entrada.nextLine();

        //println
        System.out.println();
        System.out.println("Seu nome é: " + nome + ", sua idade é: " + idade + " anos, sua profissão é: " + profissao);

        //print
        System.out.print("Seu nome é: ");
        System.out.print(nome);
        System.out.print(", sua idade é: ");
        System.out.print(idade);
        System.out.print(" anos, sua profissão é: ");
        System.out.println(profissao);

        //printf
        System.out.printf("Seu nome é: %s, sua idade é: %d anos, sua profissão é: %s %n", nome, idade, profissao);

        entrada.close();
    }

}
