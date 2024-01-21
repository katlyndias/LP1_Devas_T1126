//Dado um inteiro, X, execute as seguintes ações condicionais:
//        a. Se X for ímpar, imprima Weird
//        b. Se X for par e estiver no intervalo inclusivo de 2 a 5,
//        imprima Not Weird
//        c. Se X for par e estiver no intervalo inclusivo de 6 a 20,
//        imprima Weird
//        d. Se X for par e maior que 20, imprima Not Weird

import java.util.Scanner;

public class L2_EX1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número:");
        int numero = entrada.nextInt();

        if(numero%2!=0){
            System.out.println("Weird");
        } else if (numero>=2 && numero<=5){
            System.out.println("Not Weird");
        } else if (numero>=6 && numero<=20){
            System.out.println("Weird");
        } else if (numero>20){
            System.out.println("Not Weird");
        }
        entrada.close();
    }

}

//Tem outra forma mais otimizada de fazer também:
//        if(numero%2!=0 || (numero>=6 && numero<=20)){
//        System.out.println("Weird");
//        } else if ((numero>=2 && numero<=5)||numero>20){
//        System.out.println("Not Weird");
//        }
