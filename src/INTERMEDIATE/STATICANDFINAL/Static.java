package INTERMEDIATE.STATICANDFINAL;

public class Static {
    public static void main(String[] args) {
        

        Student s1 = new Student();

        s1.name = "Prayansh";
        s1.collegeName = "VISICS";
        System.out.println("Name: " + s1.name + ", College Name: " + s1.collegeName);
        System.out.println();
        Student.collegeName = "DAMS";
        System.out.println("Name: " + s1.name + ", College Name: " + Student.collegeName);
        System.out.println();

        s1.markAttendance();
        Student.markAttendance();
    }
}

/*
Case -> If all objects(student have) same college name. Then For each object
        there will be different collegeName Property(Variable) Will be made.

SO, We Use static Keyword To Make Property Which Not Further A Property Of 
Object, It Become Property Of Class (It Will be Common For Every Objects).

When We apply static keyword to any property, thaat property(Variable) will 
come out of the object. We read the correct location on which the static will 
store in Memory Management.

> static keyword are also used on the methods of the object, then it becomes  
  method of class.


Rules For static Method -
> Any static Method can only call another static method
 -> Because, static method is class specific but the no-static method is object specific
> static method can only use static variables.
> Doesn't Have Access To this Keyword, if we marked static.
 -> because, this keyword stores reference of current object.
> Pramaters Are Not allowed to be static. because it is local to that method(function)
  in which it is declared.
> A Root level class cannot be static. but a nested class can be. (Rool level means, in level of default class of file.)


static Block -
> A block of code where we can assign value to static properties(Class Properties)
> on compiling, compiler first read full class and also execute the static block 
asisignments, then it will proceed to make any objects of that class.




*/

class Student {
    String name;
    int age;
    int rollNum;
    static String collegeName;
    static int grade;

    static void markAttendance (){
        System.out.println("Present");
    }



    Student() {
    }

    Student (String name, int age, int rollNum){ 
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }

    // static Block
    static {
        collegeName = " VISICS";
        grade = 8;
    }

}