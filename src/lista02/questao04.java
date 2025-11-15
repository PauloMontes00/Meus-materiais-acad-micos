package lista02;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de A:");
        int a = sc.nextInt();

        int n = 40;

        double soma = 0;

        for (int i = 1; i <= n; ++i) {
            double denominador = 3 * Math.pow(2, i - 1);
            double termo = (7.0 * a) / denominador;
            soma += termo;
            System.out.println("Termo " + i + ": 7×" + a + "/" + denominador + " = " + termo + " (soma acumulada: " + soma + ")\n");
        }

        System.out.println("\nSoma total dos " + n + " primeiros termos: " + soma);
        sc.close();
    }
}
// Faça um programa que calcule a soma dos 40 primeiros termos da sequência, com A dado pelo usuário: