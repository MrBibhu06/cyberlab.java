import java.util.Scanner;

public class Looping4 {
    public static void main(String[] args) {
        int num;
        int digit=1;
        System.out.print("Enter the number=");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        while (num>0){
            int rem=num%10;
            digit=digit*rem;
            num=num/10;

        }
        System.out.println(digit);
    }
}