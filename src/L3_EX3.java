// Dado um número escreva uma função que retorna o seu fatorial.


import java.util.Scanner;

public class L3_EX3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número do qual deseja saber o fatorial: ");
        int numero = entrada.nextInt();

        calcularFatorial(numero);

        entrada.close();
    }
    public static void calcularFatorial(int numero){
        long fatorial = 1L;
        if (numero == 0){
            fatorial = 1L;
        } else {
            for (int i = numero; i >= 1; i--) {
                fatorial *= i;
            }
        }
        System.out.printf("%d! = %d", numero, fatorial);
    }

}
