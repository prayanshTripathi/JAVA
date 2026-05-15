package intermediate.constructor;

public class This {
    public static void main(String[] args) {
        
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

    Student(String name, int age, int rollNum, String collegeName){ 
        // We Had a convention in java for better programming to 
        // use the paramter's name of the constructor to be same 
        // as instance variables. but it will give an error, so we use "this"
        // keyword to make it work properly.
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.collegeName = collegeName;
    }

    Student(){ // user defined default constructor.
        // Nothing...
    }


}
