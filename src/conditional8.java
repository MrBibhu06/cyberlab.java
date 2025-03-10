import java.util.Scanner;

public class conditional8 {
    public static void main(String[] args) {
        int per;
        System.out.println("Enter the student percentage:");
        Scanner obj=new Scanner(System.in);
        per= obj.nextInt();
        if(per>60){
            System.out.println("1st division");
        }
        else if (per>50) {
            System.out.println("2nd divisiion");
        }
        else if (per>35) {
            System.out.println("3rd divisiion");
        }
        else {
            System.out.println("fail");
        }
    }
}
