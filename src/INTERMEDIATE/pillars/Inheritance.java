package intermediate.pillars;

public class Inheritance {
    public static void main(String[] args) {
        /*
        Inheritance 
        -> Advantage of Inheritance -
           > Code Reuseablility 
           > Supports Polymorphism
        
        */



        Car c1 = new Car();

        c1.start();
        c1.getClass();



        EngineeringStudent es1 = new EngineeringStudent();

        es1.name = "Prayansh";
        es1.age = 18;

        es1.markAttendance();
        es1.attendLab();
        



        // Super keyword uses

        EngineeringStudent es2 = new EngineeringStudent();

        es2.name = "Prem";
        es2.age = 18;
        es2.rollNum = 70;
        es2.college = "VISICS";

        System.out.println();
        es2.print();




    }
}

class Vehical {
    int noOfTyres;

    void start(){ // start is vehical specific method
        System.out.println("Vehical Is Started");
        // code
    }
}


class Car extends Vehical {

    void setGear(){ // setGear is car specific method.

    }
}




class Student { // Parent

    String name;
    int age;
    int rollNum;

    protected void markAttendance(){
        System.out.println("Attendance Marked");
    }
}


class EngineeringStudent extends Student{ // Child

    String college;
    void attendLab () {
        System.out.println("Attends Lab");
    }

    // super keyword use.
    void print(){
        System.out.println(name + " , " + super.age + " , " + super.rollNum + " , " + college);
    }
}


class CSEEngineeringStudent extends EngineeringStudent {
    void attendComLab (){
        System.out.println("Attended Computer Lab");
    }
}



/*
Types Of Inheritance:

1. Single/Simple Inheritance

A --> B


2. Multi-level Inheritance

A --> B, B --> C


3. Hierrarichal Inheritance

A --> B, A --> C


4. Multiple Inheritance (Not Supported In Java, Not Directly With Classes)

A --> C, B --> C (It is not Supported)



Why JAVA NOT supports multiple Inheritance?
asnwer: Diamond Problem !!

brief - if both parent class have one parent class and that gran-parent class have 
        a method named show(), it passes into its two child class but when it comes 
        to the child class of that two class, compiler will confused, whcih show() 
        methods we're calling .

Solution: We Further learn about interfaces, which is used to solve this problem.






Super keyword:
Reference of parent class. like this keyword which holds the reference of any object.
we can use super keyword just like this keyword to call parent class's properties/methods/constructor.








*/