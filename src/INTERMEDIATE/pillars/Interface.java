package intermediate.pillars;

public class Interface {
    public static void main(String[] args) {
        
        FuelCar c1 = new FuelCar();

        c1.start();
        c1.accelerate();
        c1.brake();


        System.out.println();
        ElectricCar c2 = new ElectricCar();

        c2.start();
        c2.accelerate();
        c2.brake();

    }
}

/*
Interface:

It Tells about responsibity/capable of anything

like if any Car Needs to be a car then it must be able to define what 
in interface is declared. like start, accelerate, brake, etc.
> We Use It To Do Multiple Inheritance. Learn later.
> every Method of interface is by default public, so we need to 
  expilicitly do each method public in implementing class.






Abstract Class: Family Of Similar Object.


*/

// Pure Abstraction
// Pure What ?
interface Car {

    void start();
    void accelerate();
    void brake();

}

class FuelCar implements Car{

    @Override
    public void start() {
        System.out.println("Fuel Car Has Started");
    }

    @Override
    public void accelerate() {
        System.out.println("Fuel Car Accelerated...");
    }

    @Override
    public void brake() {
        System.out.println("Fuel Car Applied Brake !");
    }

    
    
}

class ElectricCar implements Car{

    @Override
    public void start() {
        System.out.println("Electric Car Has Started");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric Car Accelerated...");
    }

    @Override
    public void brake() {
        System.out.println("Electric Car Applied Brake !");
    }

    
}