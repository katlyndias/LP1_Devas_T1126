//Faça um programa que calcula a área das seguites figuras geometricas:
//Retângulo, Triângulo, Círculo e Trapézio.

import java.util.Scanner;

public class L1_EX4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo(a) à calculadora de área de Retângulo, Triângulo, Círculo e Trapézio!");
        System.out.println();

        // Cálculo da área do Retângulo
        System.out.println("Digite as dimensões do Retângulo:");
        System.out.print("Base: ");
        double baseRetangulo = entrada.nextDouble();
        System.out.print("Altura: ");
        double alturaRetangulo = entrada.nextDouble();
        double areaRetangulo = baseRetangulo * alturaRetangulo;
        System.out.printf("Área do Retângulo: %.2f%n", areaRetangulo);

        // Cálculo da área do Triângulo
        System.out.println("\nDigite as dimensões do Triângulo:");
        System.out.print("Base: ");
        double baseTriangulo = entrada.nextDouble();
        System.out.print("Altura: ");
        double alturaTriangulo = entrada.nextDouble();
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.printf("Área do Triângulo: %.2f%n", areaTriangulo);

        // Cálculo da área do Círculo
        System.out.println("\nDigite o raio do Círculo:");
        double raioCirculo = entrada.nextDouble();
        double areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
        System.out.printf("Área do Círculo: %.2f%n", areaCirculo);

        // Cálculo da área do Trapézio
        System.out.println("\nDigite as dimensões do Trapézio:");
        System.out.print("Base maior: ");
        double baseMaiorTrapezio = entrada.nextDouble();
        System.out.print("Base menor: ");
        double baseMenorTrapezio = entrada.nextDouble();
        System.out.print("Altura: ");
        double alturaTrapezio = entrada.nextDouble();
        double areaTrapezio = ((baseMaiorTrapezio + baseMenorTrapezio) / 2) * alturaTrapezio;
        System.out.printf("Área do Trapézio: %.2f%n", areaTrapezio);

        entrada.close();
    }
}
