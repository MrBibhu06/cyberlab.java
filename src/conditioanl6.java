import java.util.Scanner;

public class conditioanl6 {
    public static void main(String[] args) {
        float temp;
        System.out.println("enter the temp");
        Scanner obj=new Scanner(System.in);
        temp = obj.nextFloat();
        if(temp<15){
            System.out.println("it is cold");
        }
        else {
            System.out.println("it is hot");
        }
    }
}
