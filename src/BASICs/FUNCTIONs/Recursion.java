package BASICs.FUNCTIONs;

public class Recursion {
    public static void main(String[] args) {
        // Recursion, - Function  Calling Itself

        nToTen(5);
    }

    static void nToTen(int n){
        if (n == 0) return;
        nToTen(n-1);
        System.out.print(n + " ");
        
    }
}
