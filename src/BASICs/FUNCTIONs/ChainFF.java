package basics.functions;

public class ChainFF {
    public static void main(String[] args) {
        // Chaining Of Function

        first();

    }

    static void first(){
        System.out.println("First Function Is Called");
        second();
    }

    static void second(){
        System.out.println("Second Function Is Called");
        third();
    }

    static void third(){
        System.out.println("Third Function Is Called");
        // first(); // If We Add This Then It Will Be A Infinit Loop Of Function Calling.
        return;
    }
}
