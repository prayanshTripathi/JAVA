package intermediate.object;

public class CallByValueNDReference {
    public static void main(String[] args) {
        // Call By value 

        int x = 4;
        int y = 6;
        

        System.out.println("x = " + x + " , y = " + y); // x = 4, y = 6

        addTen(x, y);

        System.out.println("x = " + x + " , y = " + y); // x = 4, y = 6


















        



        // Call by Reference - There In Java, Concept of Call By Reference Isn't Exist.
        // Below Code Is Properly Working But At a Instance, It's Also Uses Call By Value.


        Random r1 = new Random(13,5);
        Random r2 = new Random(r1); // Deep Copy
        // Value Of r1 Is Copied In r2, using copy constructor.
        // Here in abovve case, if we change any value of r2 object then it cannot
        // reflect into r1, both objects are seperated.
        Random r3 = r1; // Shallow Copy
        // but Above Line will do this -> make a reference variable on stack and 
        // it will point to the object actual memory location on heap. 
        // it saves the same address as the r1 reference variable. 
        // both points on same location.





        System.out.println("x = " + r1.x + " , y = " + r1.y);

        addTen2(r1);

        System.out.println("x = " + r1.x + " , y = " + r1.y);



    }

    static void addTen(int x, int y){
        x += 10;
        y += 10;
    }


    static void addTen2(Random r){
        r.x += 10;
        r.y += 10;
    }


    // You Can Also Take Any Class As A Returntype
    static Random addTen3(Random r){
        r.x += 10;
        r.y += 10;
        return r;
    }


}



class Random{
    int x;
    int y;

    public Random(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy Constructor
    Random (Random r){
        this.x = r.x;
        this.y = r.y;
    }



    
}



/*
Ques: Java is ________________ ?
1. Call By Value
2. Call By Reference

ans: Call By Reference.








*/