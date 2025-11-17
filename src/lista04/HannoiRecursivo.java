package lista04;

public class HannoiRecursivo
{
    public void hanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println(origem + " -> " + destino);
            return;
        }
        hanoi(n - 1, origem, auxiliar, destino);
        System.out.println(origem + " -> " + destino);
        hanoi(n - 1, auxiliar, destino, origem);
    }

    static void main(String[] args) {
        new HannoiRecursivo().hanoi(5, 'A', 'B', 'C');
    }
}
