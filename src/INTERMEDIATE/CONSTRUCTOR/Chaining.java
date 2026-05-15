package intermediate.constructor;

public class Chaining {
    public static void main(String[] args) {
        

        Student s1 = new Student();
        // Student s2 = new Student("Prayansh");
        // Student s3 = new Student("Prem", 18);
        // Student s4 = new Student("Nipurn", 18, 37);
        // Student s5 = new Student("Singh", 18, 64, "VISICS");


        System.out.println(s1);
    }
}



class Student {
    String name; // instance variables
    int age; 
    int rollNum;
    String collegeName;

    void markAttendance(){
        System.out.println(name + " Is Present"); 
    }

    Student() {
        // this("Unknown", 0, 0, "Unknown");
        this("Unknown");
        System.out.println("I'm in Frist Constructor");
    } //Default Variable


    Student(String name){ 
        // this(name, 0, 0, "Unknown");
        this(name, 0);
        System.out.println("I'm in Second Constructor");
    }

    Student(String name, int age){ 
        // this(name, age, 0, "Unknown");
        this(name, age, 0);
        System.out.println("I'm in Third Constructor");

    }

    Student(String name, int age, int rollNum){ 
        // this(name, age, rollNum, "Unknown");
        this(name, age, rollNum, "Unknown");
        System.out.println("I'm in Fourth Constructor");
    }

    Student(String name, int age, int rollNum, String collegeName){ 
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.collegeName = collegeName;
        System.out.println("I'm in Fifth Constructor");
    }

    


}