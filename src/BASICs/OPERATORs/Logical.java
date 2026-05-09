package BASICs.OPERATORs;

public class Logical {
    public static void main(String[] args) {
        // Logical Operators
        // &&, ||, 
        int a = 5;
        int b = 10;
        int c = 15;

        boolean d = (a < b) && (b < c); // Here The Compiler checks one expression, if it written -> False then it directly return False. Called Short-Circuit 
        System.out.println(d);
        d = (a < b) || (b < c); // Here The Compiler checks one expression, if it written -> True then it directly return True. Called Short-Circuit 
        System.out.println(d);

        // To Avoid Short-Circuiting In Expressions We Use Urinary AND(&) & OR(|) Operators.
        // It Also Works Perfectly With Expressions. It Evaluates both Expression Then Returns Final Output.









        // Assignment Operator
        // = 
        // a = b; // It Means Write Value Of b in a.
        // a = b = c = d = 10; // Can be Looped
        // Goes From Most-Left To Right









        // Ternary Operator
        // It is used Between 3 Operands.
        // We Will read It In If-Else 




        // Operator Precedence
        // 1. Operator precedence determines the order in which operations are evaluated in an expression.
        // 2. Higher precedence operators are evaluated before lower precedence operators.
        // 3. Precedence Order (Highest to Lowest):
        //    - Postfix (++, --)
        //    - Unary (+, -, !, ~, ++pre, --pre)
        //    - Multiplicative (*, /, %)
        //    - Additive (+, -)
        //    - Shift (<<, >>, >>>)
        //    - Relational (<, >, <=, >=, instanceof)
        //    - Equality (==, !=)
        //    - Bitwise AND (&)
        //    - Bitwise XOR (^)
        //    - Bitwise OR (|)
        //    - Logical AND (&&)
        //    - Logical OR (||)
        //    - Ternary (?:)
        //    - Assignment (=, +=, -=, *=, /=, %=, etc.)
        // 4. Operators with same precedence are evaluated left-to-right (Left Associativity).
        // 5. Parentheses () override precedence and group operations together.
        // Example: a + b * c  =>  a + (b * c)   // * has higher precedence than +
        //          (a + b) * c => Different result // Parentheses override precedence
        // 6. Assignment operators are right-associative: a = b = c => a = (b = c)


    }
    
}
