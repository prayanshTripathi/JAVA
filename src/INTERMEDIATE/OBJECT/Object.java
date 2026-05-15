package intermediate.object;

public class Object {
    public static void main(String[] args) {
        // Concepts Of Object


        /*
        # SIZE of object

        1. Header Size: (Object headers)
          Stores ABout Metadata Of object.
          > Mark Words (8 Bytes): Locks, Synchronization, Garbage Collection, etc.
          > Class Pointer (4/8 bytes): Stores Reference of class

        2. Exact Data
          Actual Data Stored in the class.
          > we have 4 variables of each 4 byte so the size came from 
            variables are 16 bytes.

        3. Padding (optional)
          Our CPU Generally works on chunks.
          So We Need to give Our Object The Total Memory, In Multiple of 8.
          because the CPU Takes 8 bytes at once to process.

          
        TOTAL SIZE:
        So our Total bytes from above 2 pointers will be:
            1. 12 bytes
            2. 16 bytes
            total = 28 bytes
            closest 8 multiple is 32, Then We Add 4 Bytes to the object as Padding.

        */


    }
}



class Student {
    String name; // 4 byte
    int age; // 4 byte
    int rollNum; // 4 byte
    String college; // 4 byte
}