package lista04;

public class Collatz {

    public int CollatzIterativo(int n){
        while (n!= 1){
            System.out.println(n);
            if (n%2==0){
                n = n/2;
            } else if (n%2!=0) {
                n = (n*3)+1;
            }
        }
        return n;
    }

    public int CollatzRecursivo(int n){
        if (n==1){
            return 1;
        }
        if (n % 2 == 0) {
            System.out.println(n);
            return CollatzRecursivo(n / 2);
        } else {
            System.out.println(n);
            return CollatzRecursivo((n * 3) + 1);
        }
    }
    static void main(String[] args) {
        System.out.println(new Collatz().CollatzIterativo(6));
        System.out.println("-".repeat(20)  + " Recursivo " + "-".repeat(20));
        System.out.println(new Collatz().CollatzRecursivo(6));
    }
}
