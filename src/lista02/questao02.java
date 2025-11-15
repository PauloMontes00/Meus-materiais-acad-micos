package lista02;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de N: (N é a quantidade de termos em uma sequência)");
        int n = sc.nextInt();

        n = Math.abs(n);
        int soma = n * (n + 1) / 2; ;

        System.out.println("A soma dos " + n + " primeiros números é: " + soma);
        sc.close();
    }
}
//Faça um programa que calcule a soma dos N primeiros termos da sequência, com N dado pelo usuário