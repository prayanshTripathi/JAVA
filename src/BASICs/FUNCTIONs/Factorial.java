package BASICs.FUNCTIONs;

public class Factorial {
    public static void main(String[] args) {
        // Factorial Using Recursion
        int a = 5;
        System.out.println(fact(a));
    }

    static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }
}