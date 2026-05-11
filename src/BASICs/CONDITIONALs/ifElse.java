package BASICs.CONDITIONALs;

public class ifElse {
    public static void main(String[] args) {
        // Selection Statements
        // if-else 
        // it only checks one condition and if it return false it will fallback to else block.
        // it can be used if the case have only two available outputs or sub-cases.
        

        int i = 6;

        if (i == 5){
            System.out.println("i is 5");
        }
        else {
            System.out.println("i is " + i);
        }


        

        // Nested ifs
        if (i>5) {
            if (i<10) {
                System.out.println("i possible values - 6, 7, 8, 9");
            }
            else {
                System.out.println("i possible value is 10, 11, ....");
            }
        }
        else {
            System.out.println("i possible value is 5, 4, 3, ....");
        }

        // Avoiding Nested if-else by using and/or operators.
        if ((i>5) && (i<10)) {
            System.out.println("i possible values - 6, 7, 8, 9");
        }
        else {
            System.out.println("i possible value is 5, 4, 3, ....");
        }



        int a = 14;
        // if-else-if ladder
        if (a == 10) {
            System.out.println("a is 10");
        }
        else if (a == 11) {
            System.out.println("a is 11");
        }
        else if (a == 12) {
            System.out.println("a is 12");
        }
        else if (a == 13) {
            System.out.println("a is 13");
        }
        else if (a == 14) {
            System.out.println("a is 14");
        }
        else if (a == 15) {
            System.out.println("a is 15");
        }
        else {
            System.out.println("a is " + a);
        }




        // if-else Is Done

    }
}
