//(leetcode) Dado um array nums. Definimos uma soma acumulada de um array como nums[i] =
//soma(nums[0]…nums[i]), ou seja, cada elemento deve ser a soma de todos os elementos anteriores e o atual.
//Por fim, retorne a array com as somas.
//Exemplo 01:
//nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explicação: A soma acumulada é obtida da seguinte forma: [1, 1+2, 1+2+3, 1+2+3+4].
//Exemplo 02:
//nums = [1,1,1,1,1]
//Output: [1,2,3,4,5]
//Explicação: A soma acumulada é obtida da seguinte forma: [1,1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

public class L4_EX3 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] resultado1 = calcularSomaAcumulada(nums1);
        System.out.print("Output 1: [");
        for (int i = 0; i < resultado1.length; i++) {
            System.out.print(resultado1[i]);
            if (i < resultado1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] nums2 = {1, 1, 1, 1, 1};
        int[] resultado2 = calcularSomaAcumulada(nums2);
        System.out.print("Output 2: [");
        for (int i = 0; i < resultado2.length; i++) {
            System.out.print(resultado2[i]);
            if (i < resultado2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] calcularSomaAcumulada(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] resultado = new int[n];

        resultado[0] = nums[0];
        for (int i = 1; i < n; i++) {
            resultado[i] = resultado[i - 1] + nums[i];
        }

        return resultado;
    }
}
