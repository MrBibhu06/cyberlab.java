import java.util.Scanner;

public class conditional2 {
    public static void main(String[] args) {
     int year;
        System.out.println("enter the year:");
        Scanner obj=new Scanner(System.in);
        year=obj.nextInt();
        if(year%4==0){
            System.out.println("it is a leap year");
        }
        else {
            System.out.println("it is not a leap year");
        }
    }
}
