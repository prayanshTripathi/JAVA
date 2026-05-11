package BASICs.CONDITIONALs;

public class oddEvenifElse {
    public static void main(String[] args) {
        // Odd or Even Checking... Using if-else
        // it only checks one condition and if it return false it will fallback to else block.
        // it can be used if the case have only two available outputs or sub-cases.
        int i = 10;

        if ((i & 2) == 0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }



    }
}
