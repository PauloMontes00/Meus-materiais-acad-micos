package lista04;

public class MenorValorVetor {
    public int menor(int[] v, int i) {
        if (i == v.length - 1) return v[i];
        int m = menor(v, i + 1);
        return v[i] < m ? v[i] : m;
    }


    static void main(String[] args) {
        System.out.println(new MenorValorVetor().menor(new int[] {1, 2, 3, 4, 5}, 0));
    }
}
