import java.util.Scanner;
public class angle {
    public static void main(String[] args) {
        int b,h;
        System.out.println("triangle OPERATION:");
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Length: ");
        h= obj.nextInt();
        System.out.println("Enter breath:");
        b= obj.nextInt();


       float a= 0.5f*h*b;
        System.out.println(a);
    }
}