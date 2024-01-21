//Suponha que precisamos trabalhar em um projeto da NASA que pretende lançar um novo satélite.
//A economia de memória é muito importante nessa missão, pois vamos ter uma quantidade de memória limitada.
//Vamos trabalhar em 3 módulos e não podemos ultrapassar o limite de memória de cada módulo.
//Ao iniciar o programa o operador deve digitar os dados da missão para que armazene todos os dados em cada um dos módulos
//e no final deve ser printado todos os valores por ele escolhidos.
//
//
//Móludo 01 - Controle de tempo x funcionários:
//Memória disponível: 3 bytes
//Requisitos: Armazenar o ano atual da missão (max 9999), quantidade de funcionários envolvidos (max 100).
//Móludo 02 - Controle de distância x velocidade:
//Memória disponível: 6 bytes
//Requisitos: Armazenar distancia que o satélite ficará da terra (max 2 milhões), velocidade máxima (max 30.000 km/h)
//Móludo 03 - Status da missão:
//Memória disponível: 17 bytes
//Requisitos: Armazenar o estado da missão (se já iniciou ou não), distância que será percorrida durante a missão em km (max 3 bilhões de km)
//e calibragem das antenas (número racional com precisão de no mínimo 14 casa decimais).

import java.util.Scanner;

public class L1_EX3 {
    public static void main(String[] args) {

//        byte 1 byte | -128 a 127
//        short 2 bytes | -32.768 a 32.767
//        int  4 bytes | -2.147.483.648 a 2.147.483.647
//        long 8 bytes | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
//        float 4 bytes | 6-7 dígitos decimais significativos
//        double 8 bytes | 15 dígitos decimais significativos
//        char | 2 bytes | um caracter
//        boolean: possui normalmente 1 bit de informação, pois depende da arquitetura de computador;

        System.out.println("Bem vindo ao programa da missão de lançamento de satélite");
        System.out.println();

        Scanner entrada = new Scanner(System.in);

        // Módulo 1 - 3 bytes (ano e quantidade de funcionarios)
        System.out.println("Módulo 1");
        System.out.print("Ano atual da missão: ");
        short anoAtualMissao = entrada.nextShort(); // 2 bytes
        System.out.print("Quantidade de Funcionários envolvidos: ");
        byte qtdeFuncionarios = entrada.nextByte(); // 1 byte

        System.out.println();

        // Módulo 2 - 6 bytes (distância e velocidade)
        System.out.println("Módulo 2");
        System.out.print("Distância que o satélite ficará da terra: ");
        int distancia = entrada.nextInt(); // 4 bytes
        System.out.print("Velocidade máxima: ");
        short velocidade = entrada.nextShort(); // 2 bytes

        System.out.println();

        // Módulo 3 - status da missao, distancia, calibragem antenas (17 bytes)
        System.out.println("Módulo 3");
        System.out.print("A missão já foi iniciada? Digite \"true\" para sim e \"false\" para não: ");
        boolean status = entrada.nextBoolean(); // comporta em 1 byte
        System.out.print("Por gentileza, digite a distância que será percorrida durante a missão em km: ");
        long distanciaPercorrida = entrada.nextLong(); // 8 bytes
        System.out.print("Por gentileza, digite a calibragem das antenas: ");
        double calibragemDasAntenas = entrada.nextDouble(); //8 bytes

        System.out.println("Os valores escolhidos são: ");
        System.out.println("Módulo 1:");
        System.out.println("Ano atual da missão: " + anoAtualMissao);
        System.out.println("Quantidade de funcionários envolvidos: " + qtdeFuncionarios);

        System.out.println();

        System.out.println("Módulo 2:");
        System.out.println("Velocidade máxima: " + velocidade + " km/h");
        System.out.println("Distância que o satélite ficará da terra: " + distancia + " km");

        System.out.println();

        System.out.println("Módulo 3:");
        System.out.println("Status da missão: " + status);
        System.out.println("Distância que será percorrida durante a missão: " + distanciaPercorrida + " km");
        System.out.println("Calibragem das antenas: " + calibragemDasAntenas);

        entrada.close();
    }
}
