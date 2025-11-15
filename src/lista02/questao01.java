package lista02;

import java.util.Scanner;

public class questao01 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int numero = sc.nextInt();

        numero = Math.abs(numero);

        int soma= 0;
        while (numero > 0) {
            soma += numero% 10;
            numero /= 10;
        }
        System.out.println("A soma dos digitos é: " + soma);
        sc.close();
    }
}
//Escreva um programa que calcule a soma de todos os dígitos de um número inteiro fornecido pelo usuário.