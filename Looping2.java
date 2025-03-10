import java.util.Scanner;

public class Looping2{
    public static void main(String[] args) {
        System.out.print("Enter the range of number=");
        int i,num;

        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        for (i=1;i<=num;i++){
            if (i%2==0){
                System.out.println("Even number is="+i);
            }
        }
    }
}