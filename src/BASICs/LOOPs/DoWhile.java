package BASICs.LOOPs;

public class DoWhile {
    public static void main(String[] args) {
        //Loops In Java
        // do-while Loop
        /*
        syntax -
        do {
           // code
           // increment/decrement/nothing
        } while (expression); 
        */


        int i = 1;
        do { 
            System.out.println(i);
            i++;
        } while (i <= 10);


        // do-while loop also have some specific use cases like - game menu selection.
        /*
            1. Play Game
            2. Return saved Game
            3. Exit
        */
    }
}
