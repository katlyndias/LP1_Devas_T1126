//Joãozinho quer calcular e mostrar a quantidade de
//litros de combustível gastos em uma viagem, ao utilizar um
//automóvel que faz 12 KM/L. Para isso, ele gostaria que você o
//auxiliasse através de um simples programa. Para efetuar o
//cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e
//a velocidade média durante a mesma (em km/h). Assim,
//pode-se obter distância percorrida e, em seguida, calcular
//quantos litros seriam necessários. Mostre o valor com 3 casas
//decimais após o ponto.


import java.util.Scanner;
public class L3_EX5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá, Joãozinho! Bem vindo à calculadora de litros de combustível gastos em uma viagem realizada por um automóvel que faz 12 quilômetros por litro!");
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempoViagem = entrada.nextDouble();
        System.out.print("Digite a velocidade média durante a viagem, em quilômetros por hora (km/h): ");
        double velocidadeMedia = entrada.nextDouble();

        if((tempoViagem <= 0)||(velocidadeMedia <= 0)){
            System.out.println("Tempo de viagem e/ou velocidade média inválido(s)!");
        } else {
        calcularLitros(tempoViagem, velocidadeMedia);
        }
    }

    public static void calcularLitros (double tempoViagem, double velocidadeMedia){
        double distanciaPercorrida = tempoViagem * velocidadeMedia;
        double litrosDeCombustivel = distanciaPercorrida / 12;
        System.out.printf("O número de litros de combustível gasto é %.3f", litrosDeCombustivel);
    }
}
