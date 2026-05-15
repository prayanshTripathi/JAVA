package intermediate.pillars;

// Here In below line we cannot use private/ protected access modifier in place of public.
// Why Not Private ? --> if we ask that let it be a private class but in whome respect it is private for. so that's why we cannot write any class private in root level of any package. nested classes can use private.
// Why not protected ? --> it is generally used for concept of inheritance but in Inheritance we can only be able to Inherite the Variables and methods of the class. cannot able to inherit a full class as at is.
public class Encapsulation {
    public static void main(String[] args) {
        /*
        Encapsulation
        > Both Data & Behaviour Should be together (encapsulated) within a object.
        > We Should not provide unrestricted access of data.
        
        -> If we made a real world object in programming as a class.
          let it be a Bank Account- so if we write ths properties of this then,
          ant body can access the properties by making object of the class and change
          their data without any restrictions.
        -> for countering this scenario we Learn About Access Modifiers.

        Access Modifiers
        this is used to access the data in the class by an object.
        We Can Use them in any place - in front of class/variables/constructors/methods.
        We have 4 types of access modifiers in JAVA-
        1. public
        2. default
        3. protected
        4. private
        
        1. Private: It is the most restricted access modifier,
           > By using this, you can use that variable only inside that class, not 
             even have access to the child class.
        
        2. Default: Anyone can access belonging to that package.    
           > Package:- A Package group similar classes/Interfaces together.
           > if you cannot use any access modifier then compiler will use
             this -> default access modifier.

        3. Protected: Can Accessed By Same Package or Any Inherited class (child class)

        4. Public: Anyone Can Access From Anywhere In The Codebase.
        
        
        
        





        */


        bankAcc b1 = new bankAcc();

        // b1.bal = 10000; error -> bal has a private access in bankAcc;

        b1.deposit(100);

        b1.getBal();



    }
}


class bankAcc {
    private double bal = 0;

    void withdraw(int x) {
        if (x >= bal) {
            bal -= x;
        }
        else {
            System.out.println("Not Enough Money");
        }
        
        // More Restrictions Are Added In Real Business logic.
    }

    void deposit(int x) {
        bal += x;
    }

    // getters / setters
    void getBal (){
        System.out.println(bal);
    }

}



class Student {
    private String name;
    private int age;
    private int rollNum;
    private String college;

    Student (String name, int age, int rollNum, String college) {
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.college = college;
    }
    // getters / setters
    // --> it give us more control about the getting and setting values/data
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCollege (String college){
        // here we can add validations --> college must be real
        this.college = college;
    }



}