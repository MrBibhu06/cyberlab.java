import java.util.Scanner;
public class Lopping3 {
    public static void main(String[] args) {
        int num,rem;
        int var=1;
        System.out.print("Enter the number=");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        while (num>0){
            while (num!=0){
                rem=num%10;
                var=(var*10)+rem;
                num=num/10;

            }
            System.out.println(var);

        }


    }
}