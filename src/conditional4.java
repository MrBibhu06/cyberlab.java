import java.util.Scanner;

public class conditional4 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three numbers:");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b= obj.nextInt();
        c=obj.nextInt();
        if(a>b && a>c){
            System.out.println("A is max");
        } else if(b>a && a>c) {
            System.out.println("B is max");
        }
        else {
            System.out.println("c is max");
        }
    }
}
