package basics.operators;

public class Arithmetic {
    public static void main(String[] args) {
        // Arithmetic Operators In JAVA
        // Five Types Of Arithmetic Operators
        // +, -, *, /, %

        int a = 15,b = 5;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        System.out.println(c + " , " + d + " , " + e + " , " + f + " , " + g);



        // +=, -=, *=, /=, %=
        int h = a + 2;
        System.out.println(h);
        // h = h + 2; //In Programming this is okay
        h += 2;
        System.out.println(h);
        h -= 2;
        System.out.println(h);
        h *= 2;
        System.out.println(h);
        h /= 2;
        System.out.println(h);
        h %= 2;
        System.out.println(h);



        // --, ++ --> Increment & Descrement Operator
        int i = 6;
        i++; // i = i + 1     // i += 1
        System.out.println(i);
        i--; // i = i - 1     // i -= 1
        System.out.println(i);



        // Post Increment/Decrement
        int j = 10;
        j++;
        j++;
        System.out.println(j++);
        System.out.println(j);

        // Pre Increment/Decrement
        int k = 37;
        System.out.println(--k);
        System.out.println(++k);
        System.out.println(--k);

        // j = 13
        int p = --j;
        System.out.println(p);
        int q = j++;
        System.out.println(q);
        int r = j;
        System.out.println(r);

        

    }
}
