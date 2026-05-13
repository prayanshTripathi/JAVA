package BASICs.FUNCTIONs;

public class Scope {

    // global scope
    static String name = "Prayansh";



    public static void main(String[] args) {
        // Scope Of a Variable
        // variables declared inside any function or code blocks are have local scope of their first curly braces open & close

        int a = 23;
        int b = 22;

        System.out.println(a + " , " + b);

        fun();

        if (a == 23) {
            int j = 45;
            System.out.println(j);
        }

        // j = 12; Because The Scope of j variable is only in the curly braces of if block. 

        System.out.println(name);






    }

    static void fun(){
        int a = 23;
        int b = 22;
        System.out.println(a + " , " + b);
        // System.out.println(a + " , " + b); it gives error of scope, cause the a & b are declared in main function.

        System.out.println(name);



    }
}
