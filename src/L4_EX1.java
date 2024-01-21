//Dado duas arrays A e B, escreva uma função que faça a
//concatenação das arrays de forma alternada. Obs: Ambas as
//arrays sempre serão do mesmo tamanho e não nulas.
//        Exemplo 01:
//A: [1, 2, 3, 4]
//B: [5, 6, 7, 8]
//Output: [1, 5, 2, 6, 3, 7, 4, 8]
//Exemplo 02:
//A: [1, 3, 5, 7]
//B: [2, 4, 6, 8]
//Output: [1, 2, 3, 4, 5, 6, 7, 8]


public class L4_EX1 {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4};
        int[] B1 = {5, 6, 7, 8};
        int[] result1 = concatenacaoAlternada(A1, B1);
        imprimirArray(result1);

        int[] A2 = {1, 3, 5, 7};
        int[] B2 = {2, 4, 6, 8};
        int[] result2 = concatenacaoAlternada(A2, B2);
        imprimirArray(result2);

    }

    public static int[] concatenacaoAlternada(int[] A, int[] B) {
        int tamanho = A.length * 2;
        int[] resultado = new int[tamanho];

        int indiceResultado = 0;
        for (int i = 0; i < A.length; i++) {
            resultado[indiceResultado++] = A[i];
            resultado[indiceResultado++] = B[i];
        }

        return resultado;
    }

    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
