package intermediate.staticfinalargs;

public class Final {
    public static void main(String[] args) {
        

        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x =5;
        System.out.println(x);

    }
}

/*
FINAL (final) - 
It is made on the time of object creation.

It Can Be Used In Any Place.
> Variable
> Method
> Class
> Parameter
But The Rules For each are different.



Why Main Is Static In JAVA ?
> if the mai function would not be written as static, then 
  for coming into the main function we need to create a class object first.

Final f1 = new Final();
f1.main();

But When We Use static then, when compiler code in class to read the full 
class first and checks for static too and execute it.






*/

class Random {
    // WE Cannot be able to reassign this another value, it is hardcoded once 
    // in a code. But We Can Declare It Once In CLass and Assign Its Value 
    // From THe Constructor, But ALso Reassigning the PI In the Constructor ALso Not Possible.
    
    final double PI; 
    
    // Constant, Nomeclature -> All Capital Letters. example - PI / PI_VALUE.

    Random (){
        this.PI = 3.14;
    }

    // We Can Also A Variable Both -> static and final

    static final int myAge = 18;

    // Can Be Initialise in static block or firectly into declaration line.
    // static {
    //     myAge = 18;
    // }




    
}