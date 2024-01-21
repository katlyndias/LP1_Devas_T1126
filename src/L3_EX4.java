//Escreva uma função que recebe o nome de um funcionário, seu
//número de horas trabalhadas por mês, o valor da hora e calcula
//o salário anual desse funcionário. (Mostre o valor com 2 casas
//decimais após o ponto)


import java.util.Scanner;

public class L3_EX4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem-vindo (a) à calculadora de salário!");
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = entrada.nextLine();
        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = entrada.nextDouble();
        System.out.print("Digite o valor da hora: ");
            double valorDaHora = entrada.nextDouble();
        if (horasTrabalhadas < 0){
            System.out.println("Número inválido de horas trabalhadas;");
        } else {
            calcularSalario(nomeFuncionario, horasTrabalhadas, valorDaHora);
        }
    }
    public static void calcularSalario(String nomeFuncionario, double horasTrabalhadas, double valorDaHora){
        double salario = horasTrabalhadas * valorDaHora;
        System.out.printf("O salário de %s é R$ %.2f", nomeFuncionario, salario);
    }

}
