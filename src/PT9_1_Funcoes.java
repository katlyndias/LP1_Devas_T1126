public class PT9_1_Funcoes {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        operacao(a, b, "soma");
        operacao(10,2,"div");

        soma(5,5);



        //posso usar um método dentro do outro, por ex, usar o método soma dentro de operação

        int resultado = operacaoComRetorno(5,10,"mult");

        soma(1,2);
        soma(3,5);

        somaComRetorno(1,2,3);

        divisaoComRetorno(1,0);

    }

    // Modificadores
    // public - todas as classes podem acessar
    // private - apenas a classe que declarou o metodo pode utilizar

    // Tipo de retorno
    // void não tem retorno (return)
    // return em metodo void serve para parar a execucao quando você quiser que não continue
    // o que tem após o return não é executado

    public static void soma(int a, int b){
        System.out.println(a + b);
    }

    public static void subtracao(int a, int b){
        System.out.println(a - b);
    }

    public static void multiplicacao(int a, int b){
        System.out.println(a * b);
    }

    public static void divisao(int a, int b){
        System.out.println(a / b);
    }


    public static void operacao(int a, int b, String op) {
        if(op.equals("soma")){
            soma(a,b); // funcao dentro da outra
        } else if (op.equals("sub")){
            System.out.println(a - b);
        } else if (op.equals("div")){
            System.out.println(a / b);
        } else if (op.equals("mult")){
            System.out.println(a * b);
        } else {
            System.out.println("Operação inválida");
        }
    }

    public static int operacaoComRetorno(int a, int b, String op) {
        if(op.equals("soma")){
            return a +b; // funcao dentro da outra
        } else if (op.equals("sub")){
            return a - b;
        } else if (op.equals("div")){
            return a / b;
        } else if (op.equals("mult")){
            return a * b;
        } else {
            return -1;
        }
    }

    public static int somaComRetorno(int a, int b, int c){
        System.out.println("Você está executando três valores, são eles:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int resultado = a + b + c;
        System.out.println("O resultado é: " + resultado);
          return resultado;
    }

    public static double divisaoComRetorno(double num1, double num2){
        System.out.println("Você está dividindo dois valores, são eles:");
        System.out.println(num1);
        System.out.println(num2);

        double result;
        if(num2 == 0.0){
            System.out.println("Divisão por zero é inválida!");
            return -1; // No futuro não colocaremos -1, faremos um exception: throw new Exception("Divisão inválida!").
        } else {
            result = num1/num2;
            System.out.println("Divisão realizada com sucesso!");
            return result;
        }


    }

    // estutura de uma funcao
    // [modificador acesso (exemplo: public - private)] tipo_de_retorno nome_do_metodo(argumentos){
    // }


}
