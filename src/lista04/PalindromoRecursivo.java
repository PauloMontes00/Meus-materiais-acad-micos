package lista04;

public class PalindromoRecursivo
{
    public boolean palindromo(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return palindromo(s, i + 1, j - 1);
    }

    static void main(String[] args) {
        System.out.println(new PalindromoRecursivo().palindromo("dasd", 2, 2));
    }
}
