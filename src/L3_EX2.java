//Crie a função converterTemperatura(...), onde você deve
//receber a temperatura atual, a medida atual e a medida final.
//Após a conversão mostrar na tela o resultado final.
//Ex:
//Temperatura atual = 100
//Medida atual = celsius
//Medida final = kelvin
//        Output = 373,15


import java.util.Scanner;

public class L3_EX2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem-vindo (a) à calculadora de conversão de temperaturas!");
        System.out.print("Digite a temperatura que deseja converter: ");
        double temperatura = entrada.nextDouble();
        System.out.println("Em qual medida está a temperatura?");
        System.out.print("1 para Celsius ou 2 para Kelvin: ");
        int medida = entrada.nextInt();
        if ((medida == 1) || (medida == 2)){
            converterTemperatura(temperatura,medida);
        } else {
            System.out.println("Medida inválida!");
        }
    }

    public static void converterTemperatura (double temperatura, int medida){
        if (medida == 1){
            double temperaturaConvertida = temperatura + 273.15;
            System.out.printf("Temperatura atual: %.2f%nMedida atual: Celsius%nMedida final: Kelvin%nOutput = %.2f", temperatura, temperaturaConvertida);
        } else { // se medida igual a 2
            double temperaturaConvertida = temperatura - 273.15;
            System.out.printf("Temperatura atual: %.2f%n Medida atual: Kelvin%n Medida final: Celsius%n Output = %.2f", temperatura, temperaturaConvertida);
        }
    }

}
