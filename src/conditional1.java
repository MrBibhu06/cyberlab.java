import java.util.Scanner;
public class conditional1 {
    public static void main(String[] args) {
        int n;
        System.out.println("enter any number:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        if(n%2==0){
            System.out.println("it is a even num");
        }
        else{
            System.out.println("it is a odd num");
        }

    }
}