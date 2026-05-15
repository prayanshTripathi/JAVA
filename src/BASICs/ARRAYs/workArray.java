package basics.arrays;

public class workArray {
    public static void main(String[] args) {
        /*
        As We Know We have 2 types of datatype
        1. primitive datatypes - integers/floats/boolean/characters
        2. non-primitive datatypes - array/etc.


        In Programs We Have 2 Types Of Memory
        1. Stack - Here All Primitive datatype's value are stored. in simple way -> stores memory on compile time.
        2. Heap - Here all Non-primitive datatype's value are stored, in simple way -> stores dynamically allocaated memory

        # Integer 
        int x = 4;
        in stack stores made a variable name x with 4 bytes.


        # Array - Uses Heap
        int arr[] = new int [5]; // Only The Variable with the new keyword goes to heap 
        in heap -> array with size 5 is created. (on runtime).
        in stack -> created a variable name arr. (referance varibale)
        why reference variable ?
        ans - it doesn't directly hold the array, it points to that array presented in heap.
        arr[0] = 10; 
        arr[1] = 20; 
        .............
        .............
        .............// If int takes 4 bytes so each variable takes 4 bytes.
        1st elements base address -> 100
        2nd element address -> 104
        3rd element address -> 108, etc.

        // For Random Access We Can Create A Formula.

        arr[i] = base address + (datatype_size * i) --> Address Of asked variable 
        base address is stored in arr variable made on stack memory.

        just like that for array of different datatypes we can have the fomula too.
        long:
            arr[i] = base address + (8 * i) //long has 8 byte size.
        float:
            arr[i] = base address + (4 * i) // float has 4 bytes in a variable.
        

        // Important 
        As We Didn't talk About Size of the boolean variable.

        so according to the official JAVA Docs, the size of the boolean variable is not defined.
        they told that it depends upon JVM, of different platforms. (Hotspot(Oracle)/OpenJDK --> 1 bytes).
        Reason -> CPU genrally fetches the data on level of byte. so for the better CPU optimisation, the size of boolean variable is set to 1 bytes, for most of the JVMs.


        boolean arr[] = new int[5];
        base add. -> 100
        1st add. -> 100
        2nd add. -> 101
        3rd add. -> 102
        4th add. -> 103
        5th add. -> 104

        formula for Random Access:
            arr[i] = base address + (1 * i)
        
        // Array Index Out Of Bound (Exception)
        for this compiler check internally a condition. Looks similar to below code.
        if ((index < 0) || (index > arr.length)){
            throw " Array Index Out Of Bound ";
        }



        2-D Array: Array of arrays : We've an array of size 3, where each elements is itself an array of size 4.
        int arr[][] = new int[3][4];

        in stack, an arr variable exist which point to an array in heap of size 3.
        all 3 elements of the array in heap is a reference variable, each points to a new array of size 4.
        1st element of array(size 3) points to another array(Size 4).
        2nd element of array(size 3) points to another array(Size 4).
        3rd element of array(size 3) points to another array(Size 4).

        formula to find the address of a index in 2-D array
                      ___________ROW__________
        arr[i][j] --> [base_address + (4 * i)] = x(Base Address Of 2nd Array)
        COL --> [x + (4 * j)]








        // Strings: // Upto JDK 9 Strings are the Character Arrays, But Today's Not. Strings are complex from Char Array.
        String[] names = new string[3];

        in heap -> a refrence variable, names exist with 4 bytes. (Reference variable takes 4 byte of place)
        names variable from stack points to an array of size 3. each also stores a reference(Address) Where that string stored.
        so it comes on array, take the address, go on that address and fetch the string that was stored there.

        formula :
            names[i] --> [base_address + (4 * i)] -> datatype size set to 4 because it stores reference variable.
        .
        




        
        */
    }
}
