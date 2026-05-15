package basics.variables;

public class Var {
    public static void main(String[] args) {

        // Integers --> byte(1 byte), short(2 byte), int(4 byte), long(8 byte)
        // byte range -> -128 to 127
        // Number System - 
        // Binary (2), Octal(8), Decimal(10), Hexadecimal(16)
        // byte b = 10;
        // byte b = 0b101; // after 0b is all binary numbers
        // byte b = 05; // Octal (0-7), 5 exist under range, so we add 0 in front
        byte b = 0X5; // Hexadecimal (0-15) --> 0-9, 10->A, 11->B, 12->C, 13->D, 14->E, 15->F
        short c = 128;
        int d = 10000;
        // long e = 1_23_45_678; // for personal readablity we can use underscore, compiler ignores the underscore and print the literal without underscore.
        long e = 1235678;

        System.out.println("Integer Values --> " + b + " , " + c + " , " + d + " , " + e);


        // Real Numbers 
        // float f = 10.5_5; // Can Put Underscore '_' Between Two Numbers, underscore shouldn't share any shoulders with '.' or 'e'
        float f = 20.66f; // Single Precision // here f is required to store any literals into a float datatype in java, cause every decimal point number is taken as double in compilers.
        // double p = 20.1234; // Double Precision --> standard way
        double p = 6.022e23; // scientific way - 6.022 * 10^23

        System.out.println("Real/Floating Values  --> " + f + " , " + p);


        // Characters - 2 byte size
        char ch = 's'; // 'a' -> integer -> binary -> store

        System.out.println("Character --> " + ch); // binary -> integer -> convert to character(unicode)(if the datatype is char) -> print


        // Boolean 
        boolean bool = false;

        System.out.println("Boolean Value --> " + bool);



        // Above we are doing - declaring & defining at the same time. 
        // Keywords - Researved Words For A Programming Language, Which You Can't Able To Use Into Your Program As An Identifier.
        // There are total - 68 keywords
        // Some Words Which Also A Keyword (Researved) but Java Itself Didn't Use them, its a fact.
        // its a single line comment
        /*
        _______________________
        _______________________
        Its a MultiLine Comment
        _______________________
        _______________________
        
        */




    }
}