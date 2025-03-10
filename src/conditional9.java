import java.util.Scanner;

public class conditional9 {
    public static void main(String[] args) {
        int unit;
        String name;
        System.out.println("enter the consumer name:");
        System.out.println("enter the unit consumed the user:");
        Scanner obj=new Scanner(System.in);
        unit= obj.nextInt();
        name=obj.nextLine();
        if(100+unit == unit+5.50){
            System.out.println("the toatl amount:"+100*5.50);
    }
}
