package BASICs.VARIABLEs;

public class TypeConversions {

    public static void main(String[] args) {
            /*
        DataTypes - 
        
        - Integer (byte/short/int/long)
        - Real (float/double)
        - Character (char)
        - Boolean (Boolean)



        Type Conversion In Java:

        1. Implicit (Widining Conversion)- Compiler Do By Default
        2. Explicit (Narrowing Conversion)- The Dev Needs To Do

        Rules For Implicit Conversion:
        - The Destination Variable Have Big Space Than Source.                                                 */
        byte b = 10;
        int a = b;
        System.out.println(a);

        // Explicit Convertion (TypeCasting)
        // - We Use When We Have More Space In Source Variable Than Destination Variable. It Can Cause Original Data Loss.
        // b = a; // error : incompatible types: possible lossy conversion from int to byte. Type mismatch: cannot convert from int to byteJava
        b = (byte)a;
        System.out.println(b);

        a = 300;
        b = (byte)a; // Truncating Conversion
        System.out.println(b); // Data Truced. Data Was Split And First 8 Bit Data Shows Number 44.


        char c = 'a'; //char = 16 bit
        int i = c; // int = 32 bit // Implicit
        System.out.println(i);


        float f = 12.98f; // float = 32 bit
        int q = (int)f; // int = 32 bit  //Explicit
        System.out.println(q);



    
        // Boolean Is Not Able To Convert in any data type.
        // Its Syntaxly Incorrect
        // Conversions Are Done Here 
    }
}