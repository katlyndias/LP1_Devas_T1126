public class PT4_Operadores {
    public static void main(String[] args) {
        //Aritméticos: soma (+), subtracao (-), multiplicacao (*) e divisao (/);

        //+
        // Ex:
        // 1 - Numero + Numero = Soma
        // -> 1 + 2 = 3

        // 2 - Numero + String = Concatena
        // -> "a" + 2 = "a2"

        int a = 2;
        int b = 2;

        int c = a + b;
        System.out.println("Soma: " + c);

        c = a - b;
        c = a / b;
        c = a * b;

        // Lógicos: negação (!), E (&&), OU (||) // duplo pipe

        boolean isSomething = true;
        System.out.println(isSomething);
        System.out.println(!isSomething);

        // tática: 1 é verdadeiro, 0 é falso
        System.out.println(true && true); // true, 1 * 1 = 1
        System.out.println(true && false); // false 1 * 0 = 0
        System.out.println(false && false); // false 0 * 0 = 0

        System.out.println(true || true); // true, 1 + 1 = 1
        System.out.println(true || false); // true 1 + 0 = 1
        System.out.println(false || false); // false 0 + 0 = 0

        // Relacionais: maior que (>), menor que (<), igual (==), diferente (!=)
        // >= e <=

        System.out.println("Relacionais");
        System.out.println(2 > 1);
        System.out.println(2 < 1);
        System.out.println(2 == 2);
        System.out.println(2 != 1);
        System.out.println(2 >= 2);
        System.out.println(2 <= 2);

        // Um operador aritmético especial
        // %

        int resultado = 3 % 2;
        System.out.println(resultado);

        String nome = "Katlyn";
        System.out.println("Katlyn" == nome); // consegue comparar mas pode gerar problema, ele pode mostrar depois das 22h
        System.out.println("Katlyn".equals(nome)); // para comparar objeto (string é um objeto)


        // Incremento ++ e drecremento --
        System.out.println("Incremento e decremento");
        int num = 1;
        System.out.println(num);
        System.out.println(num++); // printa primeiro e depois incrementa

        num = 1; // para voltar
        System.out.println(++num); // incrementa primeiro e printa depois incrementado
        System.out.println(num);

        num = 1; // para voltar
        num++; // incrementa
        System.out.println(num); // printa incrementado

        //para o loop for não tem diferença colocar antes ou depois

        int num2 = 10;
        num2--;
        System.out.println(num2);
        // int num3 = num ++ + 1 num2--; bizarrice, não fazer isso, faça tudo fora!




    }
}
