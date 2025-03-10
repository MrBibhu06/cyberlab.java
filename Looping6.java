import java.util.Scanner;

public class Looping6 {
    public static void main(String[] args) {
        int num, sum = 0, temp;
        System.out.print("Enter the number=");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        temp = num;
        while (temp != 0) {
            sum =sum+temp % 10;;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println("niven number");
        } else {
            System.out.println("not niven number");
        }



    }
}