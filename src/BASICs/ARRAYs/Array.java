package basics.arrays;

public class Array {
    public static void main(String[] args) {
        // array: Collections of a datatype.
        // It has contigeous memory.
        // 1-D Array --> Array Of int

        // int arr[]; // Declaration
        // arr = new int[3]; // Definition

        int[] rollNum = new int[3];// Declaration & Definition

        rollNum[0] = 101; // Assigning Value.
        rollNum[1] = 102; 
        rollNum[2] = 103; 

        // Also Can Declared by below method, used only if we know the actuall data on time of declaration;
        // int rollNum = {4, 5, 6};

        System.out.println(rollNum[0]); // Printing


        // Assigning Value In An Array Using for Loop
        int x = 101;
        for (int i = 0; i < 3; i++){
            rollNum[i] = x;
            x++;
        }

        // Printing Array
        System.out.println();
        for (int i = 0; i < rollNum.length; i++) {// rollNumber.lenght -> Return The Number Of Variable In A Array, Not The Index Value.
            System.out.println(rollNum[i]);
        }

        // Exceptions - Its The way of the compiler to tell the programmer that i got an issue to run this program.
        // System.out.println(rollNum[3]); // It will throw an exception.
        // Exceptions -> Index out of bound.


        





        // Above We Talk About 1-D Array

        // Multi-Dimentional Array.
        // 2-D Array --> Array Of Arrays.
        // int studMark[][] = new int[3][3];
        int[][] marks = new int[3][3];

        marks[0][0] = 50; // There Are Different Values
        marks[0][1] = 30;
        marks[0][2] = 70;
        marks[1][0] = 30;
        marks[1][1] = 80;
        marks[1][2] = 70;
        marks[2][0] = 10;
        marks[2][1] = 60;
        marks[2][2] = 50;


        // Also Can Declared by below method, used only if we know the actuall data on time of declaration;
        // int rollNum = {{4, 5, 6}, {1, 2, 3}, {7, 8, 9}};


        System.out.println();
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        // We can apply .length on any below statement
        // marks.lengh
        // marks[row].length
        // marks[0].length
        // marks[1].length
        // marks[2].length



        // Array with different coloums in particular row
        // Array can be unformatted.

        // int[][] num = new int[3][];
        int num[][] = new int[3][];
        num[0] = new int[3]; // 1st row have size 3
        num[1] = new int[4]; // 2nd row have size 4
        num[2] = new int[2]; // 3rd row have size 2
        // Graphical Representation
        /*       0  1  2  3
            0    [] [] [] 
            1    [] [] [] []
            2    [] []
        */

        num[0][0] = 40;
        num[0][1] = 40;
        num[0][2] = 40;
        num[1][0] = 40;
        num[1][1] = 40;
        num[1][2] = 40;
        num[1][3] = 40;
        num[2][0] = 40;
        num[2][1] = 40;

        // Printing
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }


        // 3-D Array
        int arr[][][] = new int[3][3][3];

        // We Can Make Array With Unlimited Dimentions, Conceptually

    }
}
