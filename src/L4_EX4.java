//Eleições (Utilize o Map<K, V>) - Faça um programa que
//recebe o nome de 3 candidatos e inicia uma votação (10 votos).
//        Para votar, o eleitor deve escrever o nome do candidato. Caso o
//eleitor vote em um nome que não existe, deverá ser
//contabilizado um voto nulo. Ao final da votação, mostre o
//vencedor da eleição com a porcentagem

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L4_EX4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Criação do mapa para armazenar os votos dos candidatos
        Map<String, Integer> votos = new HashMap<>();

        // Adição dos candidatos
        System.out.println("Informe os nomes dos 3 candidatos:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Candidato " + (i + 1) + ": ");
            String candidato = entrada.nextLine();
            votos.put(candidato, 0);
        }

        // Início da votação
        System.out.println();
        System.out.println("Votação iniciada (10 votos):");
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do candidato (ou 'nulo' para voto nulo): ");
            String voto = entrada.nextLine();

            // Verifica se o nome do candidato existe no mapa
            if (votos.containsKey(voto)) {
                // Incrementa o número de votos para o candidato
                votos.put(voto, votos.get(voto) + 1);
            } else {
                // Caso o nome não exista, contabiliza um voto nulo
                System.out.println("Voto nulo!");
            }
        }

        // Calcula o vencedor
        String vencedor = "";
        int maiorNumeroVotos = 0;
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            if (entry.getValue() > maiorNumeroVotos) {
                vencedor = entry.getKey();
                maiorNumeroVotos = entry.getValue();
            }
        }

        // Mostra o vencedor e a porcentagem
        System.out.println("\nResultado da eleição:");
        System.out.println("Vencedor: " + vencedor);
        double porcentagem = (maiorNumeroVotos / 10.0) * 100;
        System.out.println("Porcentagem de votos: " + porcentagem + "%");

        entrada.close();
    }
}
