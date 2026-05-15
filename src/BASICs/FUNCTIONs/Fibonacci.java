package basics.functions;

public class Fibonacci {
    public static void main(String[] args) {
        // Fibonacci Series - 1 1 2 3 5 8 13 21 ..........

        int a = 7;

        System.out.println(fib(a));

    }

    static int fib(int n){
        if (n == 0 || n ==1) return 1;
        int x = fib(n-1);
        int y = fib(n-2);
        return (x+y);
    }
}
