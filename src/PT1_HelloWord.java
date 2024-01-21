public class PT1_HelloWord {
    public static void main(String[] args) {

        // print é o print padrão apenas para string
        System.out.print("Hello, World!\n"); // %n equivalente ao \n, porém só funciona no printf
        // o \n é como se fosse um caracter, consegue até colocar como char

        char d = '\n';
        System.out.println(d-0); // printa o numero equivalente a esse caracter da tabela ASCII

        int a = 10;
        int b = 120;
        int c = a + b;


        System.out.println("O valor da operação é " + (a + b) + " reais!");
        System.out.println("O valor da operação é " + a + b + " reais!");
        System.out.println(a + b + " reais!");
        System.out.println("O valor da operação é " + c + " reais!"); // boa prática

        System.out.println("Hello, World!"); //ln -line

        // printf - formatted
        System.out.printf("Hello, %s\n", "World!");
        System.out.printf("Hello, %s%n", "World!"); // Priorizem o %n

        String nome = "Alice";
        int idade = 25;

        System.out.println("A " + nome + " tem " + idade + " anos de idade");
        System.out.printf("A %s tem %d anos de idade%n", nome, idade);

        /**
         *
         * %d - representa números inteiros
         * %f - representa números floats
         * %2f - representa números doubles
         * %b - representa valores booleanos
         * %c - representa valores char
         * %v -
         */
        System.out.println("-----------------------------");

        System.out.printf("%d %n", 1);
        System.out.printf("%d %n", 15/2); // operacao int x int = int | 1.5 x 1
        System.out.printf("%f %n", 1.5);
        // BigDecimal
        System.out.printf("%b %n", true);
        System.out.printf("%.4f %n", 7.51119999999);


    }
}
