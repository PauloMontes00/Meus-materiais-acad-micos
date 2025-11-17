package lista04;

public class SomaDeVetorRecursivo
{
    public int somaVetor(int[] v, int i) {
        if (i == v.length) return 0;
        return v[i] + somaVetor(v, i + 1);
    }

    static void main(String[] args)
    {
        System.out.println(new SomaDeVetorRecursivo().somaVetor(new int[] {1, 2, 3, 4, 5}, 0));
    }
}
