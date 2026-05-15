package intermediate.staticfinalargs;

public class StringArg {
    public static void main(String[] args) {
        
        System.out.println("Number of agrguments are " + args.length);

        for (int i=0; i<args.length; i++) {
            System.out.println("Argument " + i + " = " + args[i]);
        }

        // In Past time we use that string array of arguments to perform many functioning within that file.
        
        // we write in terminal like that -
        // javac StringArgs.java
        // java StringArgs Aditya Tiwari Mishra Ayush
        // the names in the above line after file name is values which will be stored in that 
        // string array of Args. and further we use these values for performing many functions 
        // from inside the class.

        // java StringArgs input.txt output.txt


        // We Will learn it in springboot.
    }
}
