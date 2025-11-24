package lista02;

import java.util.Scanner;

public class questao06 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("É necessário pelo menos 2 números.");
            return;
        }

        int[] numeros = new int[n];

        System.out.println("Digite os " + n + " números:");

        for (int i = 0; i < n; i++) {
            numeros[i] = sc.nextInt();
        }

        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int valor = numeros[i];

            if (valor > maior) {
                segundoMaior = maior;
                maior = valor;
            } else if (valor > segundoMaior && valor != maior) {
                segundoMaior = valor;
            }
        }

        System.out.println("O segundo maior número é: " + segundoMaior);

        sc.close();
    }
}
