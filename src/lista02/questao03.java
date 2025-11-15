package lista02;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de N: (N é a quantidade de termos em uma sequência)");
        int n = sc.nextInt();

        n = Math.abs(n);
        double soma = 0.0;

        for (int i = 1; i <= n; ++i) {
            int denominador = 2 * i;
            double termo = 1.0 / denominador;
            soma += termo;
            System.out.println("Termo " + i + ": 1/" + denominador + " = " + termo + " (soma acumulada: " + soma + ")");
        }

        System.out.println("\nSoma total dos " + n + " primeiros termos: " + soma);
        sc.close();
    }
}
//Faça um programa que calcule a soma dos N primeiros termos da sequência, com N dado pelo usuário 1/2, 1/4, 1/6, 1/8, 1/10, ...
