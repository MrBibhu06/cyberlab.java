import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        int num,i;
        System.out.println("Enter the number=");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        for (i=1;i<=num;i++){
            System.out.println(i);
        }
    }
}