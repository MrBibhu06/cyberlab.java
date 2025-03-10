import java.util.Scanner;
public class conditional5 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter three numbers:");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b= obj.nextInt();
        c=obj.nextInt();
        if(a==b && a==c){
            System.out.println("Equilateral triangle");
        }
        else if(a==b && a!=c || a!=b && a==c){
            System.out.println("Isoscale triangle");
        }
        else{
            System.out.println("scalen triangle");

        }
    }
}
