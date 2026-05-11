package BASICs.CONDITIONALs;

public class Switch {
    public static void main(String[] args) {
        // Conditional Statement
        // Switch statement
        

        char grade = 'C';

        switch (grade) { // switch(expression) --> byte, short, int, char, enumeration
            
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            case 'E':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }
        // switch --> Limited use case --> should evaluate to byte, short, int, char, Enumeration
        // No duplicate cases allowed
        // After JDK7, string can also be used as switch expression.
        // After JDK-14,  switch is enhanced too much.





        
        /*
        // switch VS if-else-if

        1. switch can only test equality but if-else-if can test both equality and unequality.
        2. switch is more efficient than if-else-if ladder.
        3. Time Complexity of switch is O(1), Whether if-else-if have O(n)
        4. switch uses jump table formed by compiler internally, to acces the suitable case by jumping on it directly. Similar to the array's like random access.
        5. jump-tables are also not efficient everytime.
        6. jump table are two types. 
            a. Table-switch:
                - make a arraay like structure for each case. 
                - Normally used in the cases are dense, example - case 1,case 2, case 3, etc.
                - can access randomly.
                - time-complexity: O(1)
            b. Lookup-switch:
                - also make a array like structure, but only for cases directly.
                - Used if the cases are no densed, example - case 1, case 100, case 1000, etc.
                - uses Binary Search.
                - time-complexity: O(log n)
        7. We can use switch in nested form.
        */

        // switch Statement Is done.


    }
}
