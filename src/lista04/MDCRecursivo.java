package lista04;

public class MDCRecursivo {
    public int mdc(int a, int b) {
        if (b == 0) return a;
        return mdc(b, a % b);
    }

    static void main(String[] args) {
        System.out.println(new MDCRecursivo().mdc(2, 5));
    }
}
