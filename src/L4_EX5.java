//(leetcode - 724. Find Pivot Index) Dada uma matriz de
//        números inteiros, calcule o índice pivô dessa matriz. O índice
//pivô é o índice onde a soma de todos os números estritamente à
//esquerda do índice é igual à soma de todos os números
//estritamente à direita do índice. Se o índice estiver na borda
//esquerda da matriz, a soma esquerda será 0 porque não há
//elementos à esquerda. Isso também se aplica à borda direita da
//matriz. Retorna o índice de pivô mais à esquerda. Se tal índice
//        não existir, retorne -1.
//        (https://leetcode.com/problems/find-pivot-index/)


public class L4_EX5 {
    public static void main(String[] args) {
        int[] matriz = {1, 7, 3, 6, 5, 6};
        int indicePivo = encontrarIndicePivo(matriz);

        if (indicePivo != -1) {
            System.out.println("O índice pivô é: " + indicePivo);
        } else {
            System.out.println("Não há índice pivô na matriz.");
        }
    }
    public static int encontrarIndicePivo(int[] matriz) {
        int somaTotal = 0;
        int somaEsquerda = 0;

        // Calcular a soma total da matriz
        for (int num : matriz) {
            somaTotal += num;
        }

        // Iterar sobre a matriz para encontrar o índice pivô
        for (int i = 0; i < matriz.length; i++) {
            // A soma à direita é igual à soma total menos a soma à esquerda e o número atual
            int somaDireita = somaTotal - somaEsquerda - matriz[i];

            // Verificar se a soma à esquerda é igual à soma à direita
            if (somaEsquerda == somaDireita) {
                return i; // Índice pivô encontrado
            }

            // Atualizar a soma à esquerda para incluir o número atual
            somaEsquerda += matriz[i];
        }

        // Não há índice pivô encontrado
        return -1;
    }

}
