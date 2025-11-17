package lista04;

public class SomaDosDigitos
{
    public int somaDigitos(int n)
    {
        n = Math.abs(n);

        if (n < 10) {
            return n;
        }

        return (n % 10) + somaDigitos(n / 10);
    }

    static void main(String[] args) {
        System.out.println(new SomaDosDigitos().somaDigitos(5)); //Teste com a penas 1 digito
        System.out.println(new SomaDosDigitos().somaDigitos(15));
    }
}
