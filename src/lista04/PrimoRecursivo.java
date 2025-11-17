package lista04;
public class PrimoRecursivo {
    public static boolean ehPrimoRecursivo(int n) {
        if (n <= 1) {
            return false;
        }
        return verificarDivisor(n, 2);
    }

    private static boolean verificarDivisor(int n, int divisor) {
        if (divisor * divisor > n) {
            return true;
        }

        if (n % divisor == 0) {
            return false;
        }

        return verificarDivisor(n, divisor + 1);
    }

    static void main(String[] args) {
        System.out.println(ehPrimoRecursivo(5));
    }
}
