package intermediate.constructor;

public class Overloading {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student("Prayansh");
        Student s3 = new Student("Prem", 18);
        Student s4 = new Student("Nipurn", 18, 37);
        Student s5 = new Student("Singh", 18, 64, "VISICS");




        
    }
}



class Student {
    String name; // instance variables
    int age; 
    int rollNum;
    String collegeName;

    void markAttendance(){
        System.out.println(name + " Is Present"); // Method
    }

    Student() {} //Default Variable


    Student(String name){ 
        this.name = name;
    }

    Student(String name, int age){ 
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, int rollNum){ 
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
    }

    Student(String name, int age, int rollNum, String collegeName){ 
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.collegeName = collegeName;
    }

    


}