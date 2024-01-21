public class PT3_Datatypes {

    public static void main(String[] args) {


        // JAVA É UMA LINGUAGEM FORTEMENTE TIPADA, OU SEJA, AS VARIÁVEIS PRECISAM TER SEU TIPO DEFINIDO NA CRIAÇÃO E APÓS SUA CRIAÇÃO O SEU TIPO NÃO MUDA

        // OUTRA LINGUAGEM INTERESSANTE PARA PESQUISA
        // SIMILAR AO JAVA - KOTLIN7
        // OUTRAS - GOLANG (GOOGLE)

        //%b bolean
        //%c char
        //%s string
        //%d int
        //%f double ou float
        //%n equivalente ao \n

        // var tem que ser criado já atribuindo um valor a ela, e pega o tipo disso pra ela
        // existe generics no java

        // Tipos primitivos: Tipos de dados fundamentais

        // 8 tipos primitivos

        //Inteiros
        byte numByte = 127; // 1 byte | -128 a 127
        short numShort = 2; // 2 bytes | -32.768 a 32.767
        int numInt = 3; // 4 bytes | -2.147.483.648 a 2.147.483.647
        long numLong = 4L; // 8 bytes | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long numLong2 = 400_000_000_000L;
        // byte só deve ser usado em vez de int quando a memória for muito baixa (exemplo a Apollo, ou sistema da geladeira)

        int idade; //padrao
        long valoresMaiores;

        System.out.println(numLong);
        System.out.println(numLong2);

        // mercadolivre usa long para numero do pedido, mas algumas empresas estão mudando para string, pois não é feita operação matemática
        // exemplo de empresa: mercado livre, outro exemplo: chave da nota fiscal, numero de inscrição estadual
        // geralmente armazena cpf como string
        // curso de Regex para validação dos dados quando usa como string

        String numPedido = "123991234567";

        // Números de ponto flutuante
        float numFloat = 1.5111111f; // 4 bytes | 6-7 dígitos decimais significativos
        double numDouble = 1.500000000000; // 8 bytes | 15 dígitos decimais significativos

        System.out.println(numFloat);

        /**
         *
         * O tipo double tem o dobro da precisão do tipo float.
         * Para tipos decimais, esse tipo, geralmente, é a escolha padrão.
         * Porém, ele nunca deve ser usado para representar valores exatos, como moedas.
         * Nesse caso, use BigDecimal.
         *
         */

        // Outros tipos primitivos
        boolean typeBoolean = true;
        boolean typeBoolean2 = false;

        char umLetraOuUmChar = 'a';
//        char umLetra2 = "a";
//        char umLetra3 = 'aa';

        System.out.println('A' - 0); // Desafio com numero dos chars

        // NÃO É UM TIPO PRIMITIVO
        String nome = "Um frase \"aqui\"";
        System.out.println(nome);

        double valor = 12.3;
        valor = 10; // pude alterar o valor

        final double PI = 3.14; // se coloco o final na frente, vira uma constante e não posso alterar, geralmente coloco em maiúsculo
        // para ser constante precisa definir o valor, não faz sentido dizer que é constante sem atribuir o valor junto

    }
}
