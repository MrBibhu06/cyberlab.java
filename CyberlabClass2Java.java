import java.util.Scanner;

public class CyberlabClass2Java {
    public static void main(String[] args) {
       // CTO = Class through Object

        /*
        there are 4 ways of input in java
        1. Using Scanner Class
        2. Using Buffered Reader Class
        3. Using Function Argument
        4. Using CLI
         */

        //syntax to create object:
        //CLass_name objectname = new Class();


         /*
             integer input   = object.nextInt();
             float input = object.nextFloat();
             double input = object.nextDouble();
             char input = object.next();
             string input = object.nextLine();
          */


        Scanner input = new Scanner(System.in); //object Created
        System.out.println("Enter two number");
        int a = input.nextInt();
        int b = input.nextInt();

        int ans = a + b;

        System.out.println("The sum of "+a+" and "+b+"is :- "+ans);





    }

}
