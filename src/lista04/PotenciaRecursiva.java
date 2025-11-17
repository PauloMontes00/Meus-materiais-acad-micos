package lista04;

public class PotenciaRecursiva
{
    public int potencia(int base, int expoente) {
        if (expoente == 0) return 1;
        return base * potencia(base, expoente - 1);
    }

    static void main(String[] args) {
        System.out.println(new PotenciaRecursiva().potencia(2, 5));
    }
}
