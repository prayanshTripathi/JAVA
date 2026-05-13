package BASICs.FUNCTIONs;

public class Overloading {
    public static void main(String[] args) {
        // Function Overloading

        System.out.println(sum(4, 19));
        System.out.println(sum(76, 154));
        System.out.println(sum(34, 9));
        System.out.println(sum(87, 12));

        System.out.println(sum(10, 5, 23));
        System.out.println(sum(98, 56, 213));

        System.out.println(sum(87.678, 12.2389));
        System.out.println(sum (0.54, 123.213));

        greet(18, "Prayansh");
        greet("Prayansh", 18);





    }

    static int sum(int a, int b){ 
        return (a + b);
    }

    static int sum(int a, int b, int c){ 
        return (a + b+ c);
    }

    static int sum(double a, double b){ 
        return (int)(a + b);
    }

    static void greet(String name, int age){
        System.out.println("Hii " + name + " Your Age Is " + age);
    }

    static void greet(int age, String name){
        System.out.println("Hii " + name + " Your Age Is " + age);
    }

    static void fun(){
        System.out.println("hello");
    }
    // We cannot Overload Functions On Basis Of Returntype of the function
    static int fun2(){ 
        System.out.println("hello");
        return 5;
    }
}
