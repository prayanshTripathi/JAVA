package intermediate.pillars;

public class Polymorphism {
    public static void main(String[] args) {
        

        // Compile-time Polymorphism -> Method Overloading
        // Human h1 = new Human();

        // h1.run();
        // h1.run(true);







        // Run-time Polymorphism --> Method Overridding

        Dog d1 = new Dog();
        Duck du1 = new Duck();
        Human h1 = new Human();

        d1.run();
        du1.run();
        h1.run();


    }
}
/*
Polymorphism:

Same Object Behaves Or Response Differently On same command 
if one paramter are changed.

1st Type of Polymorphism is expessed by Method Overloading.
> Also Called -> Compile-time Polymorphism

2nd Type of Polymorphism is expressed by Method Overridding 
> also called -> run-time polymorphism
> Static --> They Belong to class not to objects.
> Private methods cannot be oversidden.
> Final Methods Cannot Be Overridden, Specifically We Use 
  Final To Avoid Over-ridding on that particular.
> Fields/Variables -> They Cannot Be Polymorphic.

-> By Using Final Keyword On class, then we cannot create object of that class.










*/

// Compile-time Polymorphism -> Method Overloading
// class Human {

//     void run(){
//         System.out.println("Human is Running At 2Km/h Speed.");
//     }

//     void run(boolean isDogBehind){
        
//         if (isDogBehind == true){
//             System.out.println("Human is Running At 5Km/h Speed");
//         }
//         else {
//             System.out.println("Human is Running At 2Km/h Speed.");
//         }
//     }
// }



abstract class Animal {

    abstract void run();

}


class Dog extends Animal {
    
    void run(){
        System.out.println("Running On 4 Paws");
    }    
}

class Duck extends Animal {

    void run(){
        System.out.println("Running With 2 Small Paws");
    }
}

class Human extends Animal {

    void run (){
        System.out.println("Running On 2 Feets");
    }

}