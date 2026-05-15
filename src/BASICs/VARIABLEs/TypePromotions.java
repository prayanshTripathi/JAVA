package basics.variables;

public class TypePromotions {
    public static void main(String[] args) {
        // Automatic Type Promotions
        byte a = 50; // Byte -> -128 to 127
        byte p = 40;
        byte q = 100;

        int w = (a*p)/q;
        // Byte is auto converted into 'int' for performing some operations on it

        byte B = 50;
        B = (byte) (B*2); //Here the final result is come in 'int', but as we see the result will be 100, which can be stored in byte so we use explicit type casting

        /*
        Rules Of Type Promotion: 
        - byte, short and char values are promoted to int (for operational tasks)
        - If one operand (Variable) is long, the Whole Expression will Become Long
        - If one operand (Variable) is Float, the Whole Expression will Become Float
        - If one Operand is Double,  Entire Result Will Come In Double
        */


        // For Better Practice
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * s);

        // f * b --> float
        // i / c --> int
        // d * s --> double

        // float + int --> float - double --> double;

        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("Result = " + result);


    }
}
