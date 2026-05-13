package INTERMEDIATE.OOP;


// JAVA Is Almost Fully Object Oriented Language.
public class Concept {
    public static void main(String[] args) {
        // OOP --> Object Oriented Programming
        /*
        task -> to store students data 

        Problems:
        > Need A lot of independent 
          variable to represent one student.
        > If i pass the student to a function 
          i need to pass all 4 variables.
        > I need to create new set of variables for new student.
        > No Authority Over data.

        To fix these issues we learn OOP
        */

        // OOP is a programming Paradigm. 
        // Definition: 

        // Class: Blueprint Which Includes Property(Variables/Data) And Methods(Functions).
        // Classes are User-defined datatype.
        // Objects: Its A Instance of the class, A Copy of the property's structure with different values and same methods.
        // objects are Non-primitive Datatypes. And It Uses Heap Memory.


        Student s1 = new Student();
        // Here s1 is just a reference variables creates on stack and point to an actual object stored in heap. by the way the actual object which was stored in heap, or anything stores in heap, has no name. simple unnamed.
        // Memory allocation through new keyword is done on run-time. also called dynamic memory allocation.
        // memory allocation on compile-time is called static memory allocation.

        s1.name = "Prayansh";
        s1.age = 18;
        s1.rollNum = 69;
        s1.collegeName = "VSICS";

        Student s2 = new Student();

        s2.name = "Prem";
        s2.age = 18;
        s2.rollNum = 70;
        s2.collegeName = "VSICS";


        // System.out.println("Name: " + s1.name + ", Roll Number: " + s1.rollNum + ", Age: " + s1.age + ", College Name: " + s1.collegeName);
        // System.out.println("Name: " + s2.name + ", Roll Number: " + s2.rollNum + ", Age: " + s2.age + ", College Name: " + s2.collegeName);
        s1.print();
        s2.print();


        // As we are mimicing the real-world senario of representing the Abstract Types Like - Animal, Humans, etc.
        // They have their characterstics like (type, breed, colour, no. of legs, etc), in programming we call it properties(data/variables).
        // they have their behaviours like (they can walk, can eat, can jump, can roar, etc), in programming we call it methods(Functions).
        // We Can ALso create a class for non-living things like bank, location, etc.

        System.out.println();
        s1.markAttend();

    }  
}


class Student{
    String name;
    int rollNum;
    int age;
    String collegeName;

    void markAttend(){
        System.out.println(name + " is Present");
    }

    void print(){
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("College Name: " + collegeName);                System.out.println();
    }
};
