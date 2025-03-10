import java.util.Scanner;

public class conditional7 {
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number:");
        Scanner obj=new Scanner(System.in);
        num= obj.nextInt();
        if(num%2==0){
            System.out.println("the number is divisible by number");
        }
        else {
            System.out.println("the number is not divisible by number");
        }
    }
}
