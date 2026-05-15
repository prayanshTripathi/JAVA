package basics.variables;

public class VarStore {
    public static void main(String[] args) {
        
        // Float & Double Precisions
        float f = 0.7f; //  As we know float is single precision
        double d = 0.007; // Double Precision Works Better 

        System.out.println(f); // standard printting
        System.out.printf("%.20f%n",f); // "%.20f%n" this is fromatting of output, it shows the float value with 20 decimal places, for precisness.

        System.out.println(d); // standard printting
        System.out.printf("%.20f%n",d); 







        /*
        
        // Integers


        In case of Positivve Numbers The Compiler Do Exactly What Below Shown -

        byte b = 24;
        byte(decimal)  ->  binary  ->  store  ->  binary  ->  byte(decimal)  ->  print
        24  ->  0 0 0 1 1 0 0 0  -> stores in varibale (container) - b




        In Case Of Negative Numbers Compiler Follow This - 

        byte b = -24;
        byte(dec)  ->  binary  ->  2's compliment  ->  store  ->  binary  ->  2's compliment  ->  byte(dec)   -->  print
        
        // Storing - Write
        byte(dec)  ->  binary  ->  2's compliment  ->  store
        24 -> 0 0 0 1 1 0 0 0
        24 - 1'st compliment - 1 1 1 0 0 1 1 1 
        24 - 2'nd compliment - 1 1 1 0 1 0 0 0 
        -24  -->  (0 0 0 1 1 0 0 0)2  -->  (1 1 1 0 1 0 0 0)2 - 2nd Comp.  -->  Store
        

        // Accessing - Read
        store  ->  binary  ->  2's compliment  ->  byte(dec)   -->  print
        We have this in variable b -
        1 1 1 0 1 0 0 0 - 2nd Compl.
        MSB -> Most Significant Bit (Left Most Bit)    |  LSB -> Least Significant Bit (Right Most Bit)
        Our Compiler Check The MSB For Checking the stored number is positive or negative.
        If MSB = 1 Then, The Stored Number Is Negative.
        If MSB = 0 Then, The Stored Number Is Positive.

        If The Number Is Positive Compiler Directly Convert the Binary To Decimal And Then Print It.
        If The Number Is Negative then compiler will do 2's Compliment And Then shows the positive numbebr with a negative sign. 

        Interview Perspective Question - 
        Whats Need Of 2's compliment if we are able to do this same thing with 1's compliment only ?
        answer -
        in case of '-0' (actually not valid) if we use only 1's compliment so it will store it like  (1 1 1 1 1 1 1 1)2 - 1's compliment.
        in that case it will store '0' and '-0' in two different methods - actually its incorrect so, we decided to do 2's compliment. so it keeps give only one method to store 0 as in any way it will be written.











        // Floating Point Number

        float f = 8.125; // (32 Bits)
        _____     __________________________   _____________________________________________
        |  |      |                        |   |                                           |             
        1 Bit               8 Bit                                   23 Bit
        Sign Bit         Exponent                                  Mantissa

        A. Write/Store A Value In Float (8.125)

        1. Find The Binary Of The Literal
        2. Make It In The Form Of -
           | (1.xx) * 2^exponent |       --> 1.000001 * 2^3   // Here xx Is Mantissa
        3. Add Bias to the exponent.
           exponent+127 = value          --> 3+127 = 130
           Binary of value - _______     --> 10000010  // New Exponent Value
        4. Place Value In Memory.
        |0|  |1|0|0|0|0|0|1|0|  |0|0|0|0|0|1|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|
        (+)       exponent                      mantissa


        B. Read/Access The Value

        |0|  |1|0|0|0|0|0|1|0|  |0|0|0|0|0|1|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|0|
        We Perform Below Expression On The Above Stored Value
        (-1)^sign * (1 + Mantissa) * 2^(exp-bias)
        sign = 0/1 | Positive Num -> 0 | Negative Num -> 1
         



        double d = 32.5672; // (64 bit)
        sign bit -> 1 bit
        exponent -> 11 bit
        mantissa -> 52 bit



        at the end floating point datatypes, doesn't matter, its float or double at any end they give a estimated value of some numbers like 0.7
        for this we we will learn BigDecimal Later In the JAVA.

        */
    }
}
