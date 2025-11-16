package lista02;

public class questao05 {
    public static void main(String[] args) {

        double piAtual = 0.0;
        double piAnterior = 0.0;
        double termo = 1.0;
        int sinal = 1; // alterna entre +1 e -1
        double limite = 0.00000000005;

        int i = 1; // denominador inicial

        do {
            piAnterior = piAtual;

            // soma o termo atual
            piAtual += sinal * (4.0 / i);

            // alterna o sinal
            sinal *= -1;

            // próximo denominador
            i += 2;

        } while (Math.abs(piAtual - piAnterior) > limite);

        System.out.println("Valor aproximado de PI = " + piAtual);
    }
}
