package intermediate.pillars;

public class Abstraction {
    public static void main(String[] args) {
        /*
        Abstraction: 
        The Process Of Focusing on what something does, while 
        ignoring how it does that.
        
        -> Represent Whatever Necessary.
        -> Even what we model, we dont want everyone to know how everything works,
           but they can still Use It.


        In JAVA Abstraction Itself Divided into Two types-

        1. Low level Abstraction - Hiding Implementation Details
        2. High level Abstraction - Seperate What from How
        */


        // 1. Low Level Abstraction.
        // Automatically Done By Encapsulation.
        Car c1 = new Car();

        c1.type = "XUV";

        c1.start(); // What
        c1.accelerate();
        c1.brake();






        System.out.println();

        /*
        2. High Level Abstraction -

        We Use Inheritance Concept To Make A High Level Abstraction.

        We Inherit 2 Childs of car
        -> FuelCar
        -> ElectricCar

        The Common Part Of The Both Cars Can Be Written In Car (Parent Class) 
        And The Different Methods Can Be Called Through May From Car (Parent Class) 
        or FuelCar/ElectricCar (Child Classes)




        Abstract Class:
        its a concept of making any method only Declare in a class and define 
        somewhere in their child classes. By Making any method abstract, that 
        particular class becomes Abstract. 
        > We cannot make a object of a abstract class.
        > Abstract class can Be nested.
        */

        FuelCar c2 = new FuelCar();

        c2.start();
        c2.accelerate();
        c2.brake();



        System.out.println();

        ElectricCar c3 = new ElectricCar();

        c3.start();
        c3.accelerate();
        c3.brake();









    }
}


/*

Concrete Class:

Means The What and How of any class are tightly coupled. 
if i call start() it leads me to the start method in the class.
so if, i made a start method for any class like FuelCar, And now 
i Have A Electric Car too, then I Need to Make A ANother class name 
ElectricCar. And In that Class i need to make another method start(), 
because internal working of both methods are different. 

*/
class Car {
    String type;

    void start (){ // How 

    }

    void accelerate (){

    }

    void brake (){

    }



}







// Abstract Class
abstract class Car1 {

    void start(){
        System.out.println("Car Starts......");
    }

    abstract void accelerate ();

    abstract void brake();

}


class FuelCar extends Car1{

    @Override
    void accelerate() {
        System.out.println("Fuel Car Is Accelerating...");
    }

    @Override
    void brake(){
        System.out.println("Fuel Car Applied Brake !");
    }

    
}

class ElectricCar extends Car1 {


    @Override
    void accelerate (){
        System.out.println("Electric Car Is Accelerating...");
    }

    @Override
    void brake(){
        System.out.println("Electric Car Applied Brake !");
    }
}