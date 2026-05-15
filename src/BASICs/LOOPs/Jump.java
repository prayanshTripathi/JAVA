package basics.loops;

public class Jump {
    public static void main(String[] args) {
        // Jumo Statments In Java
        // break; & continue;


        // boolean b = true;
        for (int i=1; i<=10; i++){
            System.out.println(i);

            if(i>5){
                break;
            }
        } // 1 2 3 4 5 6



        // break use-case
        // wheather a number is prime or not
        int p = 11;
        boolean isPrime = true;
        for (int i=2; i<p; i++){
            if ((p%i)==0){
                isPrime = false;
                break;
            }
        }

        if (isPrime == true) {
            System.out.println("The Number Is Prime");
        }
        else {
            System.out.println("The Number Is Not Prime");
        }



        System.out.println();
        // continue use-case
        // printing odd numbers
        for (int i = 0; i < 10; i++) {
            if ((i%2)==0) {
                continue;
            }
            System.out.println(i);
        }




        for (int i=0; i<10; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" *");

                if (j >= 5){
                    break;
                }
            }
            System.out.println();
        }
        /*

         *
         * *
         * * *
         * * * *
         * * * * * 
         * * * * * *
         * * * * * * 
         * * * * * *
         * * * * * *
         * * * * * *
        
        */



        // for (int i=0; i<10; i++){
        //     for (int j=0; j<=i; j++){
        //         System.out.print(" *");

        //         if (j >= 5){
        //             continue;
        //         }
        //     }
        //     System.out.println();
        // }
        /*
        
        * 
        * * 
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * * 
        */






        // // Labels
        // outer: for (int i=0; i<10; i++){
        //     inner: for (int j=0; j<=i; j++){
        //         System.out.print(" *");

        //         if (j == 5){
        //             break outer;
        //         }
        //     }
        //     System.out.println();
        // }






        // Can Label Code Blocks
        first: {
            second: {
                third: {
                    System.out.println("Hello World");
                    break first;

                }
            }
        }







    }
}
