import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de carros vendidos no mês:");
        int numCarros = scanner.nextInt();

        System.out.println("Digite o valor total de vendas no mês:");
        double valorTotalVendas = scanner.nextDouble();

        System.out.println("Digite o salário fixo:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o valor fixo por carro vendido:");
        double valorFixoPorCarro = scanner.nextDouble();

        double[] input = { numCarros, valorTotalVendas, salarioFixo, valorFixoPorCarro };
        System.out.println("Salário total: " + salarioComComissao(input));
    }

    public static double salarioComComissao(double[] input) {
        int numCarros = (int) input[0];
        double valorTotalVendas = input[1];
        double salarioFixo = input[2];
        double valorFixoPorCarro = input[3];

        // Calcula a comissão como 5% do valor total de vendas
        double comissao = 0.05 * valorTotalVendas;

        // Adiciona a comissão fixa por carro vendido
        comissao += numCarros * valorFixoPorCarro;

        // Calcula o salário total
        double salarioTotal = salarioFixo + comissao;

        // Arredonda para duas casas decimais
        salarioTotal = Math.round(salarioTotal * 100.0) / 100.0;

        return salarioTotal;
    }
}