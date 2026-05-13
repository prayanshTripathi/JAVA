package BASICs.FUNCTIONs;

public class Function {
    public static void main(String[] args) {
        /*
        Types of Function

        1. No I/P, No O/P
        2. I/P, No O/P
        3. No I/P, O/P
        4. I/P, O/P
        */

        greet();
        sayHii("Prayansh");
        System.out.println(getNumber());
        System.out.println(mul(17, 2));


        getNumber(); // Can Be Writting Like This But It Didn't Do Anything. As It's Value Didn't Stored Anywhere Or Nothing Happend Else.


        return; // Can write return here to but its not mattered.

    }

    // No I/P, No O/P
    static void greet(){
        System.out.println("Hello");
        return;// Optional to write
    }

    // 2. I/P, No O/P
    static void sayHii(String name){ // Number of parameter can be anything.
        System.out.println("Hii " + name);
    }

    // 3. No I/P, O/P
    static int getNumber(){
        return 10;
    }

    // 4. I/P, O/P
    static int mul(int a, int b){
        return (a * b);
    }
}
