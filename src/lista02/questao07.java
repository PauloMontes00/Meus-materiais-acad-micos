package lista02;

import java.util.Arrays;
import java.util.Scanner;

public class questao07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos nomes deseja inserir? ");
        int n = sc.nextInt();
        sc.nextLine(); // limpar buffer

        String[] nomes = new String[n];

        System.out.println("Digite os " + n + " nomes:");

        for (int i = 0; i < n; i++) {
            nomes[i] = sc.nextLine();
        }

        // Ordenar em ordem alfabetica
        Arrays.sort(nomes);

        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        sc.close();
    }
}
