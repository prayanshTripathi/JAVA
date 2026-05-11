package BASICs.LOOPs;

public class For {
    public static void main(String[] args) {
        //Loops in JAVA
        // for loop

        // 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        /*
            FLow of control of for
            1. First assignment statement is executed (Variable definition).
            2. Then second conditional statement is evaluated. (True / false)
            3. If true, control flow will evaluate the body of the loop
            4. Once loop body is finished, control flow will go back to the for statement, and ithird increment
            statement will be evaluated.
            5. Again, conditional statement is evaluated.
            6. Repeat 2 - 5.
        */

        // 10 to 1
        for(int i = 10; i >= 1; i -- ) { // boolean -- > true / false
            System.out.println(i);
        }


        // int i = 10;
        // for (; ;) { // We Can Keep the for loop empty. by result it will be a infinit loop.
        //     // body also can be vacant.
        // }

        // Comma Seperated variation
        for (int i = 0, j = 10; i <= 10 && j >= 10; i++, j--) {
            System.out.println(i*j);
        }


        // boolean b = true
        // for (i = 1; b == true; i++) {
        //     if (condition) {
        //         b = false;
        //     }
        // }



        // Nested Loop
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " , " + j);
            }
        }






        // for-each loop 
        // will learn in array.
    }
}
