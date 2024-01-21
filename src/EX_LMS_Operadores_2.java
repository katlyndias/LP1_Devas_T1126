public class EX_LMS_Operadores_2 {

    public static void main(String[] args) {
        // Exemplo de uso
        double[] entrada1 = {1, 5.0, 2000.00};
        double resultado1 = calculoSalario(entrada1);
        System.out.println("Saída: " + resultado1);

        double[] entrada2 = {11, 4.5, 2500.00};
        double resultado2 = calculoSalario(entrada2);
        System.out.println("Saída: " + resultado2);
    }
    public static double calculoSalario(double[] input) {
        double tempoServico = input[0];
        double inflacao = input[1];
        double salario = input[2];

        double percentualReajuste = 0.0;

        // Calcula o percentual de reajuste com base no tempo de serviço
        if (tempoServico >= 1 && tempoServico < 5) {
            percentualReajuste += 1.0;
        } else if (tempoServico >= 5 && tempoServico < 10) {
            percentualReajuste += 1.5;
        } else if (tempoServico >= 10) {
            percentualReajuste += 2.0 * inflacao / 100.0;
        }

        // Adiciona o percentual da inflação ao percentual de reajuste
        percentualReajuste += inflacao;

        // Calcula o novo salário
        double novoSalario = salario * (1 + percentualReajuste / 100.0);

        // Arredonda o resultado para duas casas decimais
        novoSalario = Math.round(novoSalario * 100.0) / 100.0;

        return novoSalario;
    }
}
