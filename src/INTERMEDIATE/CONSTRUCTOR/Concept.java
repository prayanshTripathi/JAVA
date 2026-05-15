package intermediate.constructor;

public class Concept {
    public static void main(String[] args) {
        // Constructor


        int x = 5; // Local Variable, NO Default Values.
        // It Stores In stack On compile-time.



        // Student s1 = new Student();

        // // Default Values
        // System.out.println(s1.name); // null
        // System.out.println(s1.age); // 0
        // System.out.println(s1.rollNum); // 0
        // System.out.println(s1.collegeName); // null

        // s1.name = "Prayansh";
        // s1.age = 18;
        // s1.rollNum = 69;
        // s1.collegeName = "VISICS";
        

        // Constructor --> To Create an Object.
        Student s1 = new Student("Prayansh", 18, 69, "VISICS"); // Parameterised Constructor Called.

        System.out.println();
        System.out.println(s1.name); 
        System.out.println(s1.age); 
        System.out.println(s1.rollNum); 
        System.out.println(s1.collegeName);

        Student s2 = new Student(); // Default Constructor called






    }
}

/*
Instance Variables, Stores On Heap During Run-time.

Integers --> 0
floating --> 0.0
Boolean --> false
String --> null (nothing)




// Rules Of Constructor

-> Same name as class
-> No return type, not even void
->Automatically Called during object creation
-> used to initialize an object
->it can also be overloaded
-> Constructor is mandatory
-> if you didn't create any, then compiler creates a default one
  without any parameter and body. also it's hidden.
-> Default Constructor Will not created if you made any
   parameterised constructor, you need to create the dafault 
   constructor tooby your own.


*/
class Student {
    String name; // Information/data/characteristics --> instance variables
    int age; // These Instance Variable Have A Default Values.
    int rollNum;
    String collegeName;

    void markAttendance(){
        System.out.println(name + " Is Present"); // Function --> Method
    }

    // // making a hardcoded default Constructor
    // Student (){
    //     name = "Aditya";
    //     age = 29;
    //     rollNum = 20;
    //     collegeName = "VISICS";
    // }


    // Parameterised Constructor
    Student(String n, int a, int rn, String c){
        name = n;
        age = a;
        rollNum = rn;
        collegeName = c;
    }

    Student(){ // user defined default constructor.
        // Nothing...
    }


}



/*
Interview Oriented Question - 
1. Can We Call the constructor manually?
ans-
NO, we need to create a object to call the constructor.


2. What If on run-time the heap memory are full, but we need to create an object ?
ans-
the terminal/compiler shows an exception --> Not Enough Space In Heap.



*/