package basics.loops;

public class While {
    public static void main(String[] args) {
        // Loops In Java
        // While Loop 
        /*
        syntax -
        int i = 0; // looping variable
        while (expression){
         
           // Code
           i++ // increment/decrement/nothing.
        } 
        */

        int i = 11;
        while (i-- > 1) {  // if the output of the expression is always the same then, the loop runs infinitly.
            System.out.println(i); // this println, also do next line after writting anything.
            
        }
    }
}
