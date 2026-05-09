package BASICs.DATATYPEs;

public class Bitwise {
    public static void main(String[] args) {
        // Bitwise Operators 
        // &, |, ^, ~, >>, <<, >>>, &=, |=, ^=, >>=, <<= >>>=

        int a = 5;      // 0101
        int b = 3;      // 0011

        // 1. AND (&) - Both bits must be 1
        int andResult = a & b;
        System.out.println("a & b = " + a + " & " + b + " = " + andResult);  // 0101 & 0011 = 0001 = 1

        // 2. OR (|) - At least one bit must be 1
        int orResult = a | b;
        System.out.println("a | b = " + a + " | " + b + " = " + orResult);   // 0101 | 0011 = 0111 = 7

        // 3. XOR (^) - Bits must be different
        int xorResult = a ^ b;
        System.out.println("a ^ b = " + a + " ^ " + b + " = " + xorResult); // 0101 ^ 0011 = 0110 = 6

        // 4. NOT (~) - Invert all bits
        int notResult = ~a;
        System.out.println("~a = ~" + a + " = " + notResult);               // ~0101 = ...1010 (two's complement)



        // 5. Left Shift (<<) - Shift bits left, fill with 0
        int leftShiftResult = a << 1;
        System.out.println("a << 1 = " + a + " << 1 = " + leftShiftResult); // 0101 << 1 = 1010 = 10

        // 6. Right Shift (>>) - Shift bits right, fill with sign bit
        int rightShiftResult = a >> 1;
        System.out.println("a >> 1 = " + a + " >> 1 = " + rightShiftResult); // 0101 >> 1 = 0010 = 2

        // 7. Unsigned Right Shift (>>>) - Shift bits right, fill with 0
        int unsignedRightShiftResult = a >>> 1;
        System.out.println("a >>> 1 = " + a + " >>> 1 = " + unsignedRightShiftResult); // 0101 >>> 1 = 0010 = 2

        System.out.println("\n--- Assignment Operators ---\n");



        // 8. AND Assignment (&=)
        int x = 5;      // 0101
        x &= 3;         // x = 5 & 3 = 1
        System.out.println("After &= : x = " + x);

        // 9. OR Assignment (|=)
        int y = 5;      // 0101
        y |= 3;         // y = 5 | 3 = 7
        System.out.println("After |= : y = " + y);

        // 10. XOR Assignment (^=)
        int z = 5;      // 0101
        z ^= 3;         // z = 5 ^ 3 = 6
        System.out.println("After ^= : z = " + z);

        // 11. Left Shift Assignment (<<=)
        int m = 5;      // 0101
        m <<= 1;        // m = 5 << 1 = 10
        System.out.println("After <<= : m = " + m);

        // 12. Right Shift Assignment (>>=)
        int n = 5;      // 0101
        n >>= 1;        // n = 5 >> 1 = 2
        System.out.println("After >>= : n = " + n);

        // 13. Unsigned Right Shift Assignment (>>>=)
        int p = 5;      // 0101
        p >>>= 1;       // p = 5 >>> 1 = 2
        System.out.println("After >>>= : p = " + p);

        // 14. Unsigned/Signed Right Shift Assignment (>>>= | >>=) on Negative Number
        byte Z = -128;
        Z = (byte) (Z>>>=1);
        System.out.println(Z);
        Z = (byte) (Z>>=1);
        System.out.println(Z);
    } 
}
