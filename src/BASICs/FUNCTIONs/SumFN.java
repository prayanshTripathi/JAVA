package BASICs.FUNCTIONs;

public class SumFN {
    public static void main(String[] args) {
        int i = 9, j = 17;
        int result = sum(i, j); // Function Calling,      Here i & j Are Arguments
        System.out.println(result);
    }

    static int sum(int a, int b){ // Function Declaration & Definition,         Here a & b Are Parameters
        int result = a + b;
        return result;
    }
}
