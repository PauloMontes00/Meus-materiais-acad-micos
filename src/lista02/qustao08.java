package lista02;
import java.util.Scanner;
public class qustao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String binario = sc.nextLine();

        int decimal = 0;
        int potencia = 1; // representa 2^0


        for (int i = binario.length() - 1; i >= 0; i--) {
            char bit = binario.charAt(i);

            if (bit == '1') {
                decimal += potencia;
            } else if (bit != '0') {
                System.out.println("Entrada inválida! Use apenas 0 e 1.");
                return;
            }

            potencia *= 2; // avança a potência de 2
        }
        System.out.println("O valor decimal é: " + decimal);
        sc.close();
    }
}
